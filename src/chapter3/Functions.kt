package chapter3

// Functions and methods

fun doSomething(msg: String, i: Int): Unit { // this do not return anything just print something
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}

fun kidsNames(name: String): Unit { // this do not return anything just print something

    println("$name Constante Roa")

}

fun sum(x: Int, y: Int, z: Int): Int { // this return the sum of all the numbers that I wrote in the sum
    return x + y + z

}

fun max( a: Int, b:Int) = if(a > b) a else b

//fun maxValue(args: Array<Int>):Int{
//    var max1 = args[0]
//    var x = 1
//    while(x < args.size){
//        var item = args[x]
//        max1 = if (max1 >= item) max1 else item
//        x = x + 1
//    }
//    return max1
//}


fun main() {
    doSomething("Hi", 2)
    kidsNames("Chonchito")
    sum(3,5,8)
    max(6,8)

}