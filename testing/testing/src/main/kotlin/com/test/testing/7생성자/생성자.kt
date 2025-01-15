package com.test.testing.`7생성자`

import com.test.testing.`6클래스`.Person

fun main(){

    var a = Person2("홍길동", 20)
    var b = Person2("김길동" , 25)
    var c = Person2("기동" , 298)

    a.자기소개();
    b.자기소개();
    c.자기소개();

    var d = Person3("이름", 30)
    var f = Person3("기동동")

}

class Person2(var name:String , val age:Int){
    fun 자기소개 (){
        println("이름은 ${this.name}이고 , 나이는 ${age}입니다")
        println("네임 ${name}")
    }
}

// 파라미터나 반환형이 없음
class Person3(var walid:String , val year:Int){
    init {
        println("${this.walid} 와 ${this.year}")
    }

    // 보조생성자
    // 보조생성자는 기본생성자를 호출해야함
    // 보조생성자를 만들때는 기본 생성자를 초기화해줘야함
    // 동일한 값을 사용할때 ex) 10
    constructor(name:String) : this(name, 10){
        println("보조 생성자가 호출되었습니다")
    }
}


