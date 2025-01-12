fun main() {
    println("Hello, World!");

    var a: Int; // 변수 선언
    a = 10; // 변수 초기화

    var d : Int = 123; // 변수 선언과 초기화
    // 변수 선언 된 후 초기화를 해주지 않으면 에러 메세지가 뜸

    // null 값 허용하는 법
    var b: Int? = null;

    println(a); // 123
    println(d); // 10
    println(b); // null

    // 정수형 리터럴
    var intValue: Int = 123; // 32비트 10진수
    var longValue: Long = 1234L; // 64비트 10진수
    var intValueByHex: Int = 0x1af; // 16진수
    var intValueByBinary: Int = 0b10110110; // 2진수

    // 실수형 리터럴
    var doubleValue: Double = 123.5; // 64비트 실수
    var doubleValueWithExp: Double = 123.5e10; // 지수 표기법
    var floatValue: Float = 123.5f; // 32비트 실수

    // 문자 리터럴
    var charValue: Char = 'a'; // 문자
    var koreanCharValue: Char = '가'; // 한글
    var escapeCharValue: Char = '\t'; // 이스케이프 문자

    // boolean 리터럴
    var booleanValue: Boolean = true; // 참
    var booleanValue2: Boolean = false; // 거짓

    // 문자열 리터럴
    var stringValue: String = "Hello, World!"; // 문자열
    var multiLineStringValue: String = """
        Hello, World!
        Hello, Kotlin!
    """; // 여러 줄 문자열
    println(stringValue);
    println(multiLineStringValue);

}
