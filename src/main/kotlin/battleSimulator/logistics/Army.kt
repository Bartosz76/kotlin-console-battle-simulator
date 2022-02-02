package battleSimulator.logistics

interface Army {

    fun checkIfFundsAreSufficient(requiredAmount: Double): Boolean

    fun declineThePurchase(chosenUnit: Unit)

    fun confirmThePurchase(chosenUnit: Unit)
}