package chapter5Inheritance.Monster

class Vampire : Monster () {

    override fun frighten() : Boolean{
        println("Fancy a bite?")
        return false
    }
}