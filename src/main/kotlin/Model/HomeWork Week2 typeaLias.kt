package pheakdey.developer.Model

  class Students1 (
    var id: Int,
    var name: String,
    var score: Double,

)
typealias StudentAction = (Students1) -> Unit

fun printStudent(st: Students1) {
    println("ID: ${st.id}")
    println("Name: ${st.name}")
    println("Score: ${st.score}")
    println("------------------")
}

fun processStudent(student: Students1, action: StudentAction) {
    action(student)
}
