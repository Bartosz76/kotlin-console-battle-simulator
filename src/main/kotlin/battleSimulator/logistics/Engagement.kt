package battleSimulator.logistics

class Engagement: Logistics {

    internal fun displayEngagementOptions() {
        printInitialPanelLine()
        Thread.sleep(500)
        println("1. Attack the enemy.")
        Thread.sleep(500)
        println("2. Send scouts.")
        Thread.sleep(500)
        var chosenOption = readLine()
    }
}