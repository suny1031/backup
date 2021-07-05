package com.toy.test.test;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/test")
public class RestTemplate {


    @PostMapping("/post")
    public void post(@RequestBody List<TestVo> testVos){
        System.out.println("roQkrwlsp");

        System.out.println(testVos.toString());

    }





}
