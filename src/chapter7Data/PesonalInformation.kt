package chapter7Data

data class PersonalInformation (val name:String, val lastName: String, val id: Int, val education: String, val address: String){

}

fun addInfo(name: String, lastName: String): String{
    return "$name $lastName"
}

fun main(){
    val person1 = PersonalInformation("Pepito", "Smith", 12354321, "University,", "700 String ave")
    val person2 = PersonalInformation("Petunia", "Antonieves", 789920232, "Master", "800 Republican Street")
    val person3 = person2.copy("Ismael", "Alvarez" , 2134235)
    val person4 = person1.copy(address = "900 Seneca avenue")
    val person5 = person3.copy()

    println(person1.hashCode())
    println(person2.hashCode())
    println( person3.hashCode())
    println(person4.hashCode())
    println(person5.hashCode())

    println(" ${person3 === person5}")
    println("${person3 == person5}")

    println("this is the information inside this val: ${person1.toString()}")
    println("this is the information inside this val: ${person2.toString()}")
    println("this is the information inside this val: ${person3.toString()}")
    println("this is the information inside this val: ${person4.toString()}")
    println(person5.toString())

    println("")

    println(addInfo("patricia" , "Smith"))
}