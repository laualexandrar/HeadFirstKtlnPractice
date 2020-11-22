package chapter6Polymorphism

class Guitar : Strings() {
    override val color: String = "Orange"
    override val type: String = "Strings"

    override fun makeSound() {
        println("wrrrrriiiiiinmgg")
    }

}