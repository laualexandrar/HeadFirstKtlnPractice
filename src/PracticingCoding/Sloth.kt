package PracticingCoding

open class Mammal(val name: String){
    fun eat() {}
    fun sleep() {}
}

data class Sloth(val slothName: String, val isTwoFingered: Boolean) : Mammal(slothName)

data class Panda(val pandaName:String): Mammal(pandaName)

fun feedCrew(crew: List<Mammal>){
    crew.forEach {
        it.eat()
        println(it.name + " ate some rad leaves!")
    }
}

fun feedCrewP(crew: List<Panda>){
    crew.forEach {
        it.eat()
        println(it.name + " ate some rad leaves!")
    }
}

fun main() {
    val sloth: Sloth

    val slothCrew = listOf(
        Sloth("Jerry", false),
        Sloth("Bae", true),
        Sloth("Alex", false)
    )

    feedCrew(slothCrew)

    val pandaCrew = listOf(
        Panda("Jerry"),
        Panda("Bae")
    )

    feedCrew(pandaCrew)

    val squaaadd = listOf(
        Sloth("Jerry", false),
        Sloth("Bae", true),
        Sloth("Alex", false),
        Panda("Tegan"),
        Panda("Peggy")
    )

    val compareByNames = Comparator {a: Mammal, b: Mammal ->
        a.name.first().toInt() - b.name.first().toInt()
    }

    println("____________________________________________")

    squaaadd.sortedWith(compareByNames).forEach(::println)

    val slothList: List<Sloth> = listOf()
    //val slothlist = listOf<Sloth>()    this is another way to define my list
}