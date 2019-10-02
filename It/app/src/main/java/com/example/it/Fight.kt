package com.example.it

import kotlin.random.Random

class Fight {

    fun fightWithIt (character: OneOfLoserClub, pennywise: Pennywise){
        if (character.chooseAge(Random.nextInt(1,50)) == 13){
            printMessage("Oh no I have " + character.getFear(pennywise.forms.indexOf(pennywise.strength())))
        } else if (character.definePower()!! > pennywise.definePower()!!){
            character.sayPhrase()
        } else printMessage("It took the form of " + pennywise.strength())
    }

    fun fightWithBadGuy (character: OneOfLoserClub, badGuy: BadGuy){
        if (character.chooseAge(Random.nextInt(1,50)) == 13){
            printMessage("You are powerless vs " + badGuy.strength() )
        } else if (character.definePower()!! > badGuy.definePower()!!){
            printMessage("You won, but RUN")
        } else printMessage("Predictable")
    }
}