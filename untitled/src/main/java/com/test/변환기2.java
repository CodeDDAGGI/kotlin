package com.test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 변환기2 {
    public int covert(String num) {
        try {
            return Integer.parseInt(num);
        } catch (NumberFormatException e) { // 구체적인 예외 처리
            throw new IllegalArgumentException("잘못된 숫자 입력: " + num);
        }
    }

    public List<Integer> covert(int[] number){
        return Arrays.stream(number)
                .boxed()
                .toList();

//        return IntStream.of(number)
//                .boxed()
//                .collect(Collectors.toList());
    }

//    public int[] covert(List<Integer> number){
//        return number.stream()
//                .mapToInt(Integer::intValue)
//                .toArray();
//    }

//    public Set<String> covert(List<String> names){
//        return new HashSet<>(names);
//    }

    public Map<String, Integer> convert(List<String> words) {
        return words.stream() // List<String> → Stream<String>
                .collect(Collectors.toMap(word -> word, String::length)); // Map 생성
    }

    public static void main(String[] args) {
        변환기2 code = new 변환기2();
        System.out.println(code.covert("123")); // 정상 출력: 123
        System.out.println(code.covert("abc")); // 예외 발생

        int[] arr = {1, 2, 3, 4};
        System.out.println(code.covert(arr));
    }
}

