package pheakdey.developer.Model
class Student(
    val numberByteClass: Byte,
    val name: String,
    val gradeChar: Char,
    val numberDoubleScore: Double,
    val numberShortInClass: Short,
    val numberIntYearStudent: Int
) {
    fun showInfo() {
        println("Class: $numberByteClass," +
                "Name: $name, " +
                "Grade: $gradeChar, " +
                "Score: $numberDoubleScore, " +
                "InClass: $numberShortInClass, " +
                "Year: $numberIntYearStudent")
    }
}
val addAll = arrayListOf< Student>(
)
