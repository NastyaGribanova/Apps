package com.example.myapplication3

interface Villian {

    val name: String
    var phrase: String
    var power: Int?

    fun definePower()
    fun tellThePhrase()
}