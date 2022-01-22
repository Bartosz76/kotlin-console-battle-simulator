//Variables defined outside of any enclosing function are top level variables.
//Functions can also be defined like that.
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

    Thread.sleep(3000)
    showArmyMenu()

}

fun acquireThePlayersName() {
    println("Hello to the console battle simulator.")
    println("What is your name?")
}

fun greetThePlayer(playerName: String?) {
    //Below alternative to concatenation is called "String template". It allows me to substitute variable/argument
    //values with a predefined String template.
    println("Welcome to the CBS (console battle simulator), $playerName!")
}

fun showMenu(playerName: String?) {
    println("Which side do you prefer to play as, $playerName?")
    Thread.sleep(500)
    println("1. Dwarves")
    Thread.sleep(500)
    println("2. Orcs")
    Thread.sleep(500)
    println("3. Elves")
    Thread.sleep(500)
}

fun provideInfoAboutTheChosenSide(chosenSide: String?) {
    when (chosenSide) {
        "1" -> println(dwarvesData())
        "2" -> println(orcsData())
        "3" -> println(elvesData())
    }
}
//Below three functions are defined as "single expression functions". It's a substitute for defining such a method
//within regular curvy brackets.
fun dwarvesData(): String =
    """
        You have chosen dwarves. Hardy, stubborn and strong, they field a vast array
        of melee units with high defensive capabilities that are near impossible to break.
        The deliverance from the shortcomings of slowness and low range is to arrive at the
        armoured hands of crossbowmen and boar riders.
    """.trimIndent()

fun orcsData(): String =
    """
        You have chosen orcs. Brutal and ferocious, their rooster consists of strong and
        fast units that seek to engage in their speciality - hand to hand combat, as soon as
        possible. The lack of durable equipment and low morale are gaps to be filled with
        orcs with stolen shields and shamans (whom orcs fear more than any enemy).
    """.trimIndent()

fun elvesData(): String =
    """
        You have chosen elves. Graceful and agile, elves specialize in ranged combat and, on a
        perfect battlefield, will harass their opponents with constant volleys of arrows, to a
        point where wardancers and swan pikemen, whose job is to make up for elves' shortcoming
        in terms of melee prowess, will not be necessary.
    """.trimIndent()

fun showArmyMenu() {
    println("You can now:")
    Thread.sleep(500)
    println("1. Inspect your army.")
    Thread.sleep(500)
    println("2. Inspect provisions.")
    Thread.sleep(500)
    println("3. Train more units.")
    Thread.sleep(500)
    println("4. Engage the enemy.")
}