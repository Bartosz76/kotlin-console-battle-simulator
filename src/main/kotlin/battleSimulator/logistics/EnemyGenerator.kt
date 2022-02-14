package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenUnit
import battleSimulator.elves.ElvenUnit
import battleSimulator.orcs.OrcishUnit

class EnemyGenerator {

    private var enemyArmy = mutableMapOf<Unit, Int>()

    internal fun generateTheEnemy(enemyFaction: String) {
        when (enemyFaction) {
            "1" -> { generateDwarvenArmy() }
            "2" -> {}
            "3" -> {}
        }
    }

    private fun generateDwarvenArmy() {
        enemyArmy.put(DwarvenUnit.SHIELDBEARERS, 6)
        enemyArmy.put(DwarvenUnit.AXEMEN, 8)
        enemyArmy.put(DwarvenUnit.HAMMERERS, 4)
        enemyArmy.put(DwarvenUnit.AXETHROWERS, 8)
        enemyArmy.put(DwarvenUnit.CROSSBOWMEN, 6)
        enemyArmy.put(DwarvenUnit.BOAR_RIDERS, 4)
        enemyArmy.put(DwarvenUnit.RUNE_PRIESTS, 3)
    }

    private fun generateOrcishArmy() {
        enemyArmy.put(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS, 6)
        enemyArmy.put(OrcishUnit.CLUBBERS, 8)
        enemyArmy.put(OrcishUnit.BIG_AXES, 4)
        enemyArmy.put(OrcishUnit.JAVELINERS, 8)
        enemyArmy.put(OrcishUnit.ROCK_LOBBERS, 6)
        enemyArmy.put(OrcishUnit.WOLF_RIDERS, 4)
        enemyArmy.put(OrcishUnit.SHAMANS, 3)
    }

    private fun generateElvenArmy() {
        enemyArmy.put(ElvenUnit.WARDANCERS, 6)
        enemyArmy.put(ElvenUnit.SWAN_PIKEMEN, 8)
        enemyArmy.put(ElvenUnit.HUNTERS, 4)
        enemyArmy.put(ElvenUnit.LONGBOWS, 8)
        enemyArmy.put(ElvenUnit.ARCANE_BOWS, 6)
        enemyArmy.put(ElvenUnit.SWAN_KNIGHTS, 4)
        enemyArmy.put(ElvenUnit.PRIESTS_OF_HALIEL, 3)
    }
}