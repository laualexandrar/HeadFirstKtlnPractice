package chapter6Polymorphism

class Trumpet : Brass() {

    override val color: String = "Gold"
    override val type: String = "Brass"

    override fun makeSound() {
        println("tururururu tu ru ruuu tututu tuuuu")
    }
}