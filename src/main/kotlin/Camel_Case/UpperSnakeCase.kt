package pheakdey.developer.Camel_Case

//Upper Snake Case
object ColorState {
    const val RED = "RED"
    const val BLUE = "BLUE"
    const val Orange = "Orange"
}

fun main(){
    print("Enter Color state (1=Red, 2=Blue, 3=Orange): ")
    val input = readLine()!!.toInt()

    val orderStatus = when (input) {
        1 -> ColorState.RED
        2 -> ColorState.BLUE
        3 -> ColorState.Orange
        else -> ColorState.RED
    }

    when (orderStatus) {
        ColorState.RED -> println("Color status: Red")
        ColorState.BLUE -> println("Color status: Blue")
        ColorState.Orange -> println("Color status: Orange")
    }
}