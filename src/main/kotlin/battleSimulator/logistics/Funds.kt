package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

class Funds {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var elves: ElvenArmy = ElvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()

    fun displayFundsPanel(chosenFaction: String) {
        println("You can now:")
        Thread.sleep(500)
        println("1. Inspect your funds.")
        Thread.sleep(500)
        println("2. Collect taxes.")
        Thread.sleep(500)
        println("3. Raid the enemy.")
        var chosenOption = readLine()
        when (chosenOption) {
            "1" -> inspectTheFunds(chosenFaction)
            "2" -> collectTaxes(chosenFaction)
        }
    }

    fun inspectTheFunds(chosenFaction: String) {
        when (chosenFaction) {
            "1" -> dwarves.showTheFunds()
            "2" -> orcs.showTheFunds()
            "3" -> elves.showTheFunds()
        }
    }

    fun collectTaxes(chosenFaction: String) {
        when (chosenFaction) {
            "1" -> dwarves.showPopulationHappiness()
            "2" -> orcs.showPopulationHappiness()
            "3" -> elves.showPopulationHappiness()
        }
    }
}