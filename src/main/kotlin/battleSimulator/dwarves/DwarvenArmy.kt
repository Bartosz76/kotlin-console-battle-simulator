package battleSimulator.dwarves

class DwarvenArmy {

    /**
     * Similar to how Kotlin differentiate between nullable and non-null types, it also differentiates
     * between mutable and immutable collection types.
     * By default, a collection type in Kotlin is immutable -> I can't add nor substract values from
     * that collection after it's been created - hence the usage of 'mutableMapOf' instead of 'mapOf'.
     */
    var dwarves = mutableMapOf<DwarvenUnit, Int>()
    init {
        dwarves.put(DwarvenUnit.SHIELDBEARERS, 4)
        dwarves.put(DwarvenUnit.AXEMEN, 2)
        dwarves.put(DwarvenUnit.CROSSBOWMEN, 3)
        dwarves.put(DwarvenUnit.RUNE_PRIESTS, 1)
    }

    fun showTheTroops() {
        dwarves.forEach { key, value -> println("$value of $key") }
    }

}