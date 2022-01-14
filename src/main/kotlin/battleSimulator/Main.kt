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
    println("3. Elves")
}

fun provideInfoAboutTheChosenSide(chosenSide: String?) {
    when (chosenSide) {
        "1" -> dwarvesData()
        "2" -> orcsData()
        "3" -> elvesData()
    }
}

fun dwarvesData() {
    println("You have chosen dwarves. Hardy, stubborn and strong, they field a vast array " +
            "of melee units with high defensive capabilities that are near impossible to break." +
            "The deliverance from the shortcomings of slowness and low range is to arrive at the" +
            "armoured hands of crossbowmen and boar riders.")
}

fun orcsData() {
    println("You have chosen orcs. Brutal and ferocious, their rooster consists of strong and" +
            "fast units that seek to engage in their speciality - hand to hand combat, as soon as" +
            "possible. The lack of durable equipment and low morale are gaps to be filled with" +
            "orcs with stolen shields and shamans (whom orcs fear more than any enemy).")
}

fun elvesData() {
    println("You have chosen elves. Graceful and agile, elves specialize in ranged combat and, on a" +
            "perfect battlefield, will harass their opponents with constant volleys of arrows, to a" +
            "point where wardancers and swan pikemen, whose job is to make up for elves' shortcoming" +
            "in terms of melee prowess, will not be necessary.")
}
