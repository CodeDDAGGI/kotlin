package com.test.testing.연습장

//fun main() {
//    println(addTen("42"))
//    println(addTen("abc"))
//    println(addTen("100"))
//}
//
//fun addTen(input:String) :Int {
//    return input.toInt() + 10
//}
//
//fun main() {
//    println(sumArray(listOf(1, 2, 3, 4))) // 10
//    println(sumArray(listOf(5, 10, 15)))  // 30
//    println(sumArray(emptyList()))
//}
//
//fun sumArray(numbers: List<Int>):Int {
//    return numbers.toIntArray().sum()
//}

//fun sumNumbers(items: List<Any>): Double {
//    return items.filterIsInstance<Number>().sumOf { it.toDouble() }
//    //filterIsInstance : 값 추출할때 쓰임
// }
//
//fun main(){
//
//println(sumNumbers(listOf(1, 2.5, "Hello", 3)))     // 6.5
//println(sumNumbers(listOf("A", "B", "C")))          // 0.0
//println(sumNumbers(listOf(10, 20, 30.5, true)))     // 60.5
//}

//fun transformValue(value: Any): Int {
//    when(value){
//        is Int ->  return value * 2
//        is Double ->  return value.toInt()
//        is String ->  return value.length
//        else -> return -1
//
//    }
//}
//
//fun main() {
//    println(transformValue("Hello"))   // 5 (문자열 길이)
//    println(transformValue(10))        // 20 (2배)
//    println(transformValue(3.14))      // 3 (정수 변환)
//    println(transformValue(true))      // -1 (조건에 해당하지 않음)
//
//}

//fun convertCollection(input: Any): Any {
//    return when (input){
//        is List<*> -> input
//        // input.toTypedArray().joinToString(prefix = "[", postfix = "]") 이경우는 문자열로 변환을 해줌
//        is Array<*> -> input.toList()
//        else -> emptyList<Any>()
//    }
//}
//
//fun main() {
//    println(convertCollection(arrayOf(1, 2, 3)))       // [1, 2, 3] (리스트)
//    println(convertCollection(listOf(4, 5, 6)))        // [4, 5, 6] (배열)
//    println(convertCollection("Invalid Input"))        // [] (빈 리스트)
//}

//fun safeSum(strings: List<String?>): Int {
//    return strings.sumOf { it?.toIntOrNull() ?: 0 }
//}
//
//
//fun main() {
//    println(safeSum(listOf("10", "20", null, "abc", "30"))) // 60
//    println(safeSum(listOf("1", "2", "3")))                 // 6
//    println(safeSum(listOf(null, "a", "b")))                // 0
//}

//fun extractStrings(items: List<Any>): List<String> {
//    return items.filterIsInstance<String>().map { it.uppercase() }
//}
//
//fun main() {
//    println(extractStrings(listOf("kotlin", 42, 3.14, "java"))) // ["KOTLIN", "JAVA"]
//    println(extractStrings(listOf(1, "hello", true, "world"))) // ["HELLO", "WORLD"]
//    println(extractStrings(listOf(1, 2, 3)))                   // []
//}
