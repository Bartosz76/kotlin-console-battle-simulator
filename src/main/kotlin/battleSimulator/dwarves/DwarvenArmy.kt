package battleSimulator.dwarves

import battleSimulator.logistics.Army
import battleSimulator.logistics.Unit

class DwarvenArmy: Army {

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

    override fun showTheTroops() {
        dwarves.forEach { (key, value) -> println("$value of $key") }
    }

    override fun showTheSupplies() {
        dwarvenSupplies.forEach { (key, value) -> println("$value of $key") }
    }

    override fun showTheFunds() {
        println("You treasury holds $armyFunds gold pieces.")
    }

    override fun showPopulationHappiness() {
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

    override fun influencePopulationsHappiness(amount: Int, isPositive: Boolean) {
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

    override fun changeTheStateOfTheTreasury(amount: Double, isAnIncrease: Boolean) {
        if (isAnIncrease) {
            armyFunds += amount
        } else {
            armyFunds -= amount
        }
    }

    override fun showAvailableUnitsWithCost() {
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
        val chosenOption = readLine()
        trainAUnit(chosenOption)
    }

    override fun trainAUnit(chosenOption: String?) {
        when (chosenOption) {
            "1" -> { if (checkIfFundsAreSufficient(8.0)) {
                        if (dwarves.containsKey(DwarvenUnit.SHIELDBEARERS)) {
                            dwarves[DwarvenUnit.SHIELDBEARERS] = dwarves.getValue(DwarvenUnit.SHIELDBEARERS) + 1
                        } else {
                            dwarves[DwarvenUnit.SHIELDBEARERS] = 1
                        }
                        changeTheStateOfTheTreasury(8.0, false)
                        confirmThePurchase(DwarvenUnit.SHIELDBEARERS)
                     } else {
                        declineThePurchase(DwarvenUnit.SHIELDBEARERS)
                     } }
            "2" -> { if (checkIfFundsAreSufficient(6.0)) {
                        if (dwarves.containsKey(DwarvenUnit.AXEMEN)) {
                            dwarves[DwarvenUnit.AXEMEN] = dwarves.getValue(DwarvenUnit.AXEMEN) + 1
                        } else {
                            dwarves[DwarvenUnit.AXEMEN] = 1
                        }
                        changeTheStateOfTheTreasury(6.0, false)
                        confirmThePurchase(DwarvenUnit.AXEMEN)
                    } else {
                        declineThePurchase(DwarvenUnit.AXEMEN)
                    } }
            "3" -> { if (checkIfFundsAreSufficient(10.0)) {
                        if (dwarves.containsKey(DwarvenUnit.HAMMERERS)) {
                            dwarves[DwarvenUnit.HAMMERERS] = dwarves.getValue(DwarvenUnit.HAMMERERS) + 1
                        } else {
                            dwarves[DwarvenUnit.HAMMERERS] = 1
                        }
                        changeTheStateOfTheTreasury(10.0, false)
                        confirmThePurchase(DwarvenUnit.HAMMERERS)
                    } else {
                        declineThePurchase(DwarvenUnit.HAMMERERS)
                    } }
            "4" -> { if (checkIfFundsAreSufficient(9.0)) {
                        if (dwarves.containsKey(DwarvenUnit.AXETHROWERS)) {
                            dwarves[DwarvenUnit.AXETHROWERS] = dwarves.getValue(DwarvenUnit.AXETHROWERS) + 1
                        } else {
                            dwarves[DwarvenUnit.AXETHROWERS] = 1
                        }
                        changeTheStateOfTheTreasury(9.0, false)
                        confirmThePurchase(DwarvenUnit.AXETHROWERS)
                    } else {
                        declineThePurchase(DwarvenUnit.AXETHROWERS)
                    } }
            "5" -> { if (checkIfFundsAreSufficient(12.0)) {
                        if (dwarves.containsKey(DwarvenUnit.CROSSBOWMEN)) {
                            dwarves[DwarvenUnit.CROSSBOWMEN] = dwarves.getValue(DwarvenUnit.CROSSBOWMEN) + 1
                        } else {
                            dwarves[DwarvenUnit.CROSSBOWMEN] = 1
                        }
                        changeTheStateOfTheTreasury(12.0, false)
                        confirmThePurchase(DwarvenUnit.CROSSBOWMEN)
                    } else {
                        declineThePurchase(DwarvenUnit.CROSSBOWMEN)
                    } }
            "6" -> { if (checkIfFundsAreSufficient(15.0)) {
                        if (dwarves.containsKey(DwarvenUnit.BOAR_RIDERS)) {
                            dwarves[DwarvenUnit.BOAR_RIDERS] = dwarves.getValue(DwarvenUnit.BOAR_RIDERS) + 1
                        } else {
                            dwarves[DwarvenUnit.BOAR_RIDERS] = 1
                        }
                        changeTheStateOfTheTreasury(15.0, false)
                        confirmThePurchase(DwarvenUnit.BOAR_RIDERS)
                    } else {
                        declineThePurchase(DwarvenUnit.BOAR_RIDERS)
                    } }
            "7" -> { if (checkIfFundsAreSufficient(20.0)) {
                        if (dwarves.containsKey(DwarvenUnit.RUNE_PRIESTS)) {
                            dwarves[DwarvenUnit.RUNE_PRIESTS] = dwarves.getValue(DwarvenUnit.RUNE_PRIESTS) + 1
                        } else {
                            dwarves[DwarvenUnit.RUNE_PRIESTS] = 1
                        }
                        changeTheStateOfTheTreasury(20.0, false)
                        confirmThePurchase(DwarvenUnit.RUNE_PRIESTS)
                    } else {
                        declineThePurchase(DwarvenUnit.RUNE_PRIESTS)
                    } }
        }
    }

    override fun checkIfFundsAreSufficient(requiredAmount: Double): Boolean {
        return armyFunds > requiredAmount
    }

    override fun declineThePurchase(chosenUnit: Unit) {
        println("You do not have enough funds to train $chosenUnit.")
    }

    override fun confirmThePurchase(chosenUnit: Unit) {
        println("A unit of $chosenUnit was added to the army!")
    }

    override fun recommendATrainingOption(army: Map<Unit, Int>) {
        TODO("Not yet implemented")
    }

}