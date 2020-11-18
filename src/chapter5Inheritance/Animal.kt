package chapter5Inheritance

import java.awt.Image

open class Animal {

    open val image = ""
    open val food = ""
    open val habitat = ""
    open var hunger = 10

    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat() {
        println("The animal is eating ")
    }

    open fun roam() {
println("The animal is roaming")
    }

    open fun sleep() {
        "The animal is sleeping"
    }
}

//fun main() {
//    val animals = arrayOf(Hippo(), Wolf())
//    for (item in animals) {
//        item.roam()
//        item.makeNoise()
//        item.sleep()
//        item.eat()
//    }
//}
