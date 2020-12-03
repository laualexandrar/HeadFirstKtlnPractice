package chapter8Null

class BadException2 : Exception()

fun myFunction(test: String) {
    try {
        print("t")
        riskyCode1(test)
        print("o")
    } catch (e: BadException2) {
        print("a")

    } finally {

        print("w")

    }
    print("s")

}

fun riskyCode1(test: String) {


    print("h")

    if (test == "yes") {
        throw BadException2()
    }
    print("r")

}



