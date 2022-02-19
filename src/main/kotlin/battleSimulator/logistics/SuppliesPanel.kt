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
            "3" -> { spoilTheEnemyProvisions(chosenFaction) }
            }
        }

    private fun spoilTheEnemyProvisions(chosenFaction: String) {
        if (seeIfTheSpoilingWasSuccessful()) {
           val randomizeIndex = Random.nextInt(0, enemyGenerator.enemyProvisions.size)
           val randomEntry: MutableMap.MutableEntry<Provisions, Int> = enemyGenerator.enemyProvisions.entries.elementAt(randomizeIndex)
           val provisions = randomEntry.key
            if (enemyGenerator.enemyProvisions[provisions] == 1) {
                enemyGenerator.enemyProvisions.remove(provisions)
            } else {
                enemyGenerator.enemyProvisions[provisions] = enemyGenerator.enemyProvisions[provisions]!!.minus(1)
            }
            println("You have managed to spoil a ration of $provisions!")
        } else {
            estimateTheAmountOfFundsLost(chosenFaction)
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

    private fun estimateTheAmountOfFundsLost(chosenFaction: String) {
            var fundsLost = Random.nextDouble(3.0, 10.0)
            if (checkIfCriticalFailure()) {
                var critical = fundsLost.worsenTheResult()
                fundsLost = critical
            }
            var currencyType = ""
            when (chosenFaction) {
                "1" -> { dwarves.changeTheStateOfTheTreasury(fundsLost, false)
                         currencyType = "gold"
                }
                "2" -> { orcs.changeTheStateOfTheTreasury(fundsLost, false)
                         currencyType = "shinies"
                }
                "3" -> { elves.changeTheStateOfTheTreasury(fundsLost, false)
                         currencyType = "emeralds"
                }
            }
        println("You have failed to harm the enemy's provision and you've lost $fundsLost $currencyType in the attempt!")
        }

    private fun checkIfCriticalFailure(): Boolean {
        println("The attempt was critically bad!")
        return Random.nextInt(1, 2) == 1
    }

    private fun Double.worsenTheResult(): Double {
        return this * 2
    }

    }








