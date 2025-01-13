package com.test.testing.`3조건문과비교연산자`

fun main(){
    // 조건문 - 자바랑 구문이 똑같음

    var a = 7

    // 실행할 구문이 한 개라면 중괄호 생략가능
    if(a > 5) println("1");

    if(a > 10) {
        println("a는 10보다 크다")
    } else {
        println("a는 10보다 작다")
    }

    // 비교 연산자는 자바랑 동일

    // 자료형이 맞는지 체크하는 is연산자
    println(a is Int);
    // 자료형이 틀린지 체크하는 !is연산자
    println(a !is Int);

    // 함수처럼 타입에 맞는 조건값에 맞는 값이 기입되면 실행하는 구조
    doWhen(1)
    doWhen("test")
//    doWhen(13L)
    doWhen(3.14159)
//    doWhen("Kotlin")
    doWhen(123)
}
    fun doWhen (a: Any) {
        when(a) {
          //조건값 실행구문
            1 -> println("정수 1입니다.")
            "test" -> println("문자열.")
            is Long -> println("Long 타입입니다.")
            !is String -> println("String타입이 아닙니다")
            else -> println("어떤 조건도 만족하지 않는다")
        }
    }

    fun doWher2 (a: Any) {
        var result = when (a) {
            1 -> "정수 1입니다."
            "test" -> "문자열입니다."
            is Long -> "Long 타입입니다."
            !is String -> "String타입이 아닙니다"
            else -> "어떤 조건도 만족하지 않는다"
        }
        println(result)
    }
