package pheakdey.developer.Function

import kotlin.system.measureTimeMillis

fun main(){
    val timeInlineFunction = measureTimeMillis {
        println(1000){

        } }

}
inline fun recordTimeline(
    block: ()-> Unit
){
    block()
}
inline fun recordTimeNormal(
    block: () -> Unit
){
    block()
}