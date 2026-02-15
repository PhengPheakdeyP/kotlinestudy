package pheakdey.developer.LoopInkotlin

fun main(){
    val accountList: List<String> = listOf("I","Love","You")
    val cr: Array<String> = arrayOf("01","02","03")

    for (s in cr){
        when (s){
            "01"->{
                println("day 1 = Hello")
            }
            "02"->{
                println("day 2 My name is")
            }
            "03"->{
                println("day 3 Pheakdey")
            }
            else -> {
                println("Invalid input")
            }
        }
    }
}
