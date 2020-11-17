package chapter4Classes

class KitchenProducts(
    val name: String,
    val category: String,
    val quantity: Int,
    price_param: Int,
    taste_param: String
) {

    val taste = taste_param
    var price = price_param
        set(value) {
            if (value > 0) field = value
        }

    val priceInColombian: Int
        get() = price * 3600


}

fun main() {

    val myKitchenProducts = KitchenProducts("Panela", "Sugar", 2, 3, "Sweet")

    println(
        "my kitchen is full of ${myKitchenProducts.name}, I bought ${myKitchenProducts.quantity} " +
                "of them and I found them in the ${myKitchenProducts.category} category"
    )

    println("in Colombian Pesos the ${myKitchenProducts.name} is ${myKitchenProducts.priceInColombian} ")

}