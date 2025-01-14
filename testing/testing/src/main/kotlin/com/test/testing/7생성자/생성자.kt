package com.test.testing.`7생성자`

import com.test.testing.`6클래스`.Person

fun main(){

    var a = Person2("홍길동", 20)
    var b = Person2("김길동" , 25)
    var c = Person2("기동" , 298)

    a.자기소개();
    b.자기소개();
    c.자기소개();
}

class Person2(var name:String , val age:Int){
    fun 자기소개 (){
        println("이름은 ${this.name}이고 , 나이는 ${age}입니다")
        println("네임 ${name}")
    }
}

class Person
