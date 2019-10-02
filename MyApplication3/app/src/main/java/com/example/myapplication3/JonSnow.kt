package com.example.myapplication3

import kotlin.random.Random

class JonSnow(override val name: String = "Jon Snow", override var weapon: String = "Longclaw",
              override var power: Int? = definePower()) : Hero {

    override fun definePower() : Int {
        return Random.nextInt(1,10)
    }

    override fun chooseWeapon() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}