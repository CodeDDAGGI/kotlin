package com.test.testing.`6클래스`

fun main(){

    var a = Person("홍길동", 20)
    var b = Person("박보영" , 35)

    a.introduce();
    var s = a.name;
    println(s);
}


// () 안에 작성은 클래스의 속성을 선언과 동시에 생성자를 생성하는 방법
class Person (var name:String , var age:Int){
    fun introduce (){
        println("${age}세 인 ${name} 입니다")
    }
}