package com.example.myapplication3

interface Hero {

    val name: String
    var weapon: String
    var power: Int?

    fun definePower()
    fun chooseWeapon()
}