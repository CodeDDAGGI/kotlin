package com.test.testing.`5흐름제어논리연산자`

fun main(){
    for (i in 1..10){
        if(i == 3) continue
        println(i)
    }
}


fun main2() {
    // 외부 반복문을 종료할때
    loop@for (i in 1..10){
        if(i == 3) break@loop
        println("안의 내용 종료")
    }
}