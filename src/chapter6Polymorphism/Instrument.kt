package chapter6Polymorphism

abstract class Instrument: Playable {

    abstract val type: String
    abstract val color: String
    abstract fun makeSound()

    override fun play() {
        println("The instrument is playing")
    }

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
        println(item.color)
        println(item.type)

    }
}