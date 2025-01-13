package com.test.testing.`2형변환`

fun main(){
    // 형변환
    var a: Int = 54321;

    // 코틀린에서는 할당만 해서는 변환되지 않음
    // 암시적 형변환은 지원하지 않음
    var b: Long = a.toLong(); // 명시적 형변환

    // 배열
    var intArr = arrayOf(1,2,3,4,5);

    // null 채워진 배열
    var nullArr = arrayOfNulls<Int>(5);

    intArr[2] = 8;

    println(intArr[2]);
    intArr[4] = 3;

    var intTest = arrayOf(1,2,3,4,5);
    println(intTest);
}