package chapter6Polymorphism

class Recorder : Woodwinds() {

    override val color: String = "Yellow"
    override val type: String = "Woodwinds"
    override fun makeSound() {
        println("fluuueee ueeeeeee")
    }
}