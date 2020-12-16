package chapter7Data
data class GroceryStore(val productName: String, val productId: Int, val quantity: Int){

}

fun main() {
    val product1 = GroceryStore ("Obleas", 2123, 6)
    val product2 = GroceryStore ("Alpinito", 9039, 9)
    val product3 = GroceryStore ("Arepa", 8790, 8)
    val product4 = GroceryStore("Empanada", 7654, 9)
    val product5 = product1.copy(productName = "Bocadillos", productId = 9889)
    val product6 = product2.copy("Bon ice", 4455)
    val product7 = GroceryStore("Obleas", 2123, 6)

    println(product1 == product7)
    println(product1 === product7)

    println(product1.hashCode())
    println(product2.hashCode())
    println(product3.hashCode())
    println(product4.hashCode())
    println(product5.hashCode())
    println(product6.hashCode())
    println(product7.hashCode())

    println(product1.toString())
    println(product1.productName)

    val products = arrayOf(product1, product2, product3, product4, product5, product6, product7)

    for (item in products){
        println(item)

    }


}