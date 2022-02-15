package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy
import kotlin.random.Random

internal class Funds: Logistics {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var elves: ElvenArmy = ElvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()
    private var enemyGenerator: EnemyGenerator = EnemyGenerator()

    internal fun displayFundsPanel(chosenFaction: String, enemyFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Inspect your funds.")
        Thread.sleep(500)
        println("2. Collect taxes.")
        Thread.sleep(500)
        println("3. Raid the enemy.")
        when (readLine()) {
            "1" -> inspectTheFunds(chosenFaction)
            "2" -> displayTaxesPanel(chosenFaction, enemyFaction)
            "3" -> raidTheEnemy(chosenFaction, enemyFaction)
        }
    }

    private fun inspectTheFunds(chosenFaction: String) {
        when (chosenFaction) {
            "1" -> dwarves.showTheFunds()
            "2" -> orcs.showTheFunds()
            "3" -> elves.showTheFunds()
        }
    }

    private fun displayTaxesPanel(chosenFaction: String, enemyFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Show population's happiness.")
        Thread.sleep(500)
        println("2. Collect taxes.")
        Thread.sleep(500)
        println("3. Raid the enemy's supply lines.")
        when (readLine()) {
            "1" -> showPopulationsHappiness(chosenFaction)
            "2" -> collectTaxes(chosenFaction)
            "3" -> raidTheEnemy(chosenFaction, enemyFaction)
        }
    }

    private fun showPopulationsHappiness(chosenFaction: String) {
        when (chosenFaction) {
            "1" -> dwarves.showPopulationHappiness()
            "2" -> orcs.showPopulationHappiness()
            "3" -> elves.showPopulationHappiness()
        }
    }

    private fun collectTaxes(chosenFaction: String) {
        val taxesCollected: Double = estimateTheAmountOfTaxMoneyGathered()
            .also { println("Managed to collect $it.") }
        when (chosenFaction) {
            "1" -> { dwarves.changeTheStateOfTheTreasury(taxesCollected, false)
                     dwarves.influencePopulationsHappiness(5, false) }
            "2" -> { orcs.changeTheStateOfTheTreasury(taxesCollected, false)
                     orcs.influencePopulationsHappiness(5, false) }
            "3" -> { elves.changeTheStateOfTheTreasury(taxesCollected, false)
                     elves.influencePopulationsHappiness(5, false) }
        }
    }

    private fun estimateTheAmountOfTaxMoneyGathered(): Double {
        return Random.nextDouble(5.0, 15.0)
    }

    private fun raidTheEnemy(chosenFaction: String, enemyFaction: String) {
        val wasThwarted = seeIfTheRaidWasSuccessful()
        val raidResult: Double = estimateTheAmountOfLootGathered(wasThwarted, enemyFaction)
            .also { if (!wasThwarted) { println("Managed to loot $it!") }
                    else { println("The raid was thwarted and you lost $it!") } }
        when (chosenFaction) {
            "1" -> { dwarves.changeTheStateOfTheTreasury(raidResult, !wasThwarted)
                     dwarves.influencePopulationsHappiness(5, !wasThwarted) }
            "2" -> { orcs.changeTheStateOfTheTreasury(raidResult, !wasThwarted)
                     orcs.influencePopulationsHappiness(5, !wasThwarted) }
            "3" -> { elves.changeTheStateOfTheTreasury(raidResult, !wasThwarted)
                     elves.influencePopulationsHappiness(5, !wasThwarted) }
        }
    }

    private fun estimateTheAmountOfLootGathered(wasThwarted: Boolean, enemyFaction: String): Double {
        return if (!wasThwarted) {
            Random.nextDouble(3.0, 25.0)
        } else {
            println("The enemy grows weary and strengthen their forces...")
            enemyGenerator.randomlyGenerateTroops(enemyFaction)
            Random.nextDouble(3.0, 10.0)
        }
    }

    private fun seeIfTheRaidWasSuccessful(): Boolean {
        var wasThwarted = false
        val chance: Int = Random.nextInt(0, 10)
        if (chance < 5) {
            wasThwarted = true
        }
        return wasThwarted
    }
}