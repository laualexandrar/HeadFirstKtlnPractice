package chapter9Collections


fun main() {

    val petsLiam = mutableListOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")
    petsLiam.addAll(petsSophia)
    // println(petsLiam)

    petsLiam.addAll(petsNoah)
    //println(petsLiam)

    petsLiam.addAll(petsEmily)
    // println(petsLiam)

    val pets = petsLiam.toList()

    println("This is the new collections called pets: $pets")

    println("This is the size of my pets List: ${pets.size}")

    val petsSet = pets.toSet()

    println("These are the types of animals that I have: $petsSet")

    println("This is the number of types of animals that I have: ${petsSet.size}")

    val petsList = petsSet.toList()

    println("This is my list sorted: ${petsList.sorted()}")


}