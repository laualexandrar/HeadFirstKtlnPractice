package Chapter4Classes

class Products(
    var name: String,
    var category: String,
    var price: Int
) { // (var name: String, var category: String, var price: Int) -> this is my primary constructor

    fun category() {
        if (category == "Meat & Seafood") {
            println("${name} is part of the category Meat & Seafood ")
        } else {
            println("$name is part of a different category")
        }
    }

    fun productPrice() {
        println(if (price > 7) "$name is expensive" else "$name is cheap")
    }
}


fun main() {

    var firstProduct = Products("Yogurt", "Dairy", 3) // Products("Yogurt", "Dairy", 3) this is my constructor
    var secondProduct = Products("Filet Mignon", "Meat & Seafood", 10)
    var thirdProduct = Products("Chicken", "Meat & Seafood", 9)

    firstProduct.category()
    secondProduct.category()
    thirdProduct.category()
    firstProduct.productPrice()
    secondProduct.productPrice()
    thirdProduct.productPrice()


}