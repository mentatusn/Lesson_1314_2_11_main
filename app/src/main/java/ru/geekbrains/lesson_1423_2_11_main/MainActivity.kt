package ru.geekbrains.lesson_1423_2_11_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this, BuildConfig.PASSWORD,Toast.LENGTH_SHORT).show()
    }
}

open class Unit(){

}

open class Machine:Unit(){

}

open class Soldier:Unit(){
    var instruments: Instruments?=null
}

/** BAD */
class SoldierWithShovel:Soldier(){

}
class SoldierWithBrush:Soldier(){

}
class SoldierWithGun:Soldier(){

}

/** Good */

sealed class Instruments{
    class Brush():Instruments()
    class Shovel():Instruments()
    class Gun():Instruments()
}

