//Variables defined outside of any enclosing function are top level variables.
val name: String = "Bartosz"
var foodBeingEaten: String = "Apple"
//"?" is required for a variable to be a null. Types are non-null by default.
var simpleStringsCantBeNulls: String? = null

fun main() {
    println(name)
    println(foodBeingEaten)

    foodBeingEaten = "Orange"
    println(foodBeingEaten)

}