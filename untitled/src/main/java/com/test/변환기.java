package com.test;

public class 변환기 {
    public int covert(String number){
        return Integer.parseInt(number);
    }

    public String convert(int number){
        return String.valueOf(number);
    }


    public int convert(double number){
        return (int) number;
    }

    public int convert(char ch){
        return (int) ch;
    }

    public String convert(boolean flag){
        return Boolean.toString(flag);
    }
    public static void main(String[] args) {
        변환기 sol = new 변환기();

        System.out.println(sol.covert("123"));
        System.out.println(sol.convert(456));
        System.out.println(sol.convert(99.99));
        System.out.println(sol.convert('A'));
        System.out.println(sol.convert(true));
        System.out.println(sol.convert(false));
    }


}
