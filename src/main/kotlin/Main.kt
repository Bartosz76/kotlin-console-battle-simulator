//Variables defined outside of any enclosing function are top level variables.
val name: String = "Bartosz"
var foodBeingEaten: String = "Apple"
//"?" is required for a variable to be a null. Types are non-null by default.
var simpleStringsCantBeNulls: String? = null

fun main() {
    greetThePlayer()
}

fun greetThePlayer() {
    println("Hello to the console battle simulator.")
    println("What is your name?")
    val playerName = readLine()

    println("Welcome to the CBS (console battle simulator), $playerName!")
}



fun validatedPrinter() {
}