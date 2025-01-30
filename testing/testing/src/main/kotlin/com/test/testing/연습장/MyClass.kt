package com.test.testing.연습장

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.full.declaredMemberProperties

//class MyClass {
//
//    fun dis(){
//        println("Hello")
//    }
//    fun durr() {
//        println("Kotlin")
//    }
//}

//fun main() {
//    val myClass = MyClass::class;
//    println(" 클래스 이름 : ${myClass.simpleName}")
//    val fun0 = myClass.declaredMemberFunctions
//    fun0.forEach{ println(it.name)}
//}

//class User (val name : String = "홍길동", var age : Int = 0){
//    fun greet(){
//        println("Hello, $name")
//    }
//
//    fun aged () {
//        println("age : $age")
//    }
//
//}
//
//fun main() {
//    val userClass = User::class
//    val userInstance = userClass.createInstance() // 생성자 호출
//
//    println("객체 ${userInstance.greet()}")
//    userInstance.greet()
//}


//class User(val name: String) {
//    fun greet() {
//        println("Hello, $name!")
//    }
//
//    fun greetWithAge(age: Int) {
//        println("Hello, $name! You are $age years old.")
//    }
//}
//
//fun main() {
//    val user = User("Alice")
//
//    // greet() 메서드 호출
//    val greetMethod = User::class.declaredMemberFunctions.find { it.name == "greet" }
//    greetMethod?.call(user) // 동적으로 greet 메서드 호출
//
//    // greetWithAge() 메서드 호출
//    val greetWithAgeMethod = User::class.declaredMemberFunctions.find { it.name == "greetWithAge" }
//    greetWithAgeMethod?.call(user, 30) // 동적으로 greetWithAge 메서드 호출
//}

class User(var name: String , var age : Int)

fun main(){
    val user = User("Alice" , 30)

    // name 프로퍼티 읽기
    val nameProp = User::class.declaredMemberProperties.find { it.name == "name" }
    println("이름: ${nameProp?.get(user)}") // Alice

    // age 프로퍼티 수정하기
    val ageProp = User::class.declaredMemberProperties.find { it.name == "age" }
    (ageProp as? kotlin.reflect.KMutableProperty1<User, Int>)?.set(user, 35)
    println("나이: ${user.age}") // 35
}