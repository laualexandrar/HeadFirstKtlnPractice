package chapter11Lambdas

typealias DoubleConversion = (Double) -> Double // this alias called DoubleConversion is going to replace the (Double) -> Double

fun convert(x: Double,
    converter: DoubleConversion): Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun getConversionLambda(str: String): DoubleConversion {
    if (str == "CentigradeToFahrenheit") {
        return { it * 1.8 + 32 }
    } else if (str == "kgsToPounds") {
        return { it * 2.204623 }
    } else if (str == "PoundsToUsTons") {
        return { it / 2000.0 }
    } else {
        return { it }
    }
}

fun combine(lambda1: DoubleConversion, lambda2: DoubleConversion): DoubleConversion {
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {

    //convert 2.5kg to pounds
    println("Convert 2.5 kg to Pounds: ${getConversionLambda("kgsToPounds")(2.5)}")

    //Define two conversion Lambdas
    val kgsToPoundsLambda = getConversionLambda("kgsToPounds")
    val poundsToUsTonsLambda = getConversionLambda("PoundsToUsTons")

    //combine the two lambdas to create a new one
    val kgsToUsTonsLambda = combine(kgsToPoundsLambda, poundsToUsTonsLambda)

    //use the new lambda to convert 17.4 to US tons
    val value = 17.4
    println("$value kgs is ${convert(value, kgsToUsTonsLambda)} US tons")

}


//fun main() {
//
////    convert(20.0) { it * 1.8 + 32 }
////    convertFive { it * 1.8 + 32 }
////    var addFive = {x: Int -> x + 5}
////    println("Pass 6 to addFive: ${addFive(6)}")
////
////    val addInts = {x:Int, y: Int -> x + y}
////    val result = addInts.invoke(6,7)
////    println("Pass 6, 7 to addInts: $result")
////
////    val intLambda: (Int, Int) -> Int = {x, y -> x * y}
////    println("Pass 10, 11 to intLambda: ${intLambda(10,11)}")
////
////    val addSeven: (Int) -> Int = {it + 7}
////    println("Pass 12 to addSeven: ${addSeven(12)}")
////
////    val myLambda: () -> Unit = { println("Hi!")}
////    myLambda()
//
//}


//fun convertFive(converter: (Int) -> Double): Double {
//    val result = converter(5)
//    println("5 is converted to $result")
//    return result
//}
