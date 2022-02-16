import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.logistics.EnemyGenerator
import battleSimulator.logistics.Engagement
import battleSimulator.logistics.Funds
import battleSimulator.logistics.TrainingField
import battleSimulator.orcs.OrcishArmy

private var chosenFaction: String = ""
private var enemyFaction: String = ""
private val dwarves: DwarvenArmy = DwarvenArmy()
private val elves: ElvenArmy = ElvenArmy()
private val orcs: OrcishArmy = OrcishArmy()
private val funds: Funds = Funds()
private val training: TrainingField = TrainingField()
private val engagement: Engagement = Engagement()
private val enemyGenerator: EnemyGenerator = EnemyGenerator()
private var isGameOn: Boolean = true

fun main() {

        acquireThePlayersName()
        val playerName = readLine()
        greetThePlayer(playerName)

        showMenu(playerName)
        val chosenSide = readLine()
        provideInfoAboutTheChosenSide(chosenSide)
        Thread.sleep(3000)
    
    while (isGameOn) {
        showArmyMenu()
        val chosenArmyAction = readLine()
        selectArmyAction(chosenArmyAction, chosenFaction, playerName)
    }
}

internal fun acquireThePlayersName() {
    println("Hello to the console battle simulator.")
    println("What is your name?")
}

internal fun greetThePlayer(playerName: String?) {
    //Below alternative to concatenation is called "String template". It allows me to substitute variable/argument
    //values with a predefined String template.
    println("Welcome to the CBS (console battle simulator), $playerName!")
}

internal fun showMenu(playerName: String?) {
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
internal fun provideInfoAboutTheChosenSide(chosenSide: String?) {
    when (chosenSide) {
        "1" -> { println(dwarvesData())
                 chosenFaction = "1"
                 enemyFaction = "2" }
        "2" -> { println(orcsData())
                 chosenFaction = "2"
                 enemyFaction = "3" }
        "3" -> { println(elvesData())
                 chosenFaction = "3"
                 enemyFaction = "1" }
    }
    enemyGenerator.generateTheEnemy(enemyFaction)
}

//Below three functions are defined as "single expression functions". It's a substitute for defining such a method
//within regular curvy brackets.
internal fun dwarvesData(): String =
    """
        You have chosen dwarves. Hardy, stubborn and strong, they field a vast array
        of melee units with high defensive capabilities that are near impossible to break.
        The deliverance from the shortcomings of slowness and low range is to arrive at the
        armoured hands of crossbowmen and boar riders.
    """.trimIndent()

internal fun orcsData(): String =
    """
        You have chosen orcs. Brutal and ferocious, their rooster consists of strong and
        fast units that seek to engage in their speciality - hand to hand combat, as soon as
        possible. The lack of durable equipment and low morale are gaps to be filled with
        orcs with stolen shields and shamans (whom orcs fear more than any enemy).
    """.trimIndent()

internal fun elvesData(): String =
    """
        You have chosen elves. Graceful and agile, elves specialize in ranged combat and, on a
        perfect battlefield, will harass their opponents with constant volleys of arrows, to a
        point where wardancers and swan pikemen, whose job is to make up for elves' shortcoming
        in terms of melee prowess, will not be necessary.
    """.trimIndent()

internal fun showArmyMenu() {
    println("You can now:")
    Thread.sleep(500)
    println("1. Inspect your army.")
    Thread.sleep(500)
    println("2. Inspect provisions.")
    Thread.sleep(500)
    println("3. Funds.")
    Thread.sleep(500)
    println("4. Train more units.")
    Thread.sleep(500)
    println("5. Engage the enemy.")
    Thread.sleep(500)
    println("6. Exit the game.")
}

internal fun selectArmyAction(chosenArmyAction: String?, chosenFaction: String, playerName: String?) {
    when (chosenArmyAction) {
        "1" -> inspectTheArmy()
        "2" -> inspectProvisions()
        "3" -> funds.displayFundsPanel(chosenFaction, enemyFaction)
        "4" -> training.displayUnitTrainingPanel(chosenFaction)
        "5" -> engagement.displayEngagementOptions(chosenFaction)
        "6" -> { println("See you later, $playerName!")
                 isGameOn = false } }
}

internal fun inspectTheArmy() {
    when (chosenFaction) {
        "1" -> dwarves.showTheTroops()
        "2" -> orcs.showTheTroops()
        "3" -> elves.showTheTroops()
    }
}

internal fun inspectProvisions() {
    when (chosenFaction) {
        "1" -> dwarves.showTheSupplies()
        "2" -> orcs.showTheSupplies()
        "3" -> elves.showTheSupplies()
    }
}