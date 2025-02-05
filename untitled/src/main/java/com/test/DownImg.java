package com.test;

public class DownImg {
    public String downloadImg(String url) throws InterruptedException {
        Thread.sleep(1000);
        return "저장 완료 " + url;
    }

    public String saveImg(String img) throws InterruptedException{
        Thread.sleep(1000);
        return "이미지 데이터 " + img;
    }
}
