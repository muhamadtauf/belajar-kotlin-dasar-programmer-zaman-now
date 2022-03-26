//variable constan
const val APPLICATION = "belajar kotlin"
const val VERSION = "1.1"

fun main() {

    //imuatable
    val firstName = "eko"
    val age = 30
    println(firstName)
    println(age)

    //mutable
    var test = "test"
    println(test)

    //nullable
    var name: String? = "eko"
    name = null

    println(name)
    //cara aksess variabel null yang benar
    println(name?.length)

    println("$APPLICATION : $VERSION")
}