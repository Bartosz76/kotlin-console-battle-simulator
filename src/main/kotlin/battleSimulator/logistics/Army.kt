package battleSimulator.logistics

interface Army {

    fun showTheTroops()

    fun showTheSupplies()

    fun showTheFunds()

    fun showPopulationHappiness()

    fun influencePopulationsHappiness(amount: Int, isPositive: Boolean)

    fun changeTheStateOfTheTreasury(amount: Double, isAnIncrease: Boolean)

    fun showAvailableUnitsWithCost()

    fun trainAUnit(chosenOption: String?)

    fun checkIfFundsAreSufficient(requiredAmount: Double): Boolean

    fun declineThePurchase(chosenUnit: Unit)

    fun confirmThePurchase(chosenUnit: Unit)

    fun recommendATrainingOption(army: Map<Unit, Int>)
}