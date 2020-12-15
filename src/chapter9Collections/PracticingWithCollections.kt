package chapter9Collections

data class Destination(var name: String)

fun main() {
    val mDestinationsArray = arrayOf("Colombia", "USA", "Venezuela", "Peru", "India", "Japan", "Argentina")

    mDestinationsArray[2] = "Italy"

    for (item in mDestinationsArray) {
        println(item)
    }

    val mDestinationsList = listOf(
        "Orlando",
        "Austin",
        "Las Vegas",
        "Seattle",
        "New York",
        "Portland",
        "Los Angeles",
        "San Francisco",
        "Seattle",
        "Portland"
    )
    println(mDestinationsList.size)
    println(mDestinationsList)
    val mDestinationsSet = mDestinationsList.toMutableSet()
    mDestinationsSet.add("New Jersey")
    mDestinationsSet.add("Seattle")
    println(mDestinationsSet)
    println(mDestinationsSet.size)

    val d1 = Destination("Chicago")
    val d2 = Destination("Fairfield")
    val d3 = Destination("Seattle")
    val d4 = Destination("Chicago")
    val d5 = Destination("Fairfield")
    val d6 = Destination("Washington DC")
    val d7 = Destination("Washington DC")
    val d8 = Destination("Philadelphia")

    val mMyDestinations = mutableMapOf("destination1" to d1, "destination2" to d2, "destination3" to d3,
        "destination4" to d4, "destination5" to d5, "destination6" to d6, "destination7" to d7, "destination8" to d8)
        println("$mMyDestinations")


}