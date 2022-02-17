package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

internal class SuppliesPanel: Logistics {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()
    private var elves: ElvenArmy = ElvenArmy()

    internal fun displaySuppliesPanel(chosenFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Inspect your provisions.")
        Thread.sleep(500)
        println("2. Acquire more provisions.")
        Thread.sleep(500)
        println("3. Spoil the enemy's provisions.")
        when (readLine()) {
            "1" -> {
                when (chosenFaction) {
                "1" -> dwarves.showTheSupplies()
                "2" -> orcs.showTheSupplies()
                "3" -> elves.showTheSupplies()
            }}
            "2" -> {}
            "3" -> { spoilTheEnemyProvisions() }
            }
        }
    }

    internal fun spoilTheEnemyProvisions() {

    }



