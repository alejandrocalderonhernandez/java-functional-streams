package com.debuggeandoideas.practices;

import com.debuggeandoideas.dtos.Song;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamPractice {

    // ════════════════════════════════════════════════════════════════
    // EJERCICIOS DE PRÁCTICA — Stream API
    // ════════════════════════════════════════════════════════════════

    /**
     * EJERCICIO 1 — FÁCIL
     * <p>
     * Retorna una lista con los nombres de todos los artistas
     * ordenados por la cantidad de álbumes de MAYOR a MENOR.
     * <p>
     * Operadores: sorted + map + toList
     * <p>
     * Ejemplo de salida esperada:
     *   ["The Beatles", "Pink Floyd", "Led Zeppelin", ...]
     * <p>
     * @return List<String> nombres ordenados por cantidad de álbumes descendente
     */
    public List<String> getArtistsSortedByAlbumCountDesc() {
        throw new UnsupportedOperationException("Implementar ejercicio 1");
    }

    /**
     * EJERCICIO 2 — FÁCIL
     * <p>
     * Retorna true si existe AL MENOS UN artista de Francia.
     * <p>
     * Operadores: anyMatch
     * <p>
     * Ejemplo de salida esperada:
     *   true
     * <p>
     * @return boolean — true si hay algún artista de Francia
     */
    public boolean hasArtistFromFrance() {
        throw new UnsupportedOperationException("Implementar ejercicio 2");
    }

    /**
     * EJERCICIO 3 — FÁCIL
     * <p>
     * Retorna el nombre del artista con el nombre más largo.
     * <p>
     * Operadores: map + max
     * <p>
     * Ejemplo de salida esperada:
     *   Optional["Red Hot Chili Peppers"]
     * <p>
     * @return Optional<String> con el nombre más largo
     */
    public Optional<String> getLongestArtistName() {
        throw new UnsupportedOperationException("Implementar ejercicio 3");
    }

    /**
     * EJERCICIO 4 — FÁCIL
     * <p>
     * Retorna una lista con los títulos de todos los álbumes
     * lanzados después del año 2000, sin duplicados.
     * <p>
     * Operadores: flatMap + filter + map + distinct + toList
     * <p>
     * @return List<String> títulos de álbumes post-2000 sin duplicados
     */
    public List<String> getAlbumTitlesAfter2000() {
        throw new UnsupportedOperationException("Implementar ejercicio 4");
    }

    /**
     * EJERCICIO 5 — FÁCIL
     * <p>
     * Retorna la canción con más reproducciones de TODO el catálogo.
     * <p>
     * Operadores: flatMap + flatMap + max
     * <p>
     * Ejemplo de salida esperada:
     *   Optional[Song{title="Blinding Lights"}]
     * <p>
     * @return Optional<Song> con la canción más reproducida
     */
    public Optional<Song> getMostReproducedSong() {
        throw new UnsupportedOperationException("Implementar ejercicio 5");
    }

    /**
     * EJERCICIO 6 — INTERMEDIO
     * <p>
     * Retorna true si NINGÚN artista del género "Jazz"
     * es de un país fuera de USA.
     * <p>
     * Operadores: filter + noneMatch
     * <p>
     * Ejemplo de salida esperada:
     *   true
     * <p>
     * @return boolean — true si todos los artistas de Jazz son de USA
     */
    public boolean noJazzArtistOutsideUSA() {
        throw new UnsupportedOperationException("Implementar ejercicio 6");
    }

    /**
     * EJERCICIO 7 — INTERMEDIO
     * <p>
     * Retorna una lista con los títulos de las canciones
     * que duren MÁS de 5 minutos (300 segundos),
     * ordenadas por duración de MAYOR a MENOR.
     * <p>
     * Operadores: flatMap + flatMap + filter + sorted + map + toList
     * <p>
     * @return List<String> títulos de canciones de más de 5 minutos
     */
    public List<String> getSongsLongerThan5Minutes() {
        throw new UnsupportedOperationException("Implementar ejercicio 7");
    }

    /**
     * EJERCICIO 8 — INTERMEDIO
     * <p>
     * Calcula el promedio de reproducciones de todas las canciones
     * del género "Rock".
     * <p>
     * Operadores: filter + flatMap + flatMap + mapToLong + average
     * <p>
     * Ejemplo de salida esperada:
     *   OptionalDouble[754_320_000.0]
     * <p>
     * @return OptionalDouble con el promedio de reproducciones del género Rock
     */
    public OptionalDouble getAverageReproductionsRock() {
        throw new UnsupportedOperationException("Implementar ejercicio 8");
    }

    /**
     * EJERCICIO 9 — INTERMEDIO
     * <p>
     * Retorna el total de canciones de TODOS los artistas
     * de Latinoamérica (género "Latin") usando reduce.
     * <p>
     * Operadores: filter + flatMap + flatMap + mapToLong + reduce
     * <p>
     * Ejemplo de salida esperada:
     *   34
     * <p>
     * @return long con el total de canciones del género Latin
     */
    public long getTotalLatinSongs() {
        throw new UnsupportedOperationException("Implementar ejercicio 9");
    }

    /**
     * EJERCICIO 10 — INTERMEDIO
     * <p>
     * Calcula el TOTAL de reproducciones de todas las canciones
     * del catálogo completo procesando el stream en PARALELO.
     * <p>
     * Nota: este ejercicio simula un dataset enorme donde
     * el procesamiento paralelo tiene sentido.
     * Compara el resultado con un stream secuencial — deben ser iguales.
     * <p>
     * Operadores: parallelStream + flatMap + flatMap + mapToLong + sum
     * <p>
     * @return long total de reproducciones procesado en paralelo
     */
    public long getTotalReproductionsParallel() {
        throw new UnsupportedOperationException("Implementar ejercicio 10");
    }
}