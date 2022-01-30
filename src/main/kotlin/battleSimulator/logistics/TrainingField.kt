package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

internal class TrainingField: Logistics {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var elves: ElvenArmy = ElvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()

    internal fun displayUnitTrainingPanel(chosenFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. See the current army's state.")
        Thread.sleep(500)
        println("2. See training options.")
        Thread.sleep(500)
        println("3. See recommendations.")
        var chosenOption = readLine()
    }

    override fun printInitialPanelLine() {
        println("You can now:")
    }
}