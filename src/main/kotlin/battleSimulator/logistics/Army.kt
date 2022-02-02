package battleSimulator.logistics

import battleSimulator.dwarves.DwarvenUnit

interface Army {

    fun checkIfFundsAreSufficient(requiredAmount: Double): Boolean

    fun declineThePurchase(chosenUnit: DwarvenUnit)
}