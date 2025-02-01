package com.test.testing.연습장

// https://chatgpt.com/c/679dd91d-67c4-8009-a170-f5bcbddec36f
//문제 1: 기본적인 싱글톤 패턴 구현
//아래 요구사항을 만족하는 싱글톤 객체를 구현하시오.
//
//✅ Logger라는 싱글톤 객체를 만들 것.
//✅ log(message: String) 메서드를 추가하고, 호출될 때마다 "LOG: [message]" 형태로 출력할 것.
//✅ main() 함수에서 Logger.log("Hello")를 여러 번 호출해도 같은 객체에서 실행됨을 확인할 것.
//
//📌 출력 예시
//
//plaintext
//복사
//편집
//LOG: Hello
//LOG: Singleton is working!

//🚀 심화 문제 1: 카운터 싱글톤
//문제 2: 상태를 유지하는 싱글톤 구현
//아래 기능을 갖는 싱글톤 카운터 객체를 만들어라.
//
//✅ Counter라는 싱글톤 객체를 만들 것.
//✅ increase() 메서드를 호출할 때마다 내부 count 값이 증가하도록 구현할 것.
//✅ getCount() 메서드를 통해 현재 count 값을 확인할 수 있도록 할 것.
//✅ main()에서 increase()를 여러 번 호출한 후 getCount()를 출력할 것.
//
//📌 출력 예시
//
//plaintext
//복사
//편집
//Current Count: 1
//Current Count: 2
//Current Count: 3

//💡 챌린지 문제: 싱글톤 + 팩토리 패턴
//문제 3: 싱글톤을 활용한 팩토리 패턴
//팩토리 패턴을 활용해, 한 번만 생성되는 싱글톤 팩토리를 구현하라.
//
//✅ AnimalFactory를 싱글톤 객체로 만들 것.
//✅ register(animalType: String, creator: () -> Animal)을 통해 새로운 동물을 등록할 수 있도록 할 것.
//✅ create(animalType: String) 메서드를 통해 동물을 생성할 것.
//✅ main()에서 AnimalFactory가 한 번만 생성되며, 여러 번 호출해도 같은 팩토리를 사용하는지 확인할 것.
//
//📌 출력 예시
//
//plaintext
//복사
//편집
//Meow
//Bark
//Roar