package chapter6Polymorphism

class Piano : Strings() {
    override val color: String = "Black"
    override val type: String = "Strings"

    override fun makeSound() {
        println("tun tun tun tuuuuun")
    }
}