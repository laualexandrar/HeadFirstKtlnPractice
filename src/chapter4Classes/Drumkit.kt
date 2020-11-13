package chapter4Classes

class Drumkit(var hasTopHat: Boolean, var hasSnare: Boolean) {


    fun playTopHat() {
        if (hasTopHat) {

            println("ding ding ba-da-bing!")
        }
    }

    fun playSnare() {
        if (hasSnare) {
            println("bang bang bag")
        }
    }
}

fun main() {

    val d = Drumkit(true, true)

    d.playTopHat()
    d.playSnare()
    d.hasSnare = false
    d.playTopHat()
    d.playSnare()

}