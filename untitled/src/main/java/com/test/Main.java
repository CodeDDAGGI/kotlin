package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//      Object obj = "Hello, World!";  // Object로 선언된 변수에 문자열을 저장
//
//      // 1. obj를 String으로 형변환
//      // 2. 문자열을 대문자로 변환하고, 길이를 출력하세요.
//      System.out.println(obj.toString().length());

//      배열의 모든 숫자를 "숫자1, 숫자2, 숫자3" 형식의 문자열로 변환하여 반환하는 함수를 작성하라.
//        Main obj = new Main();
//        int[] numbers = {10, 20, 30};
//        String result = obj.dis(numbers);
//
//        System.out.println(result);
//
//    }
//        public String dis (int[] numbers){
//            return Arrays.stream(numbers).mapToObj(String ::valueOf).reduce((a,b)-> a + ", " + b).orElse("");
//        }
//        쉼표(,)로 구분된 숫자 문자열 strNumbers가 주어진다.
//        각 숫자를 정수 리스트로 변환하여 반환하는 함수를 작성하라.
//        String strNumbers = "1,2,3,4,5";
//        List<Integer> li = Arrays.stream(strNumbers.split(","))
//                .map(Integer::valueOf)
//                .toList();
//        System.out.println(li.getClass().getName());
//        System.out.println(Arrays.stream(strNumbers.split(","))
//                .map(Integer::valueOf)
//                .toList()
//        );

//        수 리스트 listNumbers가 주어진다.
//        이를 int[] 배열로 변환하는 함수를 작성하라.

//        List<Integer> listNumbers = Arrays.asList(3, 6, 9, 12);
//        int[] result = listNumbers.stream()
//                .mapToInt(Integer ::intValue)
//                .toArray();
//        System.out.println(
//                Arrays.toString(result)
//        );

//        정수 배열 arr이 주어진다.
//        이를 List<Integer>로 변환하는 함수를 작성하라.

//          int[] arr = {7 , 14 , 21};
//
//          // 기본 스트림을 해당 래퍼 클래스 객체의 스트림으로 변환하는데 사용함
//          List<Integer> newArr = IntStream.of(arr)
//                  .boxed()
//                  .toList();
//
//        System.out.println(newArr);

//          String[] words = {"apple", "banana", "cherry"};
//          List<String> result = Arrays.stream(words).toList();
//        System.out.println(result);

//        List<String> wordList = Arrays.asList("dog", "cat", "bird");
//
//        String[] newWords = wordList.toArray(new String[0]);
//        System.out.println(Arrays.toString(newWords));

//        List<Integer> list = Arrays.asList(1, null, 2, 3, null, 4);
//
//        int[] newList = list.stream()
////              .filter(Objects::nonNull)
//                .filter(i -> i != null)
//                .mapToInt(Integer::intValue)
//                .toArray();
//        System.out.println(Arrays.toString(newList));

        String numString = "9 3 6 1 4";

        int [] newNum = Arrays.stream(numString.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        System.out.println(Arrays.toString(newNum));
    }
}

