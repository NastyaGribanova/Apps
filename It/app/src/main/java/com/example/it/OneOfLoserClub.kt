package com.example.it

import kotlin.random.Random

class OneOfLoserClub(
     val name: String,
     var fear: String,
     var power: Int?,
     var age: Int
) : Character {

    val goodPhrases: Array<String> = arrayOf("Your hair is winter fire January embers My heart burns there, too",
                                            "We are all afraid of something",
                                            "I was with your mom last night",
                                            "You'll always be my girl",
                                            "I'm a dancing clown",
                                            "We are all flying here")

    val fears: Array<String> = arrayOf("Arachnofobia", "Coulrophobia", "BanyanPhobia", "OldWomanPhobia", "EverythingPhobia" )

    override fun definePower(): Int? {
        power = Random.nextInt(1,10)
        return power
    }

    override fun sayPhrase() {
        val number = Random.nextInt(0,4)
            printMessage(goodPhrases.get(number))
    }

    override fun chooseAge(number: Int): Int {
        if (number <= 20){
            age = 13
        } else age = 40
        return age
    }

    override fun getFear(number: Int): String {
        return fears.get(number)
    }
}