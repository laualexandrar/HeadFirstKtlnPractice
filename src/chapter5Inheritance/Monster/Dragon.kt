package chapter5Inheritance.Monster

class Dragon : Monster() {
    override fun frighten() : Boolean { // The booleans are here just to teach me that the types that I define in the super class have to be the same in the  subclasses
        println("Fire!")
        return true
    }
}