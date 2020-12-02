package PracticingCoding

class HomeAppliances(val name: String, val type: String, val quantity: Int) {

}

fun main() {

    val myHomeAppliances = HomeAppliances("Stove", "Electric", 1)
    val myHomeAppliancesArray = arrayOf(
        HomeAppliances("Fridge", "Electric", 2),
        HomeAppliances("Microwave", "Electric", 3), HomeAppliances("washing machine", "Electric", 4),
        HomeAppliances("Computer", "Electric", 4)
    )

    println("${myHomeAppliancesArray[1].name} ${myHomeAppliancesArray[2].name} ${myHomeAppliancesArray[3].name}")

    for (item in myHomeAppliancesArray) {
        println(item.name)
        println(item.type)
        println(item.quantity)
    }
}