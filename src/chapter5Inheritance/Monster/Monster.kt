package chapter5Inheritance.Monster

open class Monster {
    open fun frighten() : Boolean{
        println("Aargh!")
       return true
    }
}

fun main(){
    val m = arrayOf(Vampire(), Dragon(),Monster())

    for (item in m){
        item.frighten()
    }
}