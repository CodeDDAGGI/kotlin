package com.test.testing.`4반복문`

fun main() {

    var a = 0

    // while문
    while(a < 5) {
        println(a++)
    }

    do
    {
        println(a++)
    } while(a< 5)

    // for 문
    // i가 0에서 9까지 자동으로 1씩 증가함
    // 1증가는 자동으로 반영댐
    for(i in 0..9){
        println(i)
    }

    // until : 끝 값을 포함하지 않음
    for(i in 1 until 5){
        println(i)
    }

    // step : 반복 간격을 설정할 수 있음
    for(i in 1..10 step 2){
        println(i)
    }

    // downTo : 값을 감소시킴
    for(i in 5 downTo 1){
        println(i)
    }
}