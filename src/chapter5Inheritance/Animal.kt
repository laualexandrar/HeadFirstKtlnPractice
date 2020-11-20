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

