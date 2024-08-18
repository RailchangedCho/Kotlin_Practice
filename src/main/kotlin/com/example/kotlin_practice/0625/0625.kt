package com.example.kotlin_practice.`0625`

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun main(args: Array<String>) {
    println("Hello, world!")

    val question = "질문"
    val answer = 42

    val person = Person("bob", true)
    println(person.name)
    val rec = Rectangle(41, 43)
    println(rec.isSquare)

}

fun main1(args: Array<String>) {

    val q = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $q!")
}

fun eval(e: Expr): Int {
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
}