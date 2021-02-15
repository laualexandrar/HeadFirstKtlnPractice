package chapter12Extra

abstract class PetPool (var name:String)

class Cat(name:String): PetPool(name)
class Dog(name: String): PetPool(name)
class Fish(name: String): PetPool(name)

class Context<T: PetPool>(){
    var scores: MutableMap<T,Int> = mutableMapOf()

    fun addScore(t:T, score: Int = 0){
        if(score >= 0) scores.put(t, score)
    }

    fun getWinners(): Set<T>{
        val highScore = scores.values.max()
        val winners = scores.filter {it.value == highScore}.keys
        winners.forEach{ println( "Winner: ${it.name}")}
        return winners


    }
}




