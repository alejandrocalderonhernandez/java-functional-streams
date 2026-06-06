package com.debuggeandoideas.practices;

import com.debuggeandoideas.data.DBMusic;
import com.debuggeandoideas.dtos.Album;
import com.debuggeandoideas.dtos.Artist;
import com.debuggeandoideas.dtos.Song;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamPracticeSolution {

    // ════════════════════════════════════════════════════════════════
    // SOLUCIONES — Stream API
    // ════════════════════════════════════════════════════════════════

    /**
     * EJERCICIO 1 — FÁCIL
     * Ordenamos artistas por cantidad de álbumes de mayor a menor.
     */
    public List<String> getArtistsSortedByAlbumCountDesc() {
        return DBMusic.ARTISTS.stream()
                // comparingInt espera un int para comparar
                // negamos el tamaño para invertir el orden — sin el negativo ordenaría de menor a mayor
                .sorted(Comparator.comparingInt(artist -> -artist.getAlbums().size()))
                // una vez ordenados solo necesitamos el nombre — no el objeto completo
                .map(Artist::getName)
                // colectamos en una lista inmutable
                .toList();
    }

    /**
     * EJERCICIO 2 — FÁCIL
     * Verificamos si existe al menos un artista de Francia.
     */
    public boolean hasArtistFromFrance() {
        return DBMusic.ARTISTS.stream()
                // anyMatch para en cuanto encuentra el primero que cumple
                // no recorre toda la lista — es más eficiente que filter + count > 0
                .anyMatch(artist -> artist.getCountry().equals("France"));
    }

    /**
     * EJERCICIO 3 — FÁCIL
     * Buscamos el artista con el nombre más largo.
     */
    public Optional<String> getLongestArtistName() {
        return DBMusic.ARTISTS.stream()
                // primero extraemos los nombres para trabajar con Strings directamente
                // si no mapeamos aquí, tendríamos que hacer artist.getName().length() en el max
                .map(Artist::getName)
                // comparamos por longitud — max devuelve el String más largo según ese criterio
                // devuelve Optional porque el stream podría estar vacío
                .max(Comparator.comparingInt(String::length));
    }

    /**
     * EJERCICIO 4 — FÁCIL
     * Títulos de álbumes lanzados después del 2000, sin repetidos.
     */
    public List<String> getAlbumTitlesAfter2000() {
        return DBMusic.ARTISTS.stream()
                // aplanamos — cada artista tiene List<Album>, necesitamos un stream de álbumes
                .flatMap(artist -> artist.getAlbums().stream())
                // filtramos solo los posteriores al año 2000
                .filter(album -> album.getYear() > 2000)
                // extraemos el título — ya no necesitamos el objeto Album completo
                .map(Album::getTitle)
                // eliminamos títulos duplicados — puede haber álbumes con el mismo nombre
                .distinct()
                .toList();
    }

    /**
     * EJERCICIO 5 — FÁCIL
     * Canción con más reproducciones de todo el catálogo.
     */
    public Optional<Song> getMostReproducedSong() {
        return DBMusic.ARTISTS.stream()
                // primer nivel de aplanado — artistas → álbumes
                .flatMap(artist -> artist.getAlbums().stream())
                // segundo nivel — álbumes → canciones
                // después de esto tenemos un Stream<Song> plano con todas las canciones
                .flatMap(album -> album.getSongs().stream())
                // max con comparingInt sobre reproducciones
                // devuelve Optional porque el stream podría estar vacío
                .max(Comparator.comparingInt(Song::getReproductions));
    }

    /**
     * EJERCICIO 6 — INTERMEDIO
     * Verificamos que ningún artista de Jazz sea de fuera de USA.
     */
    public boolean noJazzArtistOutsideUSA() {
        return DBMusic.ARTISTS.stream()
                // primero filtramos solo Jazz — reducimos el stream antes de evaluar
                .filter(artist -> artist.getGenre().equals("Jazz"))
                // noneMatch devuelve true si NINGUNO cumple la condición
                // es más semántico que !anyMatch — expresa mejor la intención
                .noneMatch(artist -> !artist.getCountry().equals("USA"));
    }

    /**
     * EJERCICIO 7 — INTERMEDIO
     * Canciones de más de 5 minutos ordenadas por duración descendente.
     */
    public List<String> getSongsLongerThan5Minutes() {
        return DBMusic.ARTISTS.stream()
                // aplanamos dos niveles para llegar a las canciones
                .flatMap(artist -> artist.getAlbums().stream())
                .flatMap(album -> album.getSongs().stream())
                // 5 minutos = 300 segundos — filtramos las que superan ese umbral
                .filter(song -> song.getDurationSeconds() > 300)
                // reversed() invierte el comparador — de mayor duración a menor
                .sorted(Comparator.comparingInt(Song::getDurationSeconds).reversed())
                // ya filtradas y ordenadas, solo necesitamos el título
                .map(Song::getTitle)
                .toList();
    }

    /**
     * EJERCICIO 8 — INTERMEDIO
     * Promedio de reproducciones de canciones del género Rock.
     */
    public OptionalDouble getAverageReproductionsRock() {
        return DBMusic.ARTISTS.stream()
                // filtramos artistas Rock antes de aplanar — reducimos trabajo innecesario
                .filter(artist -> artist.getGenre().equals("Rock"))
                // aplanamos hasta llegar a las canciones
                .flatMap(artist -> artist.getAlbums().stream())
                .flatMap(album -> album.getSongs().stream())
                // mapToLong convierte a LongStream — evita autoboxing de Long
                // además average() no existe en Stream<Song>, solo en LongStream/IntStream
                .mapToLong(Song::getReproductions)
                // average devuelve OptionalDouble — podría no haber canciones de Rock
                .average();
    }

    /**
     * EJERCICIO 9 — INTERMEDIO
     * Total de canciones de artistas del género Latin usando reduce.
     */
    public long getTotalLatinSongs() {
        return DBMusic.ARTISTS.stream()
                // solo artistas Latin
                .filter(artist -> artist.getGenre().equals("Latin"))
                // aplanamos hasta canciones
                .flatMap(artist -> artist.getAlbums().stream())
                .flatMap(album -> album.getSongs().stream())
                // mapToLong para trabajar con primitivos — sin autoboxing
                .mapToLong(song -> 1L)
                // reduce con identidad 0 — si no hay canciones devuelve 0 directamente
                // suma 1 por cada canción — equivale a count() pero usando reduce explícitamente
                .reduce(0L, Long::sum);
    }

    /**
     * EJERCICIO 10 — INTERMEDIO
     * Total de reproducciones procesado en paralelo.
     */
    public long getTotalReproductionsParallel() {
        return DBMusic.ARTISTS.parallelStream()
                // parallelStream divide la lista en chunks y los procesa en múltiples hilos
                // el resultado es el mismo que stream() secuencial — solo cambia el rendimiento
                .flatMap(artist -> artist.getAlbums().stream())
                .flatMap(album -> album.getSongs().stream())
                // mapToLong antes de sum — sum solo existe en LongStream, no en Stream<Song>
                .mapToLong(Song::getReproductions)
                // sum es equivalente a reduce(0L, Long::sum) pero más legible
                .sum();
    }
}