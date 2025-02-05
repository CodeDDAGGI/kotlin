package com.test.testingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@SpringBootApplication
public class TestingjavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestingjavaApplication.class, args);
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () -> {

        }

    }

}
