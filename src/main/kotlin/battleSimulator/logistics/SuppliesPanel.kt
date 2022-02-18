package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenArmy
import battleSimulator.elves.ElvenArmy
import battleSimulator.orcs.OrcishArmy
import kotlin.random.Random

internal class SuppliesPanel: Logistics {

    private var dwarves: DwarvenArmy = DwarvenArmy()
    private var orcs: OrcishArmy = OrcishArmy()
    private var elves: ElvenArmy = ElvenArmy()
    private var enemyGenerator: EnemyGenerator = EnemyGenerator

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
            "3" -> {
                println(enemyGenerator.enemyProvisions.toString())
                spoilTheEnemyProvisions()
                println(enemyGenerator.enemyProvisions.toString()) }
            }
        }

    private fun spoilTheEnemyProvisions() {
        if (seeIfTheSpoilingWasSuccessful()) {
           val randomizeIndex = Random.nextInt(0, enemyGenerator.enemyProvisions.size)
           val randomEntry: MutableMap.MutableEntry<Provisions, Int> = enemyGenerator.enemyProvisions.entries.elementAt(randomizeIndex)
           val provisions = randomEntry.key
            if (enemyGenerator.enemyProvisions[provisions] == 1) {
                enemyGenerator.enemyProvisions.remove(provisions)
            } else {
                enemyGenerator.enemyProvisions[provisions] = enemyGenerator.enemyProvisions[provisions]!!.minus(1)
            }
        } else {
            println("lol fail")
        }
    }

    private fun seeIfTheSpoilingWasSuccessful(): Boolean {
        var wasSuccessful = false
        val chance: Int = Random.nextInt(0, 10)
        if (chance < 5) {
            wasSuccessful = true
        }
        return wasSuccessful
    }
}







