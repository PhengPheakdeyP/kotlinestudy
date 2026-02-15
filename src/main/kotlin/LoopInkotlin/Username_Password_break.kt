package pheakdey.developer.LoopInkotlin
data class incorrect(
        val username: String,
        val password: String
        )
fun inputUsernamepassword(): incorrect {
    print("Enter Username : ")
    val username = readLine()!!
    print("Enter Password: ")
    val password = readLine()!!
    return incorrect(username, password)
}
fun outputUsernamepassword(user: incorrect) {
    println("+++++++++++ DISPLAY ++++++++++")
    println("Username : ${user.username}")
    println("Password : ${user.password}")
    println("------------------------------")
}

fun main() {
    val correctUsername = "pheakdey"
    val correctPassword = "1234"

    var attempts = 0
    val maxAttempts = 3

    while (attempts < maxAttempts) {
//        print("Enter username: ")
//        val username = readLine()!!
//
//        print("Enter password: ")
//        val password = readLine()!!
        val user = inputUsernamepassword() //USE function
        outputUsernamepassword(user)

        if (
            user.username == correctUsername &&
            user.password == correctPassword) {
            println("==============Login success!=================")
            break

        } else {
            attempts++
            println("Not incorrect username or password")
            println("Attempts left: ${maxAttempts - attempts}")
        }

        if (attempts == maxAttempts) {
            println("Account locked. Too many attempts!")
        }
    }
}
