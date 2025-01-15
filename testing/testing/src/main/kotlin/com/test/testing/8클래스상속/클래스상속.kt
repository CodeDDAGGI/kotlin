package com.test.testing.`8클래스상속`

fun main(){

    var a = Animal("백구" , 3 , "개")
    var b = Dog("흰둥이" , 3)

    var c = Cat("누룽지" , 3)

    a.introduce();
    b.introduce();
    b.bark() // Dog의 단일 메소드

    c.introduce();
    c.meow();
}

// 코틀린은 상속금지가 기본값 - open을 붙여야 상속이 가능
open class Animal(var name: String , var age: Int , var type:String){
    fun introduce(){
        println("이름은 ${name}이고 , 나이는 ${age}이며 , 종류는 ${type}입니다")
    }
}

// 상속에 대한 규칙
// 1. 슈퍼 클래스(상위클래스)는 존재하는 속성과 같은 이름의 속성을 가질 수 없음
// 2. 서브 클래스가 생성될때는 슈퍼클래스의 생성자까지 호출되어야함

// 클래스 선언 뒤에 콜론을 붙이고 슈퍼 클래스의 생성자를 호출할 수 있도록 해줌
class Dog(name:String , age:Int) :Animal(name, age, "개"){
    fun bark(){
        println("멍멍")
    }
}

class Cat(name:String, age:Int) : Animal(name, age , "고양이"){
    fun meow(){
        println("야옹")
    }
}