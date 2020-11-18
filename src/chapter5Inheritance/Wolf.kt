package chapter5Inheritance

class Wolf :Canine (){

    override val image = "Wolf.jpg"
    override val food = "Meat"
    override val habitat = "Forest"

    override fun makeNoise(){
        println("Hooooooowl!")
    }
    
    override fun eat(){
        println("The wolf is eathing food")
    }
}