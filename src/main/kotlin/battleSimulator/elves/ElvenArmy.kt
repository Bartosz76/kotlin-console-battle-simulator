package battleSimulator.elves

class ElvenArmy {

    var elves = mutableMapOf<ElvenUnit, Int>()
    init {
        elves.put(ElvenUnit.WARDANCERS, 2)
        elves.put(ElvenUnit.HUNTERS, 4)
        elves.put(ElvenUnit.LONGBOWS, 3)
        elves.put(ElvenUnit.PRIESTS_OF_HALIEL, 1)
    }

    fun showTheTroops() {
        println(elves)
    }
}