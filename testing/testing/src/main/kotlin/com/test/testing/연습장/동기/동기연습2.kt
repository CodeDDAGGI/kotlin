package com.test.testing.연습장.동기

fun saving(){
    println("파일 저장 중..")
    Thread.sleep(2000)
    println("파일 저장 완료!")
}
fun load(){
    Thread.sleep(1000)
    println("파일 불러오는중..")
    Thread.sleep(2000)
    println("파일 불러오기 완료!")
}

fun saveAndLoadFile (file: String) {
    val startTime = System.currentTimeMillis()
    saving()
    load()

    println("파일 내용 : $file , ${System.currentTimeMillis() - startTime}ms")
}

fun main() {
    saveAndLoadFile("Hello, Kotlin!")
}