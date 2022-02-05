package battleSimulator.orcs

import battleSimulator.logistics.Army
import battleSimulator.logistics.Unit

class OrcishArmy: Army {

    private var pileOfShinies: Double = 100.00
    private var orcPopulationHappiness: Int = 50
    private var orcs = mutableMapOf<OrcishUnit, Int>()
    init {
        orcs[OrcishUnit.ORCS_WITH_STOLEN_SHIELDS] = 3
        orcs[OrcishUnit.CLUBBERS] = 3
        orcs[OrcishUnit.BIG_AXES] = 2
        orcs[OrcishUnit.SHAMANS] = 1
    }

    private var orcishSupplies = mutableMapOf<OrcishProvisions, Int>()
    init {
        orcishSupplies[OrcishProvisions.WORMS] = 2
        orcishSupplies[OrcishProvisions.FLOUR_CAKE] = 2
        orcishSupplies[OrcishProvisions.STOLEN_ALCOHOL] = 4
    }

    override fun showTheTroops() {
        orcs.forEach { (key, value) -> println("$value of $key") }
    }

    override fun showTheSupplies() {
        orcishSupplies.forEach { (key, value) -> println("$value of $key") }
    }

    override fun showTheFunds() {
        println("You treasury holds $pileOfShinies shinies.")
    }

    override fun showPopulationHappiness() {
        when (orcPopulationHappiness) {
            50 -> {
                println("Orcs are content.")
            }
            in 40..49 -> {
                println("Orcs are fine.")
            }
            in 30..39 -> {
                println("Orcs are getting angry.")
            }
            in 20..29 -> {
                println("Orcs want blood!")
            }
            in 10..19 -> {
                println("Orcs are on the verge of infighting!")
            }
            else -> {
                println("Orcs have risen up against the council of the clans!")
            }
        }
    }

    override fun influencePopulationsHappiness(amount: Int, isPositive: Boolean) {
        if (isPositive) {
            if (orcPopulationHappiness < 50) {
                orcPopulationHappiness += amount
                if (orcPopulationHappiness > 50) {
                    orcPopulationHappiness = 50
                }
            }
        } else {
            orcPopulationHappiness -= amount
        }
    }

    override fun changeTheStateOfTheTreasury(amount: Double, isAnIncrease: Boolean) {
        if (isAnIncrease) {
            pileOfShinies += amount
        } else {
            pileOfShinies -= amount
        }
    }

    override fun showAvailableUnitsWithCost() {
        Thread.sleep(500)
        println("1. " + OrcishUnit.ORCS_WITH_STOLEN_SHIELDS.name + " for 4 gold pieces each.")
        Thread.sleep(500)
        println("2. " + OrcishUnit.CLUBBERS.name + " for 3 gold pieces each.")
        Thread.sleep(500)
        println("3. " + OrcishUnit.BIG_AXES.name + " for 6 gold pieces each.")
        Thread.sleep(500)
        println("4. " + OrcishUnit.ROCK_LOBBERS.name + " for 7 gold pieces each.")
        Thread.sleep(500)
        println("5. " + OrcishUnit.JAVELINERS.name + " for 9 gold pieces each.")
        Thread.sleep(500)
        println("6. " + OrcishUnit.WOLF_RIDERS.name + " for 10 gold pieces each.")
        Thread.sleep(500)
        println("7. " + OrcishUnit.SHAMANS.name + " for 12 gold pieces each.")
        trainAUnit(readLine())
    }

    override fun trainAUnit(chosenOption: String?) {
        when (chosenOption) {
            "1" -> { if (checkIfFundsAreSufficient(4.0)) {
                if (orcs.containsKey(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS)) {
                    orcs[OrcishUnit.ORCS_WITH_STOLEN_SHIELDS] = orcs.getValue(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS) + 1
                } else {
                    orcs[OrcishUnit.ORCS_WITH_STOLEN_SHIELDS] = 1
                }
                changeTheStateOfTheTreasury(4.0, false)
                confirmThePurchase(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS)
            } else {
                declineThePurchase(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS)
            } }
            "2" -> { if (checkIfFundsAreSufficient(3.0)) {
                if (orcs.containsKey(OrcishUnit.CLUBBERS)) {
                    orcs[OrcishUnit.CLUBBERS] = orcs.getValue(OrcishUnit.CLUBBERS) + 1
                } else {
                    orcs[OrcishUnit.CLUBBERS] = 1
                }
                changeTheStateOfTheTreasury(3.0, false)
                confirmThePurchase(OrcishUnit.CLUBBERS)
            } else {
                declineThePurchase(OrcishUnit.CLUBBERS)
            } }
            "3" -> { if (checkIfFundsAreSufficient(6.0)) {
                if (orcs.containsKey(OrcishUnit.BIG_AXES)) {
                    orcs[OrcishUnit.BIG_AXES] = orcs.getValue(OrcishUnit.BIG_AXES) + 1
                } else {
                    orcs[OrcishUnit.BIG_AXES] = 1
                }
                changeTheStateOfTheTreasury(6.0, false)
                confirmThePurchase(OrcishUnit.BIG_AXES)
            } else {
                declineThePurchase(OrcishUnit.BIG_AXES)
            } }
            "4" -> { if (checkIfFundsAreSufficient(7.0)) {
                if (orcs.containsKey(OrcishUnit.ROCK_LOBBERS)) {
                    orcs[OrcishUnit.ROCK_LOBBERS] = orcs.getValue(OrcishUnit.ROCK_LOBBERS) + 1
                } else {
                    orcs[OrcishUnit.ROCK_LOBBERS] = 1
                }
                changeTheStateOfTheTreasury(7.0, false)
                confirmThePurchase(OrcishUnit.ROCK_LOBBERS)
            } else {
                declineThePurchase(OrcishUnit.ROCK_LOBBERS)
            } }
            "5" -> { if (checkIfFundsAreSufficient(9.0)) {
                if (orcs.containsKey(OrcishUnit.JAVELINERS)) {
                    orcs[OrcishUnit.JAVELINERS] = orcs.getValue(OrcishUnit.JAVELINERS) + 1
                } else {
                    orcs[OrcishUnit.JAVELINERS] = 1
                }
                changeTheStateOfTheTreasury(9.0, false)
                confirmThePurchase(OrcishUnit.JAVELINERS)
            } else {
                declineThePurchase(OrcishUnit.JAVELINERS)
            } }
            "6" -> { if (checkIfFundsAreSufficient(10.0)) {
                if (orcs.containsKey(OrcishUnit.WOLF_RIDERS)) {
                    orcs[OrcishUnit.WOLF_RIDERS] = orcs.getValue(OrcishUnit.WOLF_RIDERS) + 1
                } else {
                    orcs[OrcishUnit.WOLF_RIDERS] = 1
                }
                changeTheStateOfTheTreasury(10.0, false)
                confirmThePurchase(OrcishUnit.WOLF_RIDERS)
            } else {
                declineThePurchase(OrcishUnit.WOLF_RIDERS)
            } }
            "7" -> { if (checkIfFundsAreSufficient(12.0)) {
                if (orcs.containsKey(OrcishUnit.SHAMANS)) {
                    orcs[OrcishUnit.SHAMANS] = orcs.getValue(OrcishUnit.SHAMANS) + 1
                } else {
                    orcs[OrcishUnit.SHAMANS] = 1
                }
                changeTheStateOfTheTreasury(12.0, false)
                confirmThePurchase(OrcishUnit.SHAMANS)
            } else {
                declineThePurchase(OrcishUnit.SHAMANS)
            } }
        }
    }

    override fun checkIfFundsAreSufficient(requiredAmount: Double): Boolean {
        return pileOfShinies > requiredAmount
    }

    override fun declineThePurchase(chosenUnit: Unit) {
        println("You do not have enough funds to train $chosenUnit.")
    }

    override fun confirmThePurchase(chosenUnit: Unit) {
        println("A unit of $chosenUnit was added to the army!")
    }

    override fun recommendATrainingOption() {
        if (!orcs.containsKey(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS)) {
            println("Your horde could use some shields!")
        }
        if (!orcs.containsKey(OrcishUnit.WOLF_RIDERS)) {
            println("Your warriors could use some help from their wolf riding brethren!")
        }
        if (!orcs.containsKey(OrcishUnit.SHAMANS)) {
            println("Your orcs would fight better with shamans nearby.")
        }
        println("More damage dealing rock lobbers or javeliners is always a good choice.")
    }
}