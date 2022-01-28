package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

class Funds {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var elves: ElvenArmy = ElvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()

    fun displayFundsPanel(chosenFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Inspect your funds.")
        Thread.sleep(500)
        println("2. Collect taxes.")
        Thread.sleep(500)
        println("3. Raid the enemy.")
        var chosenOption = readLine()
        when (chosenOption) {
            "1" -> inspectTheFunds(chosenFaction)
            "2" -> displayTaxesPanel(chosenFaction)
            "3" -> raidTheEnemy()
        }
    }

    private fun inspectTheFunds(chosenFaction: String) {
        when (chosenFaction) {
            "1" -> dwarves.showTheFunds()
            "2" -> orcs.showTheFunds()
            "3" -> elves.showTheFunds()
        }
    }

    private fun displayTaxesPanel(chosenFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Show population's happiness.")
        Thread.sleep(500)
        println("2. Collect taxes.")
        var chosenOption = readLine()
        when (chosenOption) {
            "1" -> showPopulationsHappiness(chosenFaction)
            "2" -> collectTaxes(chosenFaction)
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
        when (chosenFaction) {
            "1" -> dwarves.influencePopulationsHappiness(5, false)
            "2" -> orcs.influencePopulationsHappiness(5, false)
            "3" -> elves.influencePopulationsHappiness(5, false)
        }
    }

    private fun raidTheEnemy() {

    }

    private fun printInitialPanelLine() {
        println("You can now:")
    }
}