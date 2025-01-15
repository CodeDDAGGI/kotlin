package com.test.testing.`9오버라이딩,추상화`

fun main(){

    var t = Tiger()
    var d = Animal()

    d.eat()
    t.eat()
}

// 함수를 재구현 하는 방법
// 서브 클래스에서 override 키워드를 사용하여 슈퍼 클래스(상위)의 함수를 재구현할 수 있음
open class Animal{
    open fun eat(){
        println("음식을 먹는다")
    }
}

class Tiger:Animal(){
    override fun eat(){
        println("고기를 먹는다")
    }
}

// 오버라이드를 작성안할 시 오류 뜸
// 상속을 받을때는 override를 무조건 작성해야함
//open class Human{
//    open fun eat(){}
//}
//
//class Korean:Human(){
//    fun eat(){
//        println("밥을 먹는다")
//    }
//}

// 추상 클래스
