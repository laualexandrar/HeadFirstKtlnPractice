package chapter8Null

import java.lang.Exception

class BadException : Exception()

fun riskyCode(test: String) {
    println("Start Risky code")

    if (test == "Yes") {
        throw BadException()
    }
    println("End Risky code")
}

fun main() {
    val test: String = "Yes"
    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }

    println("End of main")
}