package com.test.testing.연습장.비동기

import java.util.concurrent.*

private val executor = Executors.newFixedThreadPool(3)
//
//class NetworkClient(){
//    fun fetchData(callback : (String) -> Unit){
//        executor.submit{
//            Thread.sleep(2000)
//            callback("Hello, Kotlin")
//        }
//    }
//}
//
//fun main() {
//    val client = NetworkClient();
//    val startTime = System.currentTimeMillis()
//    client.fetchData {
//            data ->
//        println("$data")
//        println("총 소요 시간 : ${System.currentTimeMillis() - startTime}ms\n")
//    }
//}

//fun tasked (
//    task : String,
//    callback: () -> Unit
//) {
//    executor.submit{
//        Thread.sleep(1000)
//        println("$task 작업중..")
//        callback()
//    }
//}
//
//fun main() {
//    val start = System.currentTimeMillis()
//    val tasks = listOf("Task1" , "Task2")
//    val future = tasks.map {
//        task -> tasked(task){
//            Thread.sleep(1000)
//            println("$task Completed")
//        }
//    }
//
//    executor.shutdown()
//    println("총 소요 시간 : ${System.currentTimeMillis() - start}ms")
//}

//fun tasked(
//    task:String
//): CompletableFuture<String> =
//    CompletableFuture.supplyAsync({
//        Thread.sleep(2000)
//        "$task Completed"
//    },executor)
//
//fun main() {
//    val tasks = listOf("task 1" , "task 2" , "task 3")
//    val start = System.currentTimeMillis()
//    val taskPlay = tasks.map {
//        task -> tasked(task)
//    }
//    taskPlay.forEach{ future ->
//        println(future.get())
//    }
//
//
//    executor.shutdown()
//    println("${System.currentTimeMillis() - start}ms")
//}

//fun main() {
//    val start = System.currentTimeMillis()
//    val future: Future<*> = executor.submit<String> {
//        Thread.sleep(1000)
//        "Task Completed"
//    }
//
//    val result = future.get()
//    println("${System.currentTimeMillis() - start}ms,\n결과 : $result")
//    executor.shutdown()
//}

//fun main() {
//    val future1 = CompletableFuture.supplyAsync {
//        Thread.sleep(1000)
//        "Task 1 Completed"
//    }
//
//    val future2 = CompletableFuture.supplyAsync {
//        Thread.sleep(1500)
//        "Task 2 Completed"
//    }
//
//    val combinedFuture = future1.thenCombine(future2) { result1, result2 ->
//        "$result1, $result2"
//    }
//
//    val allOfFuture = future2.thenRun(){
//
//    }
//
//    println(combinedFuture.get())
//}

//fun main() {
//    val future1 = CompletableFuture.supplyAsync { 1 }
//    val future2 = CompletableFuture.supplyAsync { 2 }
//    val future3 = CompletableFuture.supplyAsync { 3 }
//
//    val allOfFuture = CompletableFuture.allOf(future1, future2, future3)
//
//    allOfFuture.thenRun {
//        println("All tasks completed")
//    }
//
//    allOfFuture.join()
//}

//fun main() {
//    val future1 = CompletableFuture.supplyAsync {
//        Thread.sleep(1000)
//        "Task 1 Completed"
//    }
//    val future2 = CompletableFuture.supplyAsync {
//        Thread.sleep(500)
//        "Task 2 Completed"
//    }
//
//    val anyOfFuture = CompletableFuture.anyOf(future1, future2)
//
//    println(anyOfFuture.get())
//}

//fun main() {
//    val future: Future<Int> = executor.submit<Int> {
//        Thread.sleep(2000)
//        42  // 반환 값
//    }
//
//    println("작업 시작")
//    val result = future.get()  // 작업이 완료될 때까지 대기
//    println("결과: $result")
//    executor.shutdown()
//}

//
//fun main() {
//    val future: Future<Int> = executor.submit<Int>{
//        Thread.sleep(3000)
//        42  // 반환 값
//    }
//
//    try {
//        println("작업 시작")
//        val result = future.get(2, TimeUnit.SECONDS)  // 2초만 대기
//        println("결과: $result")
//    } catch (e: TimeoutException) {
//        println("작업이 지정된 시간 내에 완료되지 않았습니다.")
//    }
//
//    executor.shutdown()
//}

//fun main() {
//    val future: Future<Int> = executor.submit <Int>{
//        Thread.sleep(5000)
//        42  // 반환 값
//    }
//
//    println("작업 시작")
//    Thread.sleep(1000)
//    val canceled = future.cancel(true)  // 작업 취소
//    println("작업 취소: $canceled")
//
//    executor.shutdown()
//}

//fun main() {
//    val future: Future<Int> = executor.submit <Int>{
//        Thread.sleep(2000)
//        42  // 반환 값
//    }
//
//    while (!future.isDone) {
//        println("작업이 아직 완료되지 않았습니다.")
//        Thread.sleep(500)
//    }
//
//    println("작업 완료!")
//    executor.shutdown()
//}


//fun main() {
//    val future: Future<Int> = executor.submit <Int>{
//        Thread.sleep(3000)  // 3초 대기
//        42  // 반환 값
//    }
//
//    println("작업 시작")
//    Thread.sleep(1000)  // 1초 대기 후
//    future.cancel(true)  // 작업 취소
//
//    println("작업 취소 여부: ${future.isCancelled}")  // true 출력
//    executor.shutdown()
//}

//fun main() {
//    val future = CompletableFuture.supplyAsync {
//        println("작업 실행 중...")
//        if (true) throw RuntimeException("예외 발생!") // 강제 예외 발생
//        "작업 완료"
//    }.exceptionally { ex ->
//        println("예외 발생: ${ex.message}")
//        "대체 값" // 예외 발생 시 반환할 값
//    }
//
//    println("결과: ${future.get()}") // 예외가 발생하면 "대체 값" 출력
//}


//fun main() {
//    val future = CompletableFuture<String>()
//
//    // 별도의 스레드에서 2초 후 예외 발생
//    Thread {
//        Thread.sleep(2000)
//        future.completeExceptionally(RuntimeException("강제 예외 발생!"))
//    }.start()
//
//    // 예외 발생 시 처리
//    val result = future.exceptionally { ex ->
//        println("예외 발생: ${ex.message}")
//        "대체 값"
//    }.get()
//
//    println("결과: $result") // 예외 발생 시 "대체 값" 출력
//}

