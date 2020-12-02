package chapter8Null

class BadException2 : Exception()

fun myFunction(test: String) {
    try {

        if (test == "yes") {

        }
    } catch (e: BadException2) {

        throw BadException2()

    } finally {
        print("s")
    }
}

fun riskyCode1(test: String) {

}



