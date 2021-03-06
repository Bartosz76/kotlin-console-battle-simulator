package battleSimulator.elves

import battleSimulator.logistics.Durability
import battleSimulator.logistics.Quality
import battleSimulator.logistics.Provisions

internal enum class ElvenProvisions(var quality: Quality, var durability: Durability, var isBoosting: Boolean): Provisions {

    FOREST_MUSHROOMS(Quality.REGULAR, Durability.REGULAR, false),
    CAKE(Quality.HIGH, Durability.SHORT, false),
    DRIED_FRUITS(Quality.REGULAR, Durability.LONG, false),
    VEGETABLES(Quality.HIGH, Durability.SHORT, false),
    WINE(Quality.HIGH, Durability.INFINITE, true)
}