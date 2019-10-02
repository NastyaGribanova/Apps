package com.example.it

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val richie = OneOfLoserClub("Richie Tozier", "Paul Banyan", null, 13)
        val bev = OneOfLoserClub("Beverly Marsh", "Blood", null, 12)
        val pennywise = Pennywise("physical form", 100,"Clown")
        val henry = BadGuy("Henry Bowers", "knife", null)
        val fight = Fight()
        fight.fightWithBadGuy(richie, henry)
        fight.fightWithIt(bev, pennywise)

    }
}

inline fun printMessage(message: String){
    Log.e("Done with it", message)
}