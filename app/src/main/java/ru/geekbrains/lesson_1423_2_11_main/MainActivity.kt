package ru.geekbrains.lesson_1423_2_11_main

import android.app.Instrumentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Toast.makeText(this, BuildConfig.PASSWORD,Toast.LENGTH_SHORT).show()
        val soldier = Soldier()
        soldier.instrument = Instruments.Shovel()
        soldier.instrument = Instruments.Brush()
        soldier.instrument = Instruments.Gun()
        soldier.instrument.doWork()
    }
}

open class Unit(){

}

open class Machine:Unit(){

}



open class Soldier:Unit(){
    lateinit var instrument: Instrument
}

open class SoldierWithShovel:Soldier(){

}
open class SoldierWithBrush:Soldier(){

}
open class SoldierWithGun:Soldier(){

}
sealed class Instruments{
    class Shovel:Instrument() {
        override fun doWork() {
            TODO("Not yet implemented")
        }
    }
    class Brush:Instrument() {
        override fun doWork() {
            TODO("Not yet implemented")
        }
    }
    class Gun:Instrument() {
        override fun doWork() {
            TODO("Not yet implemented")
        }
    }
}

abstract class Instrument{
    abstract fun doWork()
}



