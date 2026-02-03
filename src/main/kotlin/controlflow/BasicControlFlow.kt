package pheakdey.developer.controlflow

import kotlin.io.print

fun gradeFromScore(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        in 50..59->"E"
        else -> "F"
    }

}

fun getnumber(number: String?) {

    val result = when (number) {
        "01" -> "one Monday"
        "02" -> "two Tuesday"
        "03" -> "three Wednesday"
        "04" -> "four Thursday"
        "05" -> "five Friday"
        "06" -> "six Saturday"
        "07" -> "seven Sunday"
        else -> "null"
    }

    println("Number : $result")
}