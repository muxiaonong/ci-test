package com.example.citest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ci-test
 * @ClassName MainController
 * @description:
 * @author: muxiaonong
 * @create: 2020-11-10 23:01
 * @Version 1.0
 **/
@RestController
public class MainController {

    @Autowired
    MyService myService;

    @GetMapping("add")
    public int add(int a,int b){
        return myService.add(a,b);
    }

}