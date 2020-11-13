package chapter4Classes

class Employees(var name: String, var lastName: String, var age: Int) {

    fun data() {
        println("The employee with name: $name, and last name $lastName and age $age")
    }

    fun age() {
        if (age < 60) {
            println("The employee: $name is $age years old")
        } else {
            println("Is retired")
        }
    }


}

fun main() {

    val employee1 = Employees("Ramiro", "Palacios", 34)
    val employee2 = Employees("Pepe", "Posada", 90)
    val employee3 = Employees("Paulo", "Picasso", 77)

    employee1.name = "Patricia"

    employee1.data()
    employee2.data()
    employee3.data()
    employee1.age()
    employee2.age()
    employee3.age()


}