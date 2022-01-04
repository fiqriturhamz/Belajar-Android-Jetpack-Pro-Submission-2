package com.example.imovie.data.local

import com.example.imovie.data.entity.movie.MovieEntity
import com.example.imovie.data.entity.tvshow.TvShowEntity

object DataDummy {
    fun generateDummyMovies(): ArrayList<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                "After finding a host body in investigative reporter Eddie Brock, the alien symbiote must face a new enemy, Carnage, the alter ego of serial killer Cletus Kasady.",
                "Venom: Let There Be Carnage",
                "/1MJNcPZy46hIy2CmSqOeru0yr5C.jpg",
                "2021-10-01",
                6.8,
                580489
            )
        )

        movies.add(
            MovieEntity(
                "The Eternals are a team of ancient aliens who have been living on Earth in secret for thousands of years. When an unexpected tragedy forces them out of the shadows, they are forced to reunite against mankind’s most ancient enemy, the Deviants.",
                "Eternals",
                "/4DiJQ1mBp4ztoznZADIrPg69v46.jpg",
                "2021-11-05",
                7.1,
                524434
            )
        )

        movies.add(
            MovieEntity(
                "Dune tells the story of a young man named Paul Atreides played by Timothee Chalamet who will move from his current residence in Caladan with his family members. Paul and his family will live a new life on another planet called the planet Arrakis. Arrakis is a planet with natural conditions in the form of a vast desert. At first glance, the planet Arrakis is an arid planet because it is a desert. However, Arrakis has something special in it. Arrakis keeps a spice called spice. Spice in Arrakis is very abundant and contains special properties.",
                "Dune",
                "/d5NXSklXo0qyIYkgV94XAgMIckC.jpg",
                "2021-10-01",
                8.0,
                438631
            )
        )

        movies.add(
            MovieEntity(
                "A mysterious woman recruits bank teller Ludwig Dieter to lead a group of aspiring thieves on a top-secret heist during the early stages of the zombie apocalypse.",
                "Army of Thieves",
                "/iPTZGFmPs7HsXHYxiuxGolihjOH.jpg",
                "2021-10-29",
                6.9,
                796499
            )
        )


        movies.add(
            MovieEntity(
                "A bank teller named Guy realizes that he is a supporting character in an open world video game called Free City which will be offline soon.",
                "Free Guy",
                "/xmbU4JTUm8rsdtn7Y3Fcm30GpeT.jpg",
                "2021-08-13",
                7.8,
                550988
            )
        )
        movies.add(
            MovieEntity(
                "In her turbulent life as a professional assassin, Sam has no choice but to go rogue to save the life of an innocent 8-year-old girl in the middle of the gang war she has unleashed.",
                "Gunpowder Milkshake",
                "/5AaKulwpUtkscAokKWtLenGTfVS.jpg",
                "2020-07-14",
                6.5,
                574060
            )
        )

        movies.add(
            MovieEntity(
                "A journalist, Eddie Brock (Tom Hardy) wants to make an investment case against the discovery led by Dr. Carlton Drake (Riz Ahmed). Due to his investigation, Eddie visits Dr.'s lab. Carlton Drake. Everything is aimed at proving that Dr. Carlton Drake is performing a malicious act using the Symbiote. But in vain for Eddie, this living organism entered his body. Eddie discovers a super power within him that is able to control everything he does.",
                "Venom",
                "/vVusHIRlyyFVS42XnqZso2wGKr.jpg",
                "2018-10-05",
                6.8,
                335983
            )
        )

        movies.add(
            MovieEntity(
                "Shang-Chi must confront the past he thought he left behind when he is drawn into the web of the mysterious Ten Rings organization.",
                "Shang-Chi and the Legend of the Ten Rings",
                "/1BIoJGKbXjdFDAqUEiA2VHqkK1Z.jpg",
                "2021-09-03",
                7.8,
                566525
            )
        )

        movies.add(
            MovieEntity(
                "Minutes after Laurie Strode, her daughter Karen and granddaughter Allyson left masked monster Michael Myers caged and burning in Laurie's basement, Laurie is rushed to the hospital with life-threatening injuries, believing she finally killed her lifelong tormentor. But when Michael manages to free himself from Laurie's trap, his ritual bloodbath resumes. As Laurie fights her pain and prepares to defend herself against him, she inspires all of Haddonfield to rise up against their unstoppable monster. The Strode women join a group of other survivors of Michael's first rampage who decide to take matters into their own hands, forming a vigilante mob that sets out to hunt Michael down, once and for all.",
                "Halloween Kills",
                "/qmJGd5IfURq8iPQ9KF3les47vFS.jpg",
                "2021-10-15",
                7.0,
                610253
            )
        )

        movies.add(
            MovieEntity(
                "When something horrible happens to the only survivor of a bloody massacre, an insecure rookie cop must overcome his fears to stop further carnage.",
                "Nobody Sleeps in the Woods Tonight 2 ",
                "/6QvepemlDGIiiYsVs0Y1ieFuG7N.jpg",
                "2021-10-27",
                4.0,
                871964
            )
        )



        return movies
    }

    fun generateDummyTvShows(): ArrayList<TvShowEntity> {
        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                "After a vintage Chucky doll turns up at a suburban yard sale, an idyllic American town is thrown into chaos as a series of horrifying murders begin to expose the town’s hypocrisies and secrets. Meanwhile, the arrival of enemies — and allies — from Chucky’s past threatens to expose the truth behind the killings, as well as the demon doll’s untold origins.",
                "Chucky",
                "/iF8ai2QLNiHV4anwY1TuSGZXqfN.jpg",
                "2021-10-12",
                8.0,
                90462
            )
        )

        tvShows.add(
            TvShowEntity(
                "Hundreds of bankrupt players receive strange invitations to compete in children's games—at big stakes. However, a tantalizing prize awaits the champion.",
                "Squid Game",
                "/yACIAqAkSLkX4coHafpyLWAtQjw.jpg",
                "2021-09-17",
                7.8,
                93405
            )
        )

        tvShows.add(
            TvShowEntity(
                "Rachael Ray, also known as The Rachael Ray Show, is an American talk show starring Rachael Ray that debuted in syndication in the United States and Canada on September 18, 2006. It is filmed at Chelsea Television Studios in New York City. The show's 8th season premiered on September 9, 2013, and became the last Harpo show in syndication to switch to HD with a revamped studio. In January 2012, CBS Television Distribution announced a two-year renewal for the show, taking it through the 2013–14 season.",
                "Rachael Ray",
                "/dsAJhCLYX1fiNRoiiJqR6Up4aJ.jpg",
                "2014-09-13",
                5.3,
                1991
            )
        )

        tvShows.add(
            TvShowEntity(
                "\"Come on down!\" The Price Is Right features a wide variety of games and contests with the same basic challenge: Guess the prices of everyday (or not-quite-everyday) retail items. ",
                "The Price Is Rightr",
                "/6m4uYFAJwkanZXd0n0HUQ0lYHLl.jpg",
                "2021-09-13",
                6.7,
                2051
            )
        )

        tvShows.add(
            TvShowEntity(
                "The controversial life and history of Argentine football legend Diego Armando Maradona. From his beginnings in Villa Fiorito, one of the poorest barrios of Buenos Aires, to achieving glory on the international football league. Earning himself a well-deserved place in history. Living a life strewn with drugs, sex and public scrutiny, he played by his own rules regardless of the consequences. Watch the man who took the world by storm and made his way into the hearts of millions.",
                "Maradona: Blessed Dream",
                "/mGPdWEEmfzP7VQBQsXrFt1b1ikQ.jpg",
                "2021-10-29",
                7.8,
                1113901
            )
        )

        tvShows.add(
            TvShowEntity(
                "This game show sees contestants solve word puzzles, similar to those used in Hangman, to win cash and prizes determined by spinning a giant carnival wheel.",
                "Wheel of Fortune",
                "/2fvAIyVfFHQdhJ7OsJWuMlF7836.jpg",
                "2021-09-13",
                7.1,
                2778
            )
        )

        tvShows.add(
            TvShowEntity(
                "Magic, humor and many twists and turns are at the heart of this new season of Alix et les Merveilleux . In this universe where reality meets imagination, the characters continue their incredible adventures.",
                "Alix and the Marvelous",
                "/38Wm4JiOtajqDOWdjlfesp5T2jE.jpg",
                "2021-09-13",
                0.0,
                92804
            )
        )

        tvShows.add(
            TvShowEntity(
                "The Horton and Brady broods endure the romantic trials of life in Salem, a Midwestern hamlet filled with evil geniuses, star-crossed lovers and a rich family history.",
                "Days of Our Lives",
                "/7Zm7epVFEovMEVLpM6FvrjhaNXn.jpg",
                "2021-09-20",
                6.3,
                881
            )
        )

        tvShows.add(
            TvShowEntity(
                "",
                "Wer weiß denn sowas?",
                "/abKjah96esLWObidBcWmvKJv61E.jpg",
                "2021-10-04",
                7.6,
                63452
            )
        )

        tvShows.add(
            TvShowEntity(
                "A remake of Zee Sarthak’s Sindura Bindu.\n" +
                        "\n" +
                        "Despite her efforts to provide for her family, Meets disregard for societal gender norms and her nonconformist job as a delivery agent make her an unsuitable girl in the eyes of her family.",
                "Meet",
                "/9X7FovF5n8NQUHUPJYYfxRlF3yp.jpg",
                "2021-08-23",
                3.2,
                133372
            )
        )


        return tvShows
    }
}