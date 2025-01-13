package com.test.testing.연습장

fun main() {
    var n : Int = 10;

    // 자료형을 굳이 사용하지 않아도 타입 추론이 가능함
    var a = 1234;
    var b = 1234L;
    println(add(a, 5 , 4 ));
    println(add2(a, 5 ,20));


}

// 함수 함수명 (매개변수 : 자료형) : 반환형
fun add(a: Int , b:Int, c:Int) : Int {
    return a + b + c;
}

// 단일 표현식 함수
// 반환형의 타입 추론이 가능해서 반환형을 생략가능
fun add2(a:Int , b:Int , c:Int) = a + b + c;
