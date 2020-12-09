package chapter9Collections


fun main() {

    val petsLiam = mutableListOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", " Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    val petsCopy = petsLiam.toList()
    println(petsCopy)

    val petsMutable = mutableListOf(petsCopy)

    println(petsMutable)


}