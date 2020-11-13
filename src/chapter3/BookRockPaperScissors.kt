package chapter3

class BookRockPaperScissors {

}

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]


fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        // ask the user for their choice
        print("Please enter one of the following: ")
        for (item in optionsParam) print(" $item")
        println(".")
        //to read the user's response
        var userInput = readLine()
        if (userInput != null) {
            userInput = userInput.capitalize()
        }

        //validate  the user Input
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        // if the choice is invalid inform the user
        if (!isValidChoice) println("You must select a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Figure out the result
    if (userChoice == gameChoice) result = "Tie"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) result = "You Win"
    else result = "You Lose!"
    //print the result
    println("You chose $userChoice. I chose $gameChoice. $result")
}



