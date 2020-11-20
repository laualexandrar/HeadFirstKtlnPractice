package chapter5Inheritance

class Vet {

    fun giveShot(animal: Animal){

        //do something medical to the animal
        animal.makeNoise()
    }
}

fun main (){

    val animals = arrayOf(Hippo(),Wolf())
    for (item in animals){
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    vet.giveShot(wolf)
    vet.giveShot(hippo)

}