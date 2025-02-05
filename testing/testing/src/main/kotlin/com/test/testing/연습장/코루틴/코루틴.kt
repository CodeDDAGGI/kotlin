package com.test.testing.연습장.코루틴

import kotlinx.coroutines.*
import java.util.concurrent.Executors

val customDispatcher = Executors.newFixedThreadPool(3).asCoroutineDispatcher()
//suspend fun fetchData(): String {
//    delay(2000) // 2초 동안 일시 중단
//    return "데이터 로딩 완료!"
//}
//
//fun main() = runBlocking {
//    val start = System.currentTimeMillis()
//    println("데이터 요청 중...")
//    val result = fetchData()
//    println("결과: $result \n${System.currentTimeMillis() - start}ms")
//}


//fun main() = runBlocking {
//    // 3개의 스레드를 가진 스레드 풀을 생성하고, 이를 Dispatcher로 변환
//    val customDispatcher = Executors.newFixedThreadPool(3).asCoroutineDispatcher()
//
//    val job1 = async(customDispatcher) {
//        delay(1000)
//        "작업 1 완료"
//    }
//
//    val job2 = async(customDispatcher) {
//        delay(2000)
//        "작업 2 완료"
//    }
//
//    println(job1.await()) // 1초 후 출력
//    println(job2.await()) // 2초 후 출력
//
//    // Dispatcher 사용 종료
//    (customDispatcher.executor as ExecutorService).shutdown()
//}

//suspend fun fetchData() : String {
//    delay(2000)
//    return "데이터 로드 완료"
//}
//
//fun main() = runBlocking {
//    val ds = launch {
//        delay(1000)
//        println("데이터 요청 중...")
//        val result = fetchData()
//        println("결과 : $result")
//    }
//    ds.join()
//}

//suspend fun fetchData () : String {
//    delay(2000)
//    return "데이터 로드 완료"
//}
//
//fun main() = runBlocking{
//    println("데이터 요청 중")
//
//    val result = async { fetchData() }
//
//    // await()을 통해 결과 출력
//    println("결과 : ${result.await()}")
//}
//
//suspend fun fetchData() : String {
//    delay(2000)
//    return "데이터 로드 완료"
//}
//
//fun main() = runBlocking {
//    val ds = async{
//        delay(1000)
//        println("데이터 요청 중 ..")
//        val result = fetchData()
//        println(result)
//    }
//    ds.await()
//}

//suspend fun taskA(): String {
//    println("A시작")
//    delay(2000)
//    return "Task A 완료"
//}
//
//suspend fun taskB(): String {
//    println("B시작")
//    delay(2000)
//    return "Task B 완료"
//}
//
//fun main() = runBlocking {
//    val time = System.currentTimeMillis()
//
//    val dA = async { taskA() }
//    val dB = async { taskB() }
//
//    println( dA.await())
//    println( dB.await())
////    val list = listOf(taskA() , taskB())
////    val result = list.map {
////        task -> task
////    }
//
//    println("총 실행 시간 : ${System.currentTimeMillis() - time}ms")
//}

//suspend fun longRunningTask(): String {
//    delay(5000) // 5초 후 완료
//    return "작업 완료!"
//}

//fun main() = runBlocking {
//    try {
//        val result = withTimeout(3000){
//            longRunningTask()
//        }
//        println("결과: $result")
//    } catch (e: TimeoutCancellationException) {
//        println("시간 초과!")
//    }
//}


//fun main() = runBlocking {
//    launch {
//        delay(1000)
//        println("World")
//    }
//    println("Hello")
//}

//suspend fun addNumbers(a:Int , b: Int):Int{
//    delay(1000)
//    return a + b
//}
//
//fun main() = runBlocking{
//    val result = async {
//        addNumbers(5, 10)
//    }
//    println("Result: ${result.await()}")
//}
//
//fun main() = runBlocking {
//    println("시작!")
//    val start = System.currentTimeMillis()
//    coroutineScope {
//        launch {
//            delay(3000)
//            println("코루틴 1 완료")
//        }
//
//        launch {
//            delay(1500)
//            println("코루틴 2 완료")
//        }
//    }
//
//    println("모든 코루틴 완료 후 실행 \n${System.currentTimeMillis() - start}ms")
//}


//fun main() {
//    println("프로그램 시작")
//
//    runBlocking {
//        println("runBlocking 시작")
//        delay(3000)
//        println("runBlocking 끝")
//    }
//
//    println("runBlocking 이후 실행됨")
//
//    GlobalScope.launch {
//        coroutineScope {
//            println("coroutineScope 시작")
//            delay(3000)
//            println("coroutineScope 끝")
//        }
//    }
//
//    Thread.sleep(3000) // 코루틴이 끝날 때까지 대기 (실제 코드에서는 사용 지양)
//    println("프로그램 종료")
//}


fun main(): Unit = runBlocking {
    launch(Dispatchers.Default) { // 🔥 기본적으로 백그라운드 스레드에서 실행
        println("Default Dispatcher 실행: ${Thread.currentThread().name}")
    }
}
