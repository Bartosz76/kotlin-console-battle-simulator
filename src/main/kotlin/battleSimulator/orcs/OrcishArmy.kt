package battleSimulator.orcs

class OrcishArmy {

    var armyFunds: Double = 100.00
    var orcs = mutableMapOf<OrcishUnit, Int>()
    init {
        orcs.put(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS, 3)
        orcs.put(OrcishUnit.CLUBBERS, 3)
        orcs.put(OrcishUnit.BIG_AXES, 2)
        orcs.put(OrcishUnit.SHAMANS, 1)
    }

    var orcishSupplies = mutableMapOf<OrcishProvisions, Int>()
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
}