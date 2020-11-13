package Chapter4Classes

class Dog (var name: String, var breed: String, var weight: Int){

    fun bark(){
        println(if (weight <  30) "Yip!" else "wufff")
    }



}

fun main(){

    var myDog = Dog("Taquito", "Pug", 50 )
    var dogs = arrayOf(Dog("mimi", " Pug", 33), Dog("Paquito", "puddle", 22), Dog("Pepe", "Pug", 33))

    myDog.bark()
    myDog.weight = 22
    myDog.name = "Petunia"
    myDog.breed =  "puddle"

    dogs[0].name = "Patricio"
    println(dogs[0].name)
    println(dogs[2].name)

    dogs[1].bark()
    println(" ${myDog.name} is my dog, her breed is ${myDog.breed} and its weight is ${myDog.weight}")

}

