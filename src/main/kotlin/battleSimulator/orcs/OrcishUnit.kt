package battleSimulator.orcs

enum class OrcishUnit(var power: Int, var defence: Int, var number: Int, var healthPool: Int ) {

    ORCS_WITH_STOLEN_SHIELDS(70, 150, 120, 200),
    CLUBBERS(120, 30, 140, 180),
    BIG_AXES(150, 30, 120, 200),
    ROCK_LOBBERS(100, 30, 130, 150),
    JAVELINERS(130, 30, 100, 160),
    WOLF_RIDERS(150, 30, 40, 170),
    SHAMANS(180, 20, 25, 75);
}