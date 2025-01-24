package com.test.testing.`9오버라이딩,추상화`

fun main(){

    var t = Tiger()
    var d = Animal()
    var c = Int;
    d.eat()
    t.eat()

//    var h = Animal2();

    var h = Dog()

    h.run();
    h.eat()
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
// 추상 클래스는 abstract 키워드를 사용하여 선언할 수 있음

abstract class Ainmal2 {
    abstract fun eat()
    fun sniff() {
        println("헉")
    }
}

// 추상 클래스는 상속받은 서브 클래스에서 반드시 추상 함수를 구현해야함
// 단독으로 인스턴스를 만들 수 없음
class Rabbit: Ainmal2(){
    override fun eat() {
        println("당근을 먹는다")
    }
}

// 인터페이스
// 코틀린에서는 속성 , 추상함수, 일반함수를 가질수 있음
// 구현부가 있는 함수 -> open 함수
// 구현부가 없는 함수 -> abstract 함수
// 서브 클래스 -> 인터페이스를 상속받을때는 override 키워드를 사용하지 않음
// 인터페이스를 2개 상속받는 클래스 예시
interface runner{
    fun run()
}

interface eater{
    fun eat(){
        println("음식을 먹는다")
    }
}

// 인터페이스를 상속 받는 방법
class Dog:runner, eater{
    override fun run() {
        println("우다다다")
    }

    override fun eat() {
        println("개밥을 먹는다")
    }
}