package battleSimulator.elves

class ElvenArmy {

    private var emeraldStore: Double = 100.00
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

    internal fun showTheTroops() {
        elves.forEach { (key, value) -> println("$value of $key") }
    }

    internal fun showTheSupplies() {
        elvenSupplies.forEach { (key, value) -> println("$value of $key") }
    }

    internal fun showTheFunds() {
        println("You treasury holds $emeraldStore emeralds.")
    }

    internal fun showPopulationHappiness() {
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

    internal fun influencePopulationsHappiness(amount: Int, isPositive: Boolean) {
        if (isPositive) {
            if (elfPopulationHappiness < 50) {
                elfPopulationHappiness += amount
                if (elfPopulationHappiness > 50) {
                    elfPopulationHappiness = 50
                }
            }
        } else {
            elfPopulationHappiness -= amount
        }
    }

    internal fun changeTheStateOfTheEmeraldStore(amount: Double, isAnIncrease: Boolean) {
        if (isAnIncrease) {
            emeraldStore += amount
        } else {
            emeraldStore -= amount
        }
    }

    internal fun showAvailableUnitsWithCost() {
        Thread.sleep(500)
        println("1. " + ElvenUnit.WARDANCERS.name + " for 4 gold pieces each.")
        Thread.sleep(500)
        println("2. " + ElvenUnit.SWAN_PIKEMEN.name + " for 5 gold pieces each.")
        Thread.sleep(500)
        println("3. " + ElvenUnit.HUNTERS.name + " for 10 gold pieces each.")
        Thread.sleep(500)
        println("4. " + ElvenUnit.LONGBOWS.name + " for 10 gold pieces each.")
        Thread.sleep(500)
        println("5. " + ElvenUnit.ARCANE_BOWS.name + " for 14 gold pieces each.")
        Thread.sleep(500)
        println("6. " + ElvenUnit.SWAN_KNIGHTS.name + " for 15 gold pieces each.")
        Thread.sleep(500)
        println("7. " + ElvenUnit.PRIESTS_OF_HALIEL.name + " for 20 gold pieces each.")
        var chosenOption = readLine()
    }
}