package com.test.testing.연습장.동기

import javax.management.Query.div

//fun add (a:Int , b : Int){
//    Thread.sleep(1000)
//    return println("덧셈 결과 : ${a + b}")
//}
//fun sub(a:Int , b: Int){
//    Thread.sleep(1000)
//    return println("뺄셈 결과 : ${a - b}")
//}
//fun  mul(a:Int , b:Int){
//    Thread.sleep(1000)
//    return println("곱하기 결과 : ${a * b}")
//}
//
//fun div(a: Int, b: Int){
//    Thread.sleep(1000)
//    if(a <= b){
//        return println((b / a).toDouble())
//    }else{
//        return println((a / b).toDouble())
//    }
//}
//
//fun main() {
//    val startTime = System.currentTimeMillis()
//    calculate(5, 10)
//
//    println("총 소요 시간 : ${System.currentTimeMillis() - startTime} ms")
//}
//
//fun calculate(a:Int , b:Int){
//    add(a , b)
//    sub(a, b)
//    mul(a, b)
//    div(a, b)
//}

fun operate(a:Int , b:Int , operation:(Int, Int) -> Double , sign: String){
    Thread.sleep(1000)
    println("$sign 결과 : ${operation(a, b)}")
}

fun calculate(a:Int , b:Int){
    operate(a, b,{ x, y -> (x + y).toDouble()} , "덧셈")
    operate(a, b,{ x, y -> (x - y).toDouble()} , "뺄셈")
    operate(a, b,{ x, y -> (x * y).toDouble()} , "곱셈")
    operate(a, b,{ x, y -> (x / y).toDouble()} , "나눗셈")
}

fun main() {
    val startTime = System.currentTimeMillis()
    calculate(5, 10)
    println("총 소요 시간 ${System.currentTimeMillis() - startTime}ms")
}