package pheakdey.developer.controlflow

class MonthNames {
    val monthNames = arrayOf(
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    )

    val inputList = arrayListOf<Int>()      // store month number
    val outputList = arrayListOf<String>()  // store month name

    fun whenmonthly() {
        var inputmonthly = true

        while (inputmonthly) {
            print("Enter month number (1-12): ")
            val month = readLine()!!.toInt()

            inputList.add(month) //add() = method សម្រាប់ add element to ArrayList

            val monthName = if (month in 1..12) monthNames[month - 1] else "Invalid month" //monthNames = array of month strings //Array indexចាប់ពី 0, monthចាប់ពី1ដូច្នេះត្រូវ-1
            outputList.add(monthName)

            println("Month: $monthName")
            print("Continue? (y/n): ")
            if (readLine()!!.lowercase() != "y") {
                inputmonthly = false
            }
        }

        // Show all input/output
        println("\n===== All Input & Output =====")
        for (i in inputList.indices) {
            println("Input: ${inputList[i]}  => Output: ${outputList[i]}")
        }
    }
}







//fun main() {
//    var run = true
//
//    while (run) {
//        print("Enter month number (1-12): ")
//        val month = readLine()!!.toInt()
//
//        if (month == 1) {
//            println("January")
//        } else if (month == 2) {
//            println("February")
//        } else if (month == 3) {
//            println("March")
//        } else if (month == 4) {
//            println("April")
//        } else if (month == 5) {
//            println("May")
//        } else if (month == 6) {
//            println("June")
//        } else if (month == 7) {
//            println("July")
//        } else if (month == 8) {
//            println("August")
//        } else if (month == 9) {
//            println("September")
//        } else if (month == 10) {
//            println("October")
//        } else if (month == 11) {
//            println("November")
//        } else if (month == 12) {
//            println("December")
//        } else {
//            println("Invalid month")
//        }
//
//        print("Continue? (y/n): ")
//        if (readLine()!!.lowercase() != "y") {
//            run = false
//        }
//    }
//}
