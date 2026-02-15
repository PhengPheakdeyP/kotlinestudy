package pheakdey.developer.LoopInkotlin

fun main() {
    do {
        println("Plase enter your username:")
        val username: String = readLine()!!
        println("Plase enter your password:")
        val password: String = readLine()!!
        if (username!="pheakdey" || password != "1234") {
            print("Invalid username or password")
        }
    } while(username!="pheakdey" || password != "1234")
    println(" Login success!")
}