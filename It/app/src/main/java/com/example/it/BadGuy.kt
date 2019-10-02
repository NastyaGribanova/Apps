package com.example.it

import kotlin.random.Random

class BadGuy(
    val name: String,
    var weapon: String,
    var power: Int?
) : Villian {

    val weapons: Array<String> = arrayOf("knife", "gun", "bat")

    override fun definePower(): Int? {
        power = Random.nextInt(1,10)
        return power
    }

    override fun strength(): String {
        val number = Random.nextInt(0,4)
        weapon = weapons.get(number)
        return weapon
    }
}