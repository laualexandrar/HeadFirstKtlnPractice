package chapter6Polymorphism

class Violin : Strings() {
    override val color:String = "Red"
    override val type:String = "Strings"

    override fun makeSound(){
        println("nnnnggggg nggggn ngngngngngn")
    }
}