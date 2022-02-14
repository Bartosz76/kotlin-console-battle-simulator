package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenUnit

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

}