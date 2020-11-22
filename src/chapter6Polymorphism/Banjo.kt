package chapter6Polymorphism

class Banjo : Strings() {
    override val type: String = "Strings"
    override val color: String = "Blue"

    override fun makeSound() {
        println("shrrrr shrrrrr")
    }

}