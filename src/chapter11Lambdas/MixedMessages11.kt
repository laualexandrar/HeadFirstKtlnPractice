package chapter11Lambdas

fun main() {
    val x = 20
    val y = 2.3
    val lam1 = { x: Int -> x }
    println(lam1(x + 6))

    val lam2: (Double) -> Double
    lam2 = { (it * 2) + 5 }
    println(lam2(y))

    val lamb3: (Double, Double) -> Unit
    lamb3 = { x, y -> println(x + y) } // ????  it is ignoring this?
    lamb3.invoke(y, y)

    var lam4 = { y: Int -> (y / 2).toDouble() }
    print(lam4(x))
    lam4 = { it + 6.3 }
    println(lam4(7))
}