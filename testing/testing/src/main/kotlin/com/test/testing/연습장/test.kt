package com.test.testing.연습장

class test {
    companion object {
        val name: String = "홍길동"
        val age: Int = 42

        fun state() {
            println("Hello ")
        }
    }
}

fun main () {
    val age2 : Int = test.age
    val name2 : String = test.name

    println(age2)
    println(name2)
    test.state()
}

