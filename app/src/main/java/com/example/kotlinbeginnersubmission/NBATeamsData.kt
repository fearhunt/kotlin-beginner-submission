package com.example.kotlinbeginnersubmission

object NBATeamsData {
    private val nbaTeamNames = arrayOf(
            "Cleveland Cavaliers",
            "Boston Celtics",
            "Los Angeles Clippers",
            "Golden State Warriors",
            "Atlanta Hawks",
            "Brooklyn Nets",
            "Denver Nuggets",
            "Oklahoma City Thunder",
            "Portland Trail Blazers",
            "Phoenix Suns",
            "Minnesota Timberwolves"
    )

    private val nbaTeamDetails = arrayOf(
            "The Cleveland Cavaliers, often referred to as the Cavs, are an American professional basketball team based in Cleveland. The Cavaliers compete in the National Basketball Association (NBA) as a member of the league's Eastern Conference Central Division. The team began play as an expansion team in 1970, along with the Portland Trail Blazers and Buffalo Braves. Home games were first held at Cleveland Arena from 1970 to 1974, followed by the Richfield Coliseum from 1974 to 1994. Since 1994, the Cavs have played home games at Rocket Mortgage FieldHouse in downtown Cleveland, which is shared with the Cleveland Monsters of the American Hockey League. Dan Gilbert has owned the team since March 2005.",
            "The Boston Celtics are an American professional basketball team based in Boston. The Celtics compete in the National Basketball Association (NBA) as a member of the league's Eastern Conference Atlantic Division. Founded in 1946 as one of the league's original eight teams, the Celtics play their home games at TD Garden, which they share with the National Hockey League (NHL)'s Boston Bruins. The Celtics are regarded as one of the most successful basketball teams in NBA history; the franchise is tied with the Los Angeles Lakers for most NBA Championships won with 17 (accounting for 23.6 percent of all NBA championships since the league's founding) and currently holds the record for the most recorded wins of any NBA team.",
            "The Los Angeles Clippers (branded as the LA Clippers) are an American professional basketball team based in Los Angeles. The Clippers compete in the National Basketball Association (NBA) as a member of the Pacific Division in the league's Western Conference. They play their home games at the Staples Center, an arena they share with fellow NBA team Los Angeles Lakers, as well as the Los Angeles Sparks of the Women's National Basketball Association (WNBA) and the Los Angeles Kings of the National Hockey League (NHL).",
            "The Golden State Warriors are an American professional basketball team based in San Francisco. The Warriors compete in the National Basketball Association (NBA), as a member of the league's Western Conference Pacific Division. Founded in 1946 in Philadelphia, the Warriors moved to the San Francisco Bay Area in 1962 and took the city's name, before changing its geographic moniker to Golden State in 1971. The club plays its home games at the Chase Center.",
            "The Atlanta Hawks are an American professional basketball team based in Atlanta. The Hawks compete in the National Basketball Association (NBA) as a member of the league's Eastern Conference Southeast Division. The team plays its home games at State Farm Arena.",
            "The Brooklyn Nets are an American professional basketball team based in the New York City borough of Brooklyn. The Nets compete in the National Basketball Association (NBA) as a member of the Atlantic Division of the Eastern Conference. The team plays its home games at Barclays Center. They are one of two NBA teams located in New York City; the other is the New York Knicks. The club was established in 1967 as a charter franchise of the NBA's rival league, the American Basketball Association (ABA). They played in New Jersey as the New Jersey Americans during their first season, before relocating to Long Island, New York, in 1968 and changing their name to the New York Nets.",
            "The Denver Nuggets are an American professional basketball team based in Denver. The Nuggets compete in the National Basketball Association (NBA) as a member of the league's Western Conference Northwest Division. The team was founded as the Denver Larks in 1967 as a charter franchise of the American Basketball Association (ABA), but changed its name to Rockets before the first season. It changed its name again to the Nuggets in 1974. After the name change, the Nuggets played for the final ABA Championship title in 1976, losing to the New York Nets.",
            "The Oklahoma City Thunder are an American professional basketball team based in Oklahoma City. The Thunder compete in the National Basketball Association (NBA) as a member of the league's Western Conference Northwest Division. The team plays its home games at Chesapeake Energy Arena.",
            "The Portland Trail Blazers (colloquially known as the Blazers) are an American professional basketball team based in Portland, Oregon. The Trail Blazers compete in the National Basketball Association (NBA) as a member of the league's Western Conference Northwest Division. The team played its home games in the Memorial Coliseum before moving to Moda Center in 1995 (called the Rose Garden until 2013). The franchise entered the league as an expansion team in 1970, and has enjoyed a strong following: from 1977 through 1995, the team sold out 814 consecutive home games, the longest such streak in American major professional sports at the time, and only since surpassed by the Boston Red Sox.",
            "The Phoenix Suns are an American professional basketball team based in Phoenix, Arizona. The Suns compete in the National Basketball Association (NBA), as a member of the league's Western Conference Pacific Division. The Suns are the only team in their division not based in California. The Suns play their home games at the Phoenix Suns Arena.",
            "The Minnesota Timberwolves are an American professional basketball team based in Minneapolis. The Timberwolves compete in the National Basketball Association (NBA) as a member of the league's Western Conference Northwest Division. Founded in 1989, the team is owned by Glen Taylor who also owns the WNBA's Minnesota Lynx. The Timberwolves play their home games at Target Center, their home since 1990."
    )

    private val nbaTeamWins = arrayOf(
            "14",
            "19",
            "25",
            "19",
            "17",
            "25",
            "21",
            "16",
            "21",
            "25",
            "8"
    )

    private val nbaTeamLoses = arrayOf(
            "22",
            "18",
            "14",
            "19",
            "20",
            "13",
            "15",
            "21",
            "15",
            "11",
            "29"
    )

    private val nbaTeamTwitter = arrayOf(
            "https://twitter.com/cavs",
            "https://twitter.com/celtics",
            "https://twitter.com/LAClippers",
            "https://twitter.com/warriors",
            "https://twitter.com/ATLHawks",
            "https://twitter.com/BrooklynNets",
            "https://twitter.com/nuggets",
            "https://twitter.com/okcthunder",
            "https://twitter.com/trailblazers",
            "https://twitter.com/Suns",
            "https://twitter.com/Timberwolves"
    )

    private val nbaTeamImages = arrayOf(
            R.drawable.cavs,
            R.drawable.celtics,
            R.drawable.clippers,
            R.drawable.gsw,
            R.drawable.hawks,
            R.drawable.nets,
            R.drawable.nuggets,
            R.drawable.okc,
            R.drawable.portland,
            R.drawable.suns,
            R.drawable.timberwolves
    )

    val listData: ArrayList<NBATeam>
        get() {
            val list = arrayListOf<NBATeam>()
            for (index in nbaTeamNames.indices) {
                val nbaTeam = NBATeam()

                nbaTeam.name = nbaTeamNames[index]
                nbaTeam.detail = nbaTeamDetails[index]
                nbaTeam.wins = nbaTeamWins[index]
                nbaTeam.loses = nbaTeamLoses[index]
                nbaTeam.twitter = nbaTeamTwitter[index]
                nbaTeam.photo = nbaTeamImages[index]

                list.add(nbaTeam)
            }

            return list
        }
}