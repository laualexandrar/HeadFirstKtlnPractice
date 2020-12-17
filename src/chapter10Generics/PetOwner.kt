package chapter10Generics

class PetOwner<T : Pet> (t:T){ // here, T is a generic type of Pet. The (t: T) is my constructor

    val pets = mutableListOf(t) // this creates a MutableList<T>

    fun add(t: T) { // add T values
        pets.add(t)
    }

    fun remove(t: T) { // Remove T values
        pets.remove(t)
    }
}

fun main() {
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("katzu")
    val fishFinny = Fish("Finny McGraw")
    val catOwner = PetOwner(catFuzz)

    catOwner.add(catKatsu) // here I call fun add
    catOwner.remove(catFuzz) // here I call ufn remove
}