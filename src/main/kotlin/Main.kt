package org.example
fun main() {

    println("+---------+")
    println(nuevo1())

}

fun nuevo1() {
    val trickFunction = trick
    trick()
    trickFunction()
}

val trick = {
    println("No treats!")
}

