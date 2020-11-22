package chapter6Polymorphism

abstract class Instrument {

    abstract val type: String
    abstract val color: String
    abstract fun makeSound()


}

fun main() {
    val instruments = arrayOf(
        Banjo(),
        Flute(),
        Guitar(),
        Marimba(),
        Piano(),
        Recorder(),
        Saxophone(),
        SnareDrum(),
        Trumpet(),
        Violin()
    )

    for (item in instruments) {
        item.makeSound()
    }
}