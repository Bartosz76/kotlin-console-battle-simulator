import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

//Variables defined outside of any enclosing function are top level variables.
//Functions can also be defined like that.
val name: String = "Bartosz"
var foodBeingEaten: String = "Apple"
//"?" is required for a variable to be a null. Types are non-null by default.
var simpleStringsCantBeNulls: String? = null
var chosenFaction: String? = null

val dwarves: DwarvenArmy = DwarvenArmy()
val elves: ElvenArmy = ElvenArmy()
val orcs: OrcishArmy = OrcishArmy()

fun main() {

    acquireThePlayersName()
    val playerName = readLine()
    greetThePlayer(playerName)

    showMenu(playerName)
    var chosenSide = readLine()
    provideInfoAboutTheChosenSide(chosenSide)

    Thread.sleep(3000)
    showArmyMenu()
    var chosenArmyAction = readLine()
    selectArmyAction(chosenArmyAction)
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

/**
 * Function parameters can have default values, which are used if the corresponding argument
 * is skipped. This reduces the number of overloads. E.g. I could add 'randomNumber: Int = 6'
 * to the below function which would add an Int parameter of a default value of 6.
 * Overriding methods uses the same default value as the parameter of the base method. In an
 * overriden method, the default value is not placed within the signature.
 */
fun provideInfoAboutTheChosenSide(chosenSide: String?) {
    when (chosenSide) {
        "1" -> { println(dwarvesData())
                 chosenFaction = "1" }
        "2" -> { println(orcsData())
                 chosenFaction = "2"}
        "3" -> { println(elvesData())
                 chosenFaction = "3"}
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

fun selectArmyAction(chosenArmyAction: String?) {
    when (chosenArmyAction) {
        "1" -> inspectTheArmy()
        "2" -> inspectProvisions()
        "3" -> displayUnitTrainingPanel()
        "4" -> displayEngagementOptions()
    }
}

fun inspectTheArmy() {
    when (chosenFaction) {
        "1" -> dwarves.showTheTroops()
        "2" -> orcs.showTheTroops()
        "3" -> elves.showTheTroops()
    }
}

fun inspectProvisions() {
    when (chosenFaction) {
        "1" -> dwarves.showTheSupplies()
        "2" -> orcs.showTheSupplies()
        "3" -> elves.showTheSupplies()
    }
}

fun displayUnitTrainingPanel() {

}

fun displayEngagementOptions() {

}


