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



/*open class Soldier:Unit(){

}*/

/*open class Soldier:Unit(){
    fun paint(){}
}*/



interface ChooseDirectionSergeant{
    fun chooseDirectionSergeant()
}

interface ChooseDirectionGeneral{
    fun chooseDirectionGeneral()
}

interface SoldierAsMan{
    fun introduce()
}

interface SoldierChooseDirection{
    fun chooseDirection()
}

interface SoldierPainter{
    fun paint()
    fun paintTheBorder()
    fun paintTheGrass()
}

interface SoldierExcavator{
    fun excavate()
    fun excavateDacha()
    fun excavateCountryHouse()
}

class Soldier:Unit(),SoldierAsMan,SoldierChooseDirection,SoldierPainter{
    override fun introduce() {
        TODO("Not yet implemented")
    }

    override fun chooseDirection() {
        TODO("Not yet implemented")
    }

    override fun paint() {
        TODO("Not yet implemented")
    }

    override fun paintTheBorder() {
        TODO("Not yet implemented")
    }

    override fun paintTheGrass() {
        TODO("Not yet implemented")
    }


}
/*open class SuperSoldier:Soldier() {
    override fun paint(){

    }
    fun excavate(){}
}*/
