package battleSimulator.orcs

class OrcishArmy {

    var orcs = mutableMapOf<OrcishUnit, Int>()
    init {
        orcs.put(OrcishUnit.ORCS_WITH_STOLEN_SHIELDS, 3)
        orcs.put(OrcishUnit.CLUBBERS, 3)
        orcs.put(OrcishUnit.BIG_AXES, 2)
        orcs.put(OrcishUnit.SHAMANS, 1)
    }

    fun showTheTroops() {
        orcs.forEach { key, value -> println("$value of $key") }
    }
}