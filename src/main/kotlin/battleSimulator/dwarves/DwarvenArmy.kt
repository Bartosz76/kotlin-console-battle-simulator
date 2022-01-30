package battleSimulator.dwarves

class DwarvenArmy {

    private var armyFunds: Double = 100.00
    private var dwarfPopulationHappiness: Int = 50
    /**
     * Similar to how Kotlin differentiate between nullable and non-null types, it also differentiates
     * between mutable and immutable collection types.
     * By default, a collection type in Kotlin is immutable -> I can't add nor substract values from
     * that collection after it's been created - hence the usage of 'mutableMapOf' instead of 'mapOf'.
     */
    private var dwarves = mutableMapOf<DwarvenUnit, Int>()
    init {
        dwarves.put(DwarvenUnit.SHIELDBEARERS, 4)
        dwarves.put(DwarvenUnit.AXEMEN, 2)
        dwarves.put(DwarvenUnit.CROSSBOWMEN, 3)
        dwarves.put(DwarvenUnit.RUNE_PRIESTS, 1)
    }

    private var dwarvenSupplies = mutableMapOf<DwarvenProvisions, Int>()
    init {
        dwarvenSupplies.put(DwarvenProvisions.CAVE_MUSHROOMS, 2)
        dwarvenSupplies.put(DwarvenProvisions.BREAD, 2)
        dwarvenSupplies.put(DwarvenProvisions.BEER, 4)
    }

    internal fun showTheTroops() {
        dwarves.forEach { (key, value) -> println("$value of $key") }
    }

    internal fun showTheSupplies() {
        dwarvenSupplies.forEach { (key, value) -> println("$value of $key") }
    }

    internal fun showTheFunds() {
        println("You treasury holds $armyFunds gold pieces.")
    }

    internal fun showPopulationHappiness() {
        when (dwarfPopulationHappiness) {
            50 -> {
                println("Dwarves are happy.")
            }
            in 40..49 -> {
                println("Dwarves are fine.")
            }
            in 30..39 -> {
                println("Dwarves are not happy.")
            }
            in 20..29 -> {
                println("Dwarves are angry!")
            }
            in 10..19 -> {
                println("Dwarves are on the verge of rebellion!")
            }
            else -> {
                println("Dwarves are up in arms against the government!")
            }
        }
    }

    internal fun influencePopulationsHappiness(amount: Int, isPositive: Boolean) {
        if (isPositive) {
            if (dwarfPopulationHappiness < 50) {
                dwarfPopulationHappiness += amount
                if (dwarfPopulationHappiness > 50) {
                    dwarfPopulationHappiness = 50
                }
            }
        } else {
            dwarfPopulationHappiness -= amount
        }
    }

    internal fun changeTheStateOfTheTreasury(amount: Double, isAnIncrease: Boolean) {
        if (isAnIncrease) {
            armyFunds += amount
        } else {
            armyFunds -= amount
        }
    }

    internal fun showAvailableUnitsWithCost() {
        println("You can train:")
        Thread.sleep(500)
        println("1. " + DwarvenUnit.SHIELDBEARERS.name + " for 8 gold pieces each.")
        Thread.sleep(500)
        println("2. " + DwarvenUnit.AXEMEN.name + " for 6 gold pieces each.")
        Thread.sleep(500)
        println("3. " + DwarvenUnit.HAMMERERS.name + " for 10 gold pieces each.")
        Thread.sleep(500)
        println("4. " + DwarvenUnit.AXETHROWERS.name + " for 9 gold pieces each.")
        Thread.sleep(500)
        println("5. " + DwarvenUnit.CROSSBOWMEN.name + " for 12 gold pieces each.")
        Thread.sleep(500)
        println("6. " + DwarvenUnit.BOAR_RIDERS.name + " for 15 gold pieces each.")
        Thread.sleep(500)
        println("7. " + DwarvenUnit.RUNE_PRIESTS.name + " for 20 gold pieces each.")
        var chosenOption = readLine()
    }
}