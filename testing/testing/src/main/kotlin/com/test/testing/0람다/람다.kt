package com.test.testing.`0람다`

fun main() {

    // 람다의 기본 형태

    // 변수의 타입을 지정한 경우
    // it 단일 매개변수를 나타내는 축약형
    var n : (Int) -> Int = {it * 10}

    // 매개변수가 여러개일때
    var h : (Int , Int) -> Int = {a , b -> a + b}

    // 변수의 타입을 생략한 경우
    // 단일 일때
    var k ={ a: Int -> a}
    // 반환형이 없을때
    var y ={ a : Int, b:Int -> a + b}

    println(n(1))
    println(h(1 , 2))
    println(k(1))
    println(y(1 , 2))
}
