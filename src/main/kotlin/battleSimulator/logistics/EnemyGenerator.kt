package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenProvisions
import battleSimulator.dwarves.DwarvenUnit
import battleSimulator.elves.ElvenProvisions
import battleSimulator.elves.ElvenUnit
import battleSimulator.orcs.OrcishProvisions
import battleSimulator.orcs.OrcishUnit
import kotlin.random.Random

class EnemyGenerator {

    var enemyArmy = mutableMapOf<Unit, Int>()
    var enemyProvisions = mutableMapOf<Provisions, Int>()

    internal fun generateTheEnemy(enemyFaction: String) {
        when (enemyFaction) {
            "1" -> { generateDwarvenArmy() }
            "2" -> { generateOrcishArmy() }
            "3" -> { generateElvenArmy() }
        }
        generateProvisions(enemyFaction)
    }

    private fun generateDwarvenArmy() {
        enemyArmy[DwarvenUnit.SHIELDBEARERS] = 6
        enemyArmy[DwarvenUnit.AXEMEN] = 8
        enemyArmy[DwarvenUnit.HAMMERERS] = 4
        enemyArmy[DwarvenUnit.AXETHROWERS] = 8
        enemyArmy[DwarvenUnit.CROSSBOWMEN] = 6
        enemyArmy[DwarvenUnit.BOAR_RIDERS] = 4
        enemyArmy[DwarvenUnit.RUNE_PRIESTS] = 3
    }

    private fun generateOrcishArmy() {
        enemyArmy[OrcishUnit.ORCS_WITH_STOLEN_SHIELDS] = 6
        enemyArmy[OrcishUnit.CLUBBERS] = 8
        enemyArmy[OrcishUnit.BIG_AXES] = 4
        enemyArmy[OrcishUnit.JAVELINERS] = 8
        enemyArmy[OrcishUnit.ROCK_LOBBERS] = 6
        enemyArmy[OrcishUnit.WOLF_RIDERS] = 4
        enemyArmy[OrcishUnit.SHAMANS] = 3
    }

    private fun generateElvenArmy() {
        enemyArmy[ElvenUnit.WARDANCERS] = 6
        enemyArmy[ElvenUnit.SWAN_PIKEMEN] = 8
        enemyArmy[ElvenUnit.HUNTERS] = 4
        enemyArmy[ElvenUnit.LONGBOWS] = 8
        enemyArmy[ElvenUnit.ARCANE_BOWS] = 6
        enemyArmy[ElvenUnit.SWAN_KNIGHTS] = 4
        enemyArmy[ElvenUnit.PRIESTS_OF_HALIEL] = 3
    }

    internal fun randomlyGenerateTroops(enemyFaction: String) {
        val generatedUnit = drawAUnit(enemyFaction)
        if (enemyArmy.containsKey(generatedUnit)) {
            enemyArmy[generatedUnit] = (enemyArmy.getValue(generatedUnit) + 1)
        } else {
            enemyArmy[generatedUnit] = 1
        }
    }

    private fun drawAUnit(enemyFaction: String): Unit {
        val randomIndex = Random.nextInt(0, 5)
        return provideTheTroopsPool(enemyFaction)[randomIndex]
    }

    private fun provideTheTroopsPool(enemyFaction: String): MutableList<Unit> {
        val troopsPool = mutableListOf<Unit>()
        when (enemyFaction) {
            "1" -> { troopsPool.add(DwarvenUnit.SHIELDBEARERS)
                     troopsPool.add(DwarvenUnit.AXEMEN)
                     troopsPool.add(DwarvenUnit.HAMMERERS)
                     troopsPool.add(DwarvenUnit.AXETHROWERS)
                     troopsPool.add(DwarvenUnit.CROSSBOWMEN)
                     troopsPool.add(DwarvenUnit.BOAR_RIDERS)
                     troopsPool.add(DwarvenUnit.RUNE_PRIESTS) }
            "2" -> { troopsPool.add(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS)
                     troopsPool.add(OrcishUnit.CLUBBERS)
                     troopsPool.add(OrcishUnit.BIG_AXES)
                     troopsPool.add(OrcishUnit.ROCK_LOBBERS)
                     troopsPool.add(OrcishUnit.JAVELINERS)
                     troopsPool.add(OrcishUnit.WOLF_RIDERS)
                     troopsPool.add(OrcishUnit.SHAMANS) }
            "3" -> { troopsPool.add(ElvenUnit.WARDANCERS)
                     troopsPool.add(ElvenUnit.SWAN_PIKEMEN)
                     troopsPool.add(ElvenUnit.HUNTERS)
                     troopsPool.add(ElvenUnit.LONGBOWS)
                     troopsPool.add(ElvenUnit.ARCANE_BOWS)
                     troopsPool.add(ElvenUnit.SWAN_KNIGHTS)
                     troopsPool.add(ElvenUnit.PRIESTS_OF_HALIEL) }
        }
        return troopsPool
    }

    private fun generateProvisions(enemyFaction: String) {
        when (enemyFaction) {
            "1" -> { enemyProvisions[DwarvenProvisions.CAVE_MUSHROOMS] = 5
                     enemyProvisions[DwarvenProvisions.BREAD] = 5
                     enemyProvisions[DwarvenProvisions.DEEP_VEGETABLES] = 4
                     enemyProvisions[DwarvenProvisions.DRIED_MOSS] = 5
                     enemyProvisions[DwarvenProvisions.BEER] = 6
            }
            "2" -> { enemyProvisions[OrcishProvisions.WORMS] = 5
                     enemyProvisions[OrcishProvisions.FLOUR_CAKE] = 5
                     enemyProvisions[OrcishProvisions.ROOTS] = 4
                     enemyProvisions[OrcishProvisions.SCAVANGED_VEGETABLES] = 5
                     enemyProvisions[OrcishProvisions.STOLEN_ALCOHOL] = 6
            }
            "3" -> { enemyProvisions[ElvenProvisions.FOREST_MUSHROOMS] = 5
                     enemyProvisions[ElvenProvisions.CAKE] = 5
                     enemyProvisions[ElvenProvisions.DRIED_FRUITS] = 4
                     enemyProvisions[ElvenProvisions.VEGETABLES] = 5
                     enemyProvisions[ElvenProvisions.WINE] = 6
            }
        }
    }
}