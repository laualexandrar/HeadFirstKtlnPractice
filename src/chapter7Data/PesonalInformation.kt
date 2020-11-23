package chapter7Data

data class PersonalInformation (val name:String, val lastName: String, val id: Int, val education: String, val address: String){

}

fun main(){
    val person1 = PersonalInformation("Pepito", "Smith", 12354321, "University,", "700 String ave")
    val person2 = PersonalInformation("Petunia", "Antonieves", 789920232, "Master", "800 Republican Street")
    val person3 = person2.copy("Ismael", "Alvarez" , 2134235)
}