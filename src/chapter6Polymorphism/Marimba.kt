package chapter6Polymorphism

class Marimba : Percussion() {

    override val color: String = "Gray"
    override val type: String = "Percussion"

    override fun makeSound() {
        println("pim pu rum pinm")
    }
}