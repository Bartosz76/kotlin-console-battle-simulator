package battleSimulator.dwarves

enum class DwarvenUnit(var power: Int, var defence: Int, var number: Int, var healthPool: Int ) {

    SHIELDBEARER(60, 200, 80, 300),
    AXEMAN(100, 100, 80, 200),
    CROSSBOWMAN(150, 60, 60, 180),
    BOAR_RIDER(130, 80, 20, 200)
    
}