package com.toy.test;

import com.toy.test.test.TestVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);


        List<String> animals = Arrays.asList("dog","cat","cat","dog","rabbit");
        animals.stream().filter(name -> name.equals("cat")).forEach(System.out::println);

    }

}
