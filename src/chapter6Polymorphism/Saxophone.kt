package chapter6Polymorphism

class Saxophone : Brass() {
    override val color: String = "Yellow"
    override val type: String = "Brass"

    override fun makeSound() {
        println("tuuuufluuuuturu")
    }
}