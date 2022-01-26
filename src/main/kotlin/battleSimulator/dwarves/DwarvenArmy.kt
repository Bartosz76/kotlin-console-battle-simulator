package battleSimulator.dwarves

class DwarvenArmy {

    var dwarves = mutableMapOf<DwarvenUnit, Int>()
    init {
        dwarves.put(DwarvenUnit.SHIELDBEARERS, 4)
        dwarves.put(DwarvenUnit.AXEMEN, 2)
        dwarves.put(DwarvenUnit.CROSSBOWMEN, 3)
        dwarves.put(DwarvenUnit.RUNE_PRIESTS, 1)
    }

    fun showTheTroops() {
        println(dwarves)
    }

}