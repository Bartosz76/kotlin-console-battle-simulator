package battleSimulator.elves

class ElvenArmy {

    var elves = mutableMapOf<ElvenUnit, Int>()
    init {
        elves.put(ElvenUnit.WARDANCERS, 2)
        elves.put(ElvenUnit.HUNTERS, 4)
        elves.put(ElvenUnit.LONGBOWS, 3)
        elves.put(ElvenUnit.PRIESTS_OF_HALIEL, 1)
    }

    var elvenSupplies = mutableMapOf<ElvenProvisions, Int>()
    init {
        elvenSupplies.put(ElvenProvisions.FOREST_MUSHROOMS, 2)
        elvenSupplies.put(ElvenProvisions.CAKE, 2)
        elvenSupplies.put(ElvenProvisions.WINE, 4)
    }

    fun showTheTroops() {
        elves.forEach { key, value -> println("$value of $key") }
    }

    fun showTheSupplies() {
        elvenSupplies.forEach { key, value -> println("$value of $key") }
    }
}