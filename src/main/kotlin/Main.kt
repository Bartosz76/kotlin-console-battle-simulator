//Variables defined outside of any enclosing function are top level variables.
val name: String = "Bartosz"
var foodBeingEaten: String = "Apple"
//"?" is required for a variable to be a null. Types are non-null by default.
var simpleStringsCantBeNulls: String? = null

fun main() {
    acquireThePlayersName()
    val playerName = readLine()
    greetThePlayer(playerName)

    showMenu(playerName)
    var chosenSide = readLine()
    provideInfoAboutTheChosenSide(chosenSide)

}

fun acquireThePlayersName() {
    println("Hello to the console battle simulator.")
    println("What is your name?")
}

fun greetThePlayer(playerName: String?) {
    println("Welcome to the CBS (console battle simulator), $playerName!")
}

fun showMenu(playerName: String?) {
    println("Which side do you prefer to play as, $playerName?")
    Thread.sleep(1_000)
    println("1. Dwarves")
    println("2. Orcs")
}

fun provideInfoAboutTheChosenSide(chosenSide: String?) {
    when (chosenSide) {
        "1" -> dwarvesData()
        "2" -> orcsData()
    }
}

fun dwarvesData() {
    println("Khazukan Kazakit-ha!")
}

fun orcsData() {
    println("Lok'tar ogar!")
}
