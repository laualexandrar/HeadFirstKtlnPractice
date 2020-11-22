package chapter6Polymorphism

class Flute : Woodwinds() {
    override val color: String = "White"
    override val type: String = "Woodwinds"
    override fun makeSound() {
        println("fluuuue fluuuuee")
    }
}