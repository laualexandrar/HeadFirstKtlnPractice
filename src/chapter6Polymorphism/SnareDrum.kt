package chapter6Polymorphism

class SnareDrum : Percussion() {
    override val color: String = "Purple "
    override val type: String = "Percussion"

    override fun makeSound() {
        println("Pam pam paaam para pam pam")
    }
}