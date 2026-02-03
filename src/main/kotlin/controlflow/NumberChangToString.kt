package pheakdey.developer.controlflow
class MonthService {

    private val monthMap = mapOf(
        1 to "January",
        2 to "February",
        3 to "March",
        4 to "April",
        5 to "May",
        6 to "June",
        7 to "July",
        8 to "August",
        9 to "September",
        10 to "October",
        11 to "November",
        12 to "December"
    )

    private val inputList = arrayListOf<Int>()
    private val outputList = arrayListOf<String>()

    fun start() {
        var run = true

        while (run) {
            print("Enter month number (1-12): ")
            val month = readLine()!!.toInt()

            inputList.add(month)

            val monthName = getMonthName(month)
            outputList.add(monthName)

            println("Month: $monthName")

            print("Continue? (y/n): ")
            if (readLine()!!.lowercase() != "y") {
                run = false
            }
        }
        showHistory()
    }

    private fun getMonthName(month: Int): String {
        return monthMap[month] ?: "Invalid month"
    }

    private fun showHistory() {
        println("\n===== Input & Output History =====")
        for (i in inputList.indices) {
            println("Input: ${inputList[i]}  → Output: ${outputList[i]}")
        }
    }
}

// main function
//fun main() {
//    val service = MonthService()
//    service.start()
//}

fun monthly() {
    var month = true

    while (month) {
        var monthName =""
        println("=====> Input <=====")
        print("Enter month number (1-12): ")
        val codeMonth = readLine()!!

//        var result =
            when (codeMonth) {
            "01", "1" -> monthName ="January"
            "02", "2" -> monthName ="February"
            "03", "3" -> monthName ="March"
            "04", "4" -> monthName ="April"
            "05", "5" -> monthName ="May"
            "06", "6" -> monthName ="June"
            "07", "7" -> monthName ="July"
            "08", "8" -> monthName ="August"
            "09", "9" -> monthName ="September"
            "10" -> monthName ="October"
            "11" -> monthName ="November"
            "12" -> monthName ="December"
            else -> "Invalid month"
        }

        println(" ======> Output <=====")
        println(">=>=>=> $monthName <=<=<=<=")

//        println("Result: $result")

        print("Continue? (y/n): ")
        if (readLine()!!.lowercase() != "y") {
            month = false
        }
    }
}

fun main() {
    monthly()
}


//fun monthly(codemonth: String){
//    val name: String?=null
//
//    if (name == "01" || codemonth == "January"){
//
//    }else if (name == "02" || codemonth == "February"){
//
//    }else if (name == "03" || codemonth == "March"){
//
//    }else if (name == "04" || codemonth == "April"){
//
//    }else if (name == "05" || codemonth == "May"){
//
//    }else if (name == "06" || codemonth == "June"){
//
//    }else if (name == "07" || codemonth == "July"){
//
//    }else if (name == "08" || codemonth == "August"){
//
//    }else if (name == "09" || codemonth == "September"){
//
//    }else if (name == "10" || codemonth == "October"){
//
//    }else if (name == "11" || codemonth == "November"){
//
//    }else if (name == "12" || codemonth == "December"){
//
//    }else (name == "13" || codemonth == "Invalid")
//
//}
