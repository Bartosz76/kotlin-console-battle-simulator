package battleSimulator.orcs

class OrcishArmy {

    private var armyFunds: Double = 100.00
    private var orcPopulationHappiness: Int = 50
    private var orcs = mutableMapOf<OrcishUnit, Int>()
    init {
        orcs.put(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS, 3)
        orcs.put(OrcishUnit.CLUBBERS, 3)
        orcs.put(OrcishUnit.BIG_AXES, 2)
        orcs.put(OrcishUnit.SHAMANS, 1)
    }

    private var orcishSupplies = mutableMapOf<OrcishProvisions, Int>()
    init {
        orcishSupplies.put(OrcishProvisions.WORMS, 2)
        orcishSupplies.put(OrcishProvisions.FLOUR_CAKE, 2)
        orcishSupplies.put(OrcishProvisions.STOLEN_ALCOHOL, 4)
    }

    fun showTheTroops() {
        orcs.forEach { key, value -> println("$value of $key") }
    }

    fun showTheSupplies() {
        orcishSupplies.forEach { key, value -> println("$value of $key") }
    }

    fun showTheFunds() {
        println("You treasury holds $armyFunds shinies.")
    }

    fun showPopulationHappiness() {
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

    fun influencePopulationsHappiness(amount: Int, isPositive: Boolean) {
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
}