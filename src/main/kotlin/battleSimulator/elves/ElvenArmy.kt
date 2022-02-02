package battleSimulator.elves

import battleSimulator.dwarves.DwarvenUnit
import battleSimulator.logistics.Army
import battleSimulator.logistics.Unit

class ElvenArmy: Army {

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
        println("4. " + ElvenUnit.LONGBOWS.name + " for 12 gold pieces each.")
        Thread.sleep(500)
        println("5. " + ElvenUnit.ARCANE_BOWS.name + " for 14 gold pieces each.")
        Thread.sleep(500)
        println("6. " + ElvenUnit.SWAN_KNIGHTS.name + " for 15 gold pieces each.")
        Thread.sleep(500)
        println("7. " + ElvenUnit.PRIESTS_OF_HALIEL.name + " for 20 gold pieces each.")
        val chosenOption = readLine()
        trainAnElvenUnit(chosenOption)
    }

    private fun trainAnElvenUnit(chosenOption: String?) {
        when (chosenOption) {
            "1" -> { if (checkIfFundsAreSufficient(4.0)) {
                if (elves.containsKey(ElvenUnit.WARDANCERS)) {
                    elves[ElvenUnit.WARDANCERS] = elves.getValue(ElvenUnit.WARDANCERS) + 1
                } else {
                    elves[ElvenUnit.WARDANCERS] = 1
                }
                changeTheStateOfTheEmeraldStore(4.0, false)
                confirmThePurchase(ElvenUnit.WARDANCERS)
            } else {
                declineThePurchase(ElvenUnit.WARDANCERS)
            } }
            "2" -> { if (checkIfFundsAreSufficient(5.0)) {
                if (elves.containsKey(ElvenUnit.SWAN_PIKEMEN)) {
                    elves[ElvenUnit.SWAN_PIKEMEN] = elves.getValue(ElvenUnit.SWAN_PIKEMEN) + 1
                } else {
                    elves[ElvenUnit.SWAN_PIKEMEN] = 1
                }
                changeTheStateOfTheEmeraldStore(5.0, false)
                confirmThePurchase(ElvenUnit.SWAN_PIKEMEN)
            } else {
                declineThePurchase(ElvenUnit.SWAN_PIKEMEN)
            } }
            "3" -> { if (checkIfFundsAreSufficient(10.0)) {
                if (elves.containsKey(ElvenUnit.HUNTERS)) {
                    elves[ElvenUnit.HUNTERS] = elves.getValue(ElvenUnit.HUNTERS) + 1
                } else {
                    elves[ElvenUnit.HUNTERS] = 1
                }
                changeTheStateOfTheEmeraldStore(10.0, false)
                confirmThePurchase(ElvenUnit.HUNTERS)
            } else {
                declineThePurchase(ElvenUnit.HUNTERS)
            } }
            "4" -> { if (checkIfFundsAreSufficient(12.0)) {
                if (elves.containsKey(ElvenUnit.LONGBOWS)) {
                    elves[ElvenUnit.LONGBOWS] = elves.getValue(ElvenUnit.LONGBOWS) + 1
                } else {
                    elves[ElvenUnit.LONGBOWS] = 1
                }
                changeTheStateOfTheEmeraldStore(12.0, false)
                confirmThePurchase(ElvenUnit.LONGBOWS)
            } else {
                declineThePurchase(ElvenUnit.LONGBOWS)
            } }
            "5" -> { if (checkIfFundsAreSufficient(14.0)) {
                if (elves.containsKey(ElvenUnit.ARCANE_BOWS)) {
                    elves[ElvenUnit.ARCANE_BOWS] = elves.getValue(ElvenUnit.ARCANE_BOWS) + 1
                } else {
                    elves[ElvenUnit.ARCANE_BOWS] = 1
                }
                changeTheStateOfTheEmeraldStore(14.0, false)
                confirmThePurchase(ElvenUnit.ARCANE_BOWS)
            } else {
                declineThePurchase(ElvenUnit.ARCANE_BOWS)
            } }
            "6" -> { if (checkIfFundsAreSufficient(15.0)) {
                if (elves.containsKey(ElvenUnit.SWAN_KNIGHTS)) {
                    elves[ElvenUnit.SWAN_KNIGHTS] = elves.getValue(ElvenUnit.SWAN_KNIGHTS) + 1
                } else {
                    elves[ElvenUnit.SWAN_KNIGHTS] = 1
                }
                changeTheStateOfTheEmeraldStore(15.0, false)
                confirmThePurchase(ElvenUnit.SWAN_KNIGHTS)
            } else {
                declineThePurchase(ElvenUnit.SWAN_KNIGHTS)
            } }
            "7" -> { if (checkIfFundsAreSufficient(20.0)) {
                if (elves.containsKey(ElvenUnit.PRIESTS_OF_HALIEL)) {
                    elves[ElvenUnit.PRIESTS_OF_HALIEL] = elves.getValue(ElvenUnit.PRIESTS_OF_HALIEL) + 1
                } else {
                    elves[ElvenUnit.PRIESTS_OF_HALIEL] = 1
                }
                changeTheStateOfTheEmeraldStore(20.0, false)
                confirmThePurchase(ElvenUnit.PRIESTS_OF_HALIEL)
            } else {
                declineThePurchase(ElvenUnit.PRIESTS_OF_HALIEL)
            } }
        }
    }

    override fun checkIfFundsAreSufficient(requiredAmount: Double): Boolean {
        return emeraldStore > requiredAmount
    }

    override fun declineThePurchase(chosenUnit: Unit) {
        println("You do not have enough funds to train $chosenUnit.")
    }

    override fun confirmThePurchase(chosenUnit: Unit) {
        println("A unit of $chosenUnit was added to the army!")
    }
}