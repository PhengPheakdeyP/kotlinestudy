package pheakdey.developer.LoopInkotlin

fun main(){
val accountList: List<String> = listOf("management","Member","Employee")
    for (account: String in accountList){
        println(">+++> $account")
    }

    for (index in accountList.indices){
        println(">+++> ${accountList[index]} is index $index")
    }
}