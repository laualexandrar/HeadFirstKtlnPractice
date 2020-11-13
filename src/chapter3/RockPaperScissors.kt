package chapter3

class RockPaperScissors {

    //make a guess that beats the computer and win
}

fun main() {

    val myRockPaperScissors = arrayOf("Rock", "Paper", "Scissors")
    println("Welcome to the game! This is my guess")
    val computerGuess = myRockPaperScissors.random()
   // var userGuess = myRockPaperScissors.random() // ahorita debo hacer que el usuario ingrese el valor

    val userGuess: String?

    println("Please select Rock, Paper or Scissors")
    userGuess = readLine()

        println("The computer guess is $computerGuess and the user guess is $userGuess")

        if (computerGuess == userGuess) {
            println("Is a draw")
        } else if (computerGuess == myRockPaperScissors[0] && userGuess == myRockPaperScissors[2] || computerGuess == myRockPaperScissors[2] && userGuess == myRockPaperScissors[0]) {
            println("The Rock choice win. Rock can blunt scissors")
        } else if (computerGuess == myRockPaperScissors[1] && userGuess == myRockPaperScissors[2] || computerGuess == myRockPaperScissors[2] && userGuess == myRockPaperScissors[1]) {
            println("The Scissors choice win. Scissors can cut paper")
        } else if (computerGuess == myRockPaperScissors[1] && userGuess == myRockPaperScissors[0] || computerGuess == myRockPaperScissors[0] && userGuess == myRockPaperScissors[1]) {
            println("The Paper choice win. As paper can cover Rock")
        }

}




//    if (userGuess != "Rock" || userGuess != "Paper" || userGuess != "Scissors"){
//        println("Select a different Rock or Paper or Scissors")
//    }



//    var userGuess = arrayOf("Rock", "Paper", "Scissors")
//    var j = userGuess.random()
//    println(j)

//if (computerGuess == myRockPaperScissors[2] && j == userGuess[1] || i == userGuess[2] && j == myRockPaperScissors[1]) {
//    println("The Scissors choice win. Scissors can cut paper")
//} else if (computerGuess == myRockPaperScissors[0] && j == userGuess[2] || i == userGuess[0] && j == myRockPaperScissors[2]) {
//    println("The Rock choice win. Rock can blunt scissors")
//} else if (computerGuess == myRockPaperScissors[1] && j == userGuess[0] || i == userGuess[1] && j == myRockPaperScissors[0]) {
//    println("The Paper choice win. As paper can cover Rock")
//}
//}


