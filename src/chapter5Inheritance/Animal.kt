package chapter5Inheritance

import java.awt.Image

abstract class Animal : Roamable {

    abstract val image : String
    abstract val food : String
    abstract val habitat : String
    open var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
println("The animal is roaming")
    }

    open fun sleep() {
        "The animal is sleeping"
    }
}

fun main (){

    val animals = arrayOf(Hippo(),Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables){
        item.roam()
        if(item is Animal){
            item.eat()
        }
    }

}
