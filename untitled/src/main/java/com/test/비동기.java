package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class 비동기 {
    public static void main(String[] args) {
        List<String> imgList = Arrays.asList("url1" , "url2" , "url3");
        DownImg img = new DownImg();
        long start =System.currentTimeMillis();

        CompletableFuture<?>[] futures = imgList.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> {
                    try {
                        String down = img.saveImg(s);
                        return img.saveImg(down);
                    } catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                })).toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(futures).join();

        System.out.println("걸리는 시간 : " + (System.currentTimeMillis() - start) + "ms");
    }
}
