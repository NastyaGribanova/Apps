package com.example.it

import kotlin.random.Random

class Pennywise(

     var weakness: String = "Physical form",
     var power: Int?,
     var form: String

) : Villian {

    val forms: Array<String> = arrayOf("Spider", "Clown", "statue of Paul Bunyan",
                                                "Old woman", "light balls")

    override fun strength(): String {
        val number = Random.nextInt(0,4)
        form = forms.get(number)
        return form
    }

    override fun definePower(): Int? {
        power = Random.nextInt(5,10)
        return power
    }


}