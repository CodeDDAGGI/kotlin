package com.test;

import java.util.Arrays;
import java.util.List;

public class 동기 {
    public static void main(String[] args) {
        List<String> imgList = Arrays.asList("url1" , "url2" , "url3");
        DownImg downImg = new DownImg();
        long start =System.currentTimeMillis();

        imgList.stream().map(s -> {
            try {
                String down = downImg.downloadImg(s);
                return downImg.saveImg(down);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).forEach(System.out::println);

        System.out.println("걸리는 시간 : " + (System.currentTimeMillis() - start));

    }
}

