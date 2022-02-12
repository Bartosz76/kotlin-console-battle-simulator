package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy

internal class Engagement: Logistics {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()
    private var elves: ElvenArmy = ElvenArmy()

    internal fun displayEngagementOptions(chosenFaction: String) {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Attack the enemy.")
        Thread.sleep(500)
        println("2. Send scouts.")
        Thread.sleep(500)
        when (readLine()) {
            "1" -> { displayBattlePanel(chosenFaction) }
            "2" -> { displayScoutingOptions(chosenFaction) }
        }
    }

    private fun displayScoutingOptions(chosenFaction: String) {
        println("You have the following scouting options:")
        Thread.sleep(500)
        println("1. Get the measure of your enemy.")
        Thread.sleep(500)
        println("2. Hinder the enemy's provisions.")
        Thread.sleep(500)
        when (readLine()) {
            "1" -> {}
            "2" -> {}
        }
    }

    private fun displayBattlePanel(chosenFaction: String) {
        printBattleIntroduction()
        Thread.sleep(500)
        println("1. Send picked units.")
        Thread.sleep(500)
        println("2. Mass charge.")
        when (readLine()) {
            "1" -> {}
            "2" -> {}
        }
    }

    private fun printBattleIntroduction() {
        println("The battle begins!")
    }
}