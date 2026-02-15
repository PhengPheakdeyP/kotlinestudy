package pheakdey.developer.LoopInkotlin

//class forloopInKotlin (
//    var name: String,
//    var age: Int,
//    var gender: String,
//    var phoneNumber: String
//)
//fun intputForloop(): forloopInKotlin {
//    print("Enter your name: ")
//    val name = readLine()!!
//    print("Enter your age: ")
//    val age = readLine()!!.toInt()
//    print("Enter your gender: ")
//    val gender = readLine()!!
//    print("Enter your phoneNumber: ")
//    val phoneNumber = readLine()!!
//
//    return forloopInKotlin(name, age, gender, phoneNumber)
//}
//fun outputForloop(forloopInKotLin: forloopInKotlin) {
//    println("Name: ${forloopInKotLin.name}")
//    println("Age: ${forloopInKotLin.age}")
//    println("Gender: ${forloopInKotLin.gender}")
//    println("Phone: ${forloopInKotLin.phoneNumber}")
//    println("----------------------")
//}

fun main() {

    val topics = listOf(
        "Java",
        "Kotlin",
        "Python",
        "C++",
        "JavaScript"
    )
    print("Enter topic to search: ")
    val search = readLine()!!

    var found = false
    for (topic in topics) {
        if (topic.equals(search, ignoreCase = true)) {
            found = true
            break
        }
    }

    if (found) {
        println("Topic found: $search")
    } else {
        println("Topic not found")
    }
}

//fun main() {
//    val display = arrayListOf<forloopInKotlin>()
//    print("Enter frist number: ")
//    val frist = readLine()!!.toInt()
//    for (i in 1..frist){
//    println("Enter frist number: $i")
//        val displays=intputForloop()
//        display.add(displays)
//    }
//    println("**************** DISPLAY ***************")
//    for (lop in display){
//        outputForloop(lop)
//    }
//}
