package battleSimulator.elves

import battleSimulator.logistics.Unit

internal enum class ElvenUnit(var power: Int, var defence: Int, var number: Int, var healthPool: Int): Unit {

    WARDANCERS(90, 100, 80, 250),
    SWAN_PIKEMEN(110, 100, 80, 200),
    HUNTERS(140, 40, 90, 150),
    LONGBOWS(190, 50, 80, 160),
    ARCANE_BOWS(200, 60, 20, 150),
    SWAN_KNIGHTS(130, 60, 30, 190),
    PRIESTS_OF_HALIEL(240, 10, 8, 80)
}