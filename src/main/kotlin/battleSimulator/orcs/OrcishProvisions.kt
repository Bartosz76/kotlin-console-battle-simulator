package battleSimulator.orcs

import battleSimulator.logistics.Durability
import battleSimulator.logistics.Quality
import battleSimulator.logistics.Provisions

internal enum class OrcishProvisions(var quality: Quality, var durability: Durability, var isBoosting: Boolean): Provisions {

    WORMS(Quality.LOW, Durability.SHORT, false),
    FLOUR_CAKE(Quality.REGULAR, Durability.LONG, false),
    ROOTS(Quality.REGULAR, Durability.LONG, false),
    SCAVANGED_VEGETABLES(Quality.HIGH, Durability.SHORT, false),
    STOLEN_ALCOHOL(Quality.LOW, Durability.INFINITE, true)
}