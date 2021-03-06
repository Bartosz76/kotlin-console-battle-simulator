package battleSimulator.dwarves

import battleSimulator.logistics.Durability
import battleSimulator.logistics.Quality
import battleSimulator.logistics.Provisions

internal enum class DwarvenProvisions(var quality: Quality, var durability: Durability, var isBoosting: Boolean): Provisions {

    CAVE_MUSHROOMS(Quality.REGULAR, Durability.REGULAR, false),
    BREAD(Quality.REGULAR, Durability.SHORT, false),
    DRIED_MOSS(Quality.REGULAR, Durability.LONG, false),
    DEEP_VEGETABLES(Quality.HIGH, Durability.REGULAR, false),
    BEER(Quality.HIGH, Durability.INFINITE, true)
}