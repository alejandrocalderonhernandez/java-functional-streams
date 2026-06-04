package com.debuggeandoideas.data;

import com.debuggeandoideas.dtos.Album;
import com.debuggeandoideas.dtos.Artist;
import com.debuggeandoideas.dtos.Song;

import java.util.List;

public class DBMusic {

    private DBMusic() {}

    public static final List<Artist> ARTISTS = List.of(

            // ── Rock ────────────────────────────────────────────────────
            new Artist("The Beatles", "UK", "Rock", List.of(
                    new Album("Abbey Road", 1969, List.of(
                            new Song("Come Together",       259, 980_000_000),
                            new Song("Something",           182, 750_000_000),
                            new Song("Here Comes the Sun",  185, 1_200_000_000)
                    )),
                    new Album("Let It Be", 1970, List.of(
                            new Song("Let It Be",           243, 890_000_000),
                            new Song("The Long and Winding Road", 218, 600_000_000)
                    ))
            )),

            new Artist("Led Zeppelin", "UK", "Rock", List.of(
                    new Album("Led Zeppelin IV", 1971, List.of(
                            new Song("Stairway to Heaven",  482, 1_500_000_000),
                            new Song("Black Dog",           296, 700_000_000),
                            new Song("Rock and Roll",       220, 650_000_000)
                    ))
            )),

            new Artist("Pink Floyd", "UK", "Rock", List.of(
                    new Album("The Dark Side of the Moon", 1973, List.of(
                            new Song("Money",               382, 820_000_000),
                            new Song("Time",                413, 760_000_000),
                            new Song("The Great Gig in the Sky", 284, 580_000_000)
                    ))
            )),

            new Artist("Queen", "UK", "Rock", List.of(
                    new Album("A Night at the Opera", 1975, List.of(
                            new Song("Bohemian Rhapsody",   354, 1_600_000_000),
                            new Song("Love of My Life",     209, 720_000_000),
                            new Song("You're My Best Friend",173, 540_000_000)
                    ))
            )),

            new Artist("Nirvana", "USA", "Rock", List.of(
                    new Album("Nevermind", 1991, List.of(
                            new Song("Smells Like Teen Spirit", 301, 1_400_000_000),
                            new Song("Come as You Are",      219, 900_000_000),
                            new Song("Lithium",              257, 700_000_000)
                    ))
            )),

            new Artist("The Rolling Stones", "UK", "Rock", List.of(
                    new Album("Exile on Main St.", 1972, List.of(
                            new Song("Rocks Off",           229, 480_000_000),
                            new Song("Tumbling Dice",       228, 520_000_000),
                            new Song("Happy",               213, 390_000_000)
                    ))
            )),

            new Artist("David Bowie", "UK", "Rock", List.of(
                    new Album("Ziggy Stardust", 1972, List.of(
                            new Song("Starman",             254, 720_000_000),
                            new Song("Suffragette City",    208, 560_000_000),
                            new Song("Rock 'n' Roll Suicide", 299, 420_000_000)
                    ))
            )),

            new Artist("Radiohead", "UK", "Rock", List.of(
                    new Album("OK Computer", 1997, List.of(
                            new Song("Karma Police",        264, 890_000_000),
                            new Song("Paranoid Android",    387, 780_000_000),
                            new Song("No Surprises",        228, 820_000_000)
                    ))
            )),

            new Artist("Red Hot Chili Peppers", "USA", "Rock", List.of(
                    new Album("Californication", 1999, List.of(
                            new Song("Californication",     329, 980_000_000),
                            new Song("Scar Tissue",         217, 870_000_000),
                            new Song("Otherside",           256, 760_000_000)
                    ))
            )),

            new Artist("Foo Fighters", "USA", "Rock", List.of(
                    new Album("The Colour and the Shape", 1997, List.of(
                            new Song("Everlong",            250, 1_100_000_000),
                            new Song("My Hero",             258, 890_000_000),
                            new Song("Monkey Wrench",       228, 650_000_000)
                    ))
            )),

            // ── Pop ─────────────────────────────────────────────────────
            new Artist("Michael Jackson", "USA", "Pop", List.of(
                    new Album("Thriller", 1982, List.of(
                            new Song("Thriller",            358, 1_100_000_000),
                            new Song("Billie Jean",         294, 1_800_000_000),
                            new Song("Beat It",             258, 980_000_000)
                    )),
                    new Album("Bad", 1987, List.of(
                            new Song("Bad",                 247, 760_000_000),
                            new Song("Man in the Mirror",   320, 850_000_000)
                    ))
            )),

            new Artist("Madonna", "USA", "Pop", List.of(
                    new Album("Like a Virgin", 1984, List.of(
                            new Song("Like a Virgin",       223, 870_000_000),
                            new Song("Material Girl",       238, 690_000_000)
                    ))
            )),

            new Artist("Taylor Swift", "USA", "Pop", List.of(
                    new Album("1989", 2014, List.of(
                            new Song("Shake It Off",        219, 1_300_000_000),
                            new Song("Blank Space",         231, 1_200_000_000),
                            new Song("Style",               231, 980_000_000)
                    )),
                    new Album("Midnights", 2022, List.of(
                            new Song("Anti-Hero",           200, 1_500_000_000),
                            new Song("Lavender Haze",       202, 890_000_000)
                    ))
            )),

            new Artist("Beyoncé", "USA", "Pop", List.of(
                    new Album("Lemonade", 2016, List.of(
                            new Song("Formation",           213, 980_000_000),
                            new Song("Hold Up",             219, 870_000_000),
                            new Song("Sorry",               222, 820_000_000)
                    ))
            )),

            new Artist("Adele", "UK", "Pop", List.of(
                    new Album("21", 2011, List.of(
                            new Song("Rolling in the Deep", 228, 1_700_000_000),
                            new Song("Someone Like You",    285, 1_600_000_000),
                            new Song("Set Fire to the Rain", 242, 1_100_000_000)
                    ))
            )),

            new Artist("Ed Sheeran", "UK", "Pop", List.of(
                    new Album("Divide", 2017, List.of(
                            new Song("Shape of You",        234, 1_500_000_000),
                            new Song("Castle on the Hill",  261, 1_200_000_000),
                            new Song("Galway Girl",         170, 890_000_000)
                    ))
            )),

            new Artist("Billie Eilish", "USA", "Pop", List.of(
                    new Album("When We All Fall Asleep", 2019, List.of(
                            new Song("Bad Guy",             194, 2_100_000_000),
                            new Song("When the Party's Over", 196, 1_300_000_000),
                            new Song("Bury a Friend",       193, 980_000_000)
                    ))
            )),

            new Artist("The Weeknd", "Canada", "Pop", List.of(
                    new Album("After Hours", 2020, List.of(
                            new Song("Blinding Lights",     200, 1_800_000_000),
                            new Song("Save Your Tears",     215, 2_100_000_000),
                            new Song("In Your Eyes",        238, 1_400_000_000)
                    ))
            )),

            // ── Hip-Hop ──────────────────────────────────────────────────
            new Artist("Kendrick Lamar", "USA", "Hip-Hop", List.of(
                    new Album("To Pimp a Butterfly", 2015, List.of(
                            new Song("Alright",            239, 780_000_000),
                            new Song("King Kunta",         234, 650_000_000),
                            new Song("These Walls",        309, 420_000_000)
                    ))
            )),

            new Artist("Eminem", "USA", "Hip-Hop", List.of(
                    new Album("The Slim Shady LP", 1999, List.of(
                            new Song("My Name Is",         261, 900_000_000),
                            new Song("Guilty Conscience",  288, 540_000_000)
                    )),
                    new Album("The Marshall Mathers LP", 2000, List.of(
                            new Song("The Real Slim Shady", 284, 1_100_000_000),
                            new Song("Stan",               404, 980_000_000),
                            new Song("Kim",                430, 310_000_000)
                    ))
            )),

            new Artist("Jay-Z", "USA", "Hip-Hop", List.of(
                    new Album("The Blueprint", 2001, List.of(
                            new Song("Izzo (H.O.V.A.)",    231, 760_000_000),
                            new Song("Song Cry",           271, 480_000_000),
                            new Song("Never Change",       254, 390_000_000)
                    ))
            )),

            new Artist("Drake", "Canada", "Hip-Hop", List.of(
                    new Album("Take Care", 2011, List.of(
                            new Song("Take Care",          245, 1_100_000_000),
                            new Song("Marvins Room",       383, 780_000_000),
                            new Song("Crew Love",          253, 650_000_000)
                    ))
            )),

            new Artist("Kanye West", "USA", "Hip-Hop", List.of(
                    new Album("The College Dropout", 2004, List.of(
                            new Song("Through the Wire",   237, 820_000_000),
                            new Song("Jesus Walks",        202, 980_000_000),
                            new Song("All Falls Down",     237, 720_000_000)
                    ))
            )),

            // ── Latin ────────────────────────────────────────────────────
            new Artist("Bad Bunny", "Puerto Rico", "Latin", List.of(
                    new Album("Un Verano Sin Ti", 2022, List.of(
                            new Song("Me Porto Bonito",     178, 1_400_000_000),
                            new Song("Tití Me Preguntó",    268, 1_200_000_000),
                            new Song("Después de la Playa", 196, 870_000_000)
                    ))
            )),

            new Artist("J Balvin", "Colombia", "Latin", List.of(
                    new Album("Vibras", 2018, List.of(
                            new Song("Safari",             212, 780_000_000),
                            new Song("Machika",            187, 690_000_000)
                    ))
            )),

            new Artist("Shakira", "Colombia", "Latin", List.of(
                    new Album("Laundry Service", 2001, List.of(
                            new Song("Whenever Wherever",   210, 980_000_000),
                            new Song("Underneath Your Clothes", 242, 650_000_000)
                    ))
            )),

            new Artist("Maluma", "Colombia", "Latin", List.of(
                    new Album("F.A.M.E.", 2018, List.of(
                            new Song("Felices los 4",       228, 870_000_000),
                            new Song("Corazón",             198, 720_000_000)
                    ))
            )),

            new Artist("Ozuna", "Puerto Rico", "Latin", List.of(
                    new Album("Aura", 2018, List.of(
                            new Song("Taki Taki",           202, 1_100_000_000),
                            new Song("Única",               199, 680_000_000),
                            new Song("Baila Baila Baila",   185, 890_000_000)
                    ))
            )),

            // ── Electronic ───────────────────────────────────────────────
            new Artist("Daft Punk", "France", "Electronic", List.of(
                    new Album("Random Access Memories", 2013, List.of(
                            new Song("Get Lucky",           369, 1_300_000_000),
                            new Song("Instant Crush",       337, 780_000_000),
                            new Song("Lose Yourself to Dance", 345, 620_000_000)
                    ))
            )),

            new Artist("The Chemical Brothers", "UK", "Electronic", List.of(
                    new Album("Dig Your Own Hole", 1997, List.of(
                            new Song("Block Rockin Beats",  299, 540_000_000),
                            new Song("Setting Sun",         295, 390_000_000)
                    ))
            )),

            new Artist("Aphex Twin", "UK", "Electronic", List.of(
                    new Album("Selected Ambient Works", 1992, List.of(
                            new Song("Xtal",               310, 280_000_000),
                            new Song("Tha",                289, 240_000_000),
                            new Song("Pulsewidth",         244, 210_000_000)
                    ))
            )),

            new Artist("Deadmau5", "Canada", "Electronic", List.of(
                    new Album("4x4=12", 2010, List.of(
                            new Song("Some Chords",        422, 480_000_000),
                            new Song("Raise Your Weapon",  386, 520_000_000)
                    ))
            )),

            // ── Jazz ─────────────────────────────────────────────────────
            new Artist("Miles Davis", "USA", "Jazz", List.of(
                    new Album("Kind of Blue", 1959, List.of(
                            new Song("So What",             562, 320_000_000),
                            new Song("Freddie Freeloader",  583, 280_000_000),
                            new Song("Blue in Green",       327, 240_000_000)
                    ))
            )),

            new Artist("John Coltrane", "USA", "Jazz", List.of(
                    new Album("A Love Supreme", 1965, List.of(
                            new Song("Acknowledgement",     470, 210_000_000),
                            new Song("Resolution",          437, 190_000_000),
                            new Song("Pursuance",           459, 180_000_000)
                    ))
            )),

            new Artist("Thelonious Monk", "USA", "Jazz", List.of(
                    new Album("Monk's Dream", 1963, List.of(
                            new Song("Monk's Dream",        328, 150_000_000),
                            new Song("Body and Soul",       288, 140_000_000)
                    ))
            )),

            // ── Soul / R&B ────────────────────────────────────────────────
            new Artist("Aretha Franklin", "USA", "Soul", List.of(
                    new Album("I Never Loved a Man", 1967, List.of(
                            new Song("Respect",             147, 980_000_000),
                            new Song("Dr. Feelgood",        176, 420_000_000),
                            new Song("Do Right Woman",      213, 380_000_000)
                    ))
            )),

            new Artist("Marvin Gaye", "USA", "Soul", List.of(
                    new Album("What's Going On", 1971, List.of(
                            new Song("What's Going On",     234, 760_000_000),
                            new Song("Mercy Mercy Me",      196, 650_000_000),
                            new Song("Inner City Blues",    258, 540_000_000)
                    ))
            )),

            new Artist("Amy Winehouse", "UK", "Soul", List.of(
                    new Album("Back to Black", 2006, List.of(
                            new Song("Rehab",               213, 1_200_000_000),
                            new Song("Back to Black",       243, 980_000_000),
                            new Song("Valerie",             231, 870_000_000)
                    ))
            )),

            // ── DUPLICADOS ───────────────────────────────────────────────
            new Artist("The Beatles", "UK", "Rock", List.of(
                    new Album("Abbey Road", 1969, List.of(
                            new Song("Come Together",       259, 980_000_000),
                            new Song("Something",           182, 750_000_000)
                    ))
            )),

            new Artist("Bad Bunny", "Puerto Rico", "Latin", List.of(
                    new Album("Un Verano Sin Ti", 2022, List.of(
                            new Song("Me Porto Bonito",     178, 1_400_000_000),
                            new Song("Tití Me Preguntó",    268, 1_200_000_000)
                    ))
            ))
    );
}