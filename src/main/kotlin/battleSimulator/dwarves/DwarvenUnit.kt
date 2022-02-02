package battleSimulator.dwarves

import battleSimulator.logistics.Unit

enum class DwarvenUnit(var power: Int, var defence: Int, var number: Int, var healthPool: Int): Unit {

    SHIELDBEARERS(60, 200, 80, 300),
    AXEMEN(100, 100, 80, 200),
    HAMMERERS(110, 120, 60, 250),
    AXETHROWERS(120, 65, 80, 180),
    CROSSBOWMEN(150, 60, 60, 180),
    BOAR_RIDERS(130, 80, 20, 200),
    RUNE_PRIESTS(200, 40, 10, 100)


}