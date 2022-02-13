package battleSimulator.logistics

sealed interface Logistics {

    fun printInitialPanelLine() {
        println("You can now:")
    }
}