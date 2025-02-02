package com.test.testing.연습장.동기

fun operate(a: String?, b: String?, c: String?, operate: (Int, Int, Int) -> Int, sign: String) {
    Thread.sleep(3000)
    val result = operate(
        a?.toIntOrNull() ?: 0,
        b?.toIntOrNull() ?: 0,
        c?.toIntOrNull() ?: 0
    )
    println("$sign 결과 : $result")
}

fun main() {
    println("1번째 숫자 입력")
    val num1 = readlnOrNull()
    println("2번째 숫자 입력")
    val num2 = readlnOrNull()
    println("3번째 숫자 입력")
    val num3 = readlnOrNull()

    operate(num1, num2, num3, { x, y, c -> x + y + c }, "숫자의 합 :")
}
