package PracticingCoding.Library

abstract class Library {
}

fun main() {
    val myMovie = arrayOf(Movies(13245, "Finding Nemo", 2004),
        Movies(13224, "Soul", 2020), Movies(234425, "The Croods", 2012),
        Movies(67990, "Monsters Inc", 2005)
    )

    println(myMovie[0].id)
    println(myMovie[0].name)
    println(myMovie[0].year)

    println(myMovie[1].id)
    println(myMovie[1].name)
    println(myMovie[1].year)

    println(myMovie[2].id)
    println(myMovie[2].name)
    println(myMovie[2].year)

    for (item in myMovie){
        println("The movie ${item.name} with the id number ${item.id} was made in ${item.year}")
        println(item.name)
        println(item.year)
    }

}