package chapter4Classes

class Products(
    var name: String,
    var category: String,
    price_param: Int,
    color_param: String
) { // (var name: String, var category: String, var price: Int) -> this is my primary constructor

    var color = color_param.toUpperCase()
    var price = price_param
        set(value) {
            if (value > 0) field = value
        }

    val priceInColombianPesos: Int
        get() = price * 3650

    fun category() {
        if (category == "Meat & Seafood") {
            println("${name} is part of the category Meat & Seafood  wit the color $color")
        } else {
            println("$name is part of a different category")
        }
    }

    fun productPrice() {
        println(if (price > 7) "$name is expensive" else "$name is cheap")
    }
}


fun main() {

    var firstProduct =
        Products("Yogurt", "Dairy", 3, "blue") // Products("Yogurt", "Dairy", 3) this is my constructor
    var secondProduct = Products("Filet Mignon", "Meat & Seafood", 10, "pink")
    var thirdProduct = Products("Chicken", "Meat & Seafood", 9, "white")

    firstProduct.category()
    secondProduct.category()
    thirdProduct.category()
    firstProduct.productPrice()
    secondProduct.productPrice()
    thirdProduct.productPrice()


    println("The price in Colombian pesos is ${firstProduct.priceInColombianPesos}")
    firstProduct.price = 82
    println("my price is ${firstProduct.price}")


}