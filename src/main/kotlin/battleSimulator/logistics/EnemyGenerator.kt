package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenUnit
import battleSimulator.elves.ElvenUnit
import battleSimulator.orcs.OrcishUnit

class EnemyGenerator {

    private var enemyArmy = mutableMapOf<Unit, Int>()

    internal fun generateTheEnemy(enemyFaction: String) {
        when (enemyFaction) {
            "1" -> { generateDwarvenArmy() }
            "2" -> { generateOrcishArmy() }
            "3" -> { generateElvenArmy() }
        }
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
}