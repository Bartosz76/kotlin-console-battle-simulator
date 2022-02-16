package battleSimulator.logistics

internal class Supplies: Logistics {

    internal fun displaySuppliesPanel() {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Inspect your provisions.")
        Thread.sleep(500)
        println("2. Acquire more provisions.")
        Thread.sleep(500)
        println("3. Spoil the enemy's provisions.")
        when (readLine()) {
            "1" -> {}
            "2" -> {}
            "3" -> {}
            }
        }
    }
