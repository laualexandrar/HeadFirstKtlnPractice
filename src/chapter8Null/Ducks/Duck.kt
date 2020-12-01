package chapter8Null.Ducks

class Duck (val height:Int? = null) {
    fun quack(){
        println("Quack!, Quack!")
    }
}