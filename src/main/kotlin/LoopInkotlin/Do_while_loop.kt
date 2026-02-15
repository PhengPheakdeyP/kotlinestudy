package pheakdey.developer.LoopInkotlin

class Do_while_loop (
    var name: String,
    var age: Int,
    var gender: String,
    var phoneNumber: String
)
fun intputDoWhile(): Do_while_loop {
    print("Enter your name: ")
    val name = readLine()!!
    print("Enter your age: ")
    val age = readLine()!!.toInt()
    print("Enter your gender: ")
    val gender = readLine()!!
    print("Enter your phoneNumber: ")
    val phoneNumber = readLine()!!

    return Do_while_loop(name, age, gender, phoneNumber)
}
fun outputDoWhile(Do_While: Do_while_loop) {
    println("Name: ${Do_While.name}")
    println("Age: ${Do_While.age}")
    println("Gender: ${Do_While.gender}")
    println("Phone: ${Do_While.phoneNumber}")
    println("----------------------")
}
fun main() {
    val display = arrayListOf<Do_while_loop>()
    var count =1
    print("Enter frist number: ")
    val frist = readLine()!!.toInt()
    do {
        println("++++> Student $count")
        val Displays = intputDoWhile()
        display.add(Displays)
        count++
    } while (count <= frist)
    println("**************** DISPLAY ***************")
    for (loops in display) {
        outputDoWhile(loops)
    }
}