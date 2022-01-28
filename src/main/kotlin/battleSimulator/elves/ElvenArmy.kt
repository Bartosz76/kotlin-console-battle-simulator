package battleSimulator.elves

class ElvenArmy {

    private var armyFunds: Double = 100.00
    private var elfPopulationHappiness: Int = 50
    private var elves = mutableMapOf<ElvenUnit, Int>()
    init {
        elves.put(ElvenUnit.WARDANCERS, 2)
        elves.put(ElvenUnit.HUNTERS, 4)
        elves.put(ElvenUnit.LONGBOWS, 3)
        elves.put(ElvenUnit.PRIESTS_OF_HALIEL, 1)
    }

    private var elvenSupplies = mutableMapOf<ElvenProvisions, Int>()
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

    fun showTheFunds() {
        println("You treasury holds $armyFunds emeralds.")
    }

    fun showPopulationHappiness() {
        when (elfPopulationHappiness) {
            50 -> {
                println("Elves are pleased.")
            }
            in 40..49 -> {
                println("Elves tolerate the situation.")
            }
            in 30..39 -> {
                println("Elves are becoming displeased.")
            }
            in 20..29 -> {
                println("Elves are displeased with the ruling body!")
            }
            in 10..19 -> {
                println("Elves are about to seek to overthrow the elders!")
            }
            else -> {
                println("Elves seek to replace the elders!")
            }
        }
    }
}