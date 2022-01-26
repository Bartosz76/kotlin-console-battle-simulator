package battleSimulator.dwarves

class DwarvenArmy {

    var dwarves = mutableMapOf<Int, DwarvenUnit>()
    init {
        dwarves.put(4, DwarvenUnit.SHIELDBEARERS)
        dwarves.put(2, DwarvenUnit.AXEMEN)
        dwarves.put(3, DwarvenUnit.CROSSBOWMEN)
        dwarves.put(1, DwarvenUnit.RUNE_PRIESTS)
    }
    fun showTheTroops() {
        println(dwarves)
    }

}