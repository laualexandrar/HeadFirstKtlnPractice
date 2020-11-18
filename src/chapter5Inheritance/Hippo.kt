package chapter5Inheritance

class Hippo: Animal() {

    override val image = "Hippo.jpg"

    override val food = "grass"

    override val habitat = " water"

    init {
         hunger = 3
    }

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println(" The Hippo is eating $food")
    }
}