package chapter5Inheritance

import java.awt.Image

open class Animal {

    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making noise")
    }

    open fun eat() {
        println("The animal is eating ")
    }

    open fun roam() {

    }

    open fun sleep() {
        "The animal is sleeping"
    }
}
