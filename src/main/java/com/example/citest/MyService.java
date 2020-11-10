package com.example.citest;

import org.springframework.stereotype.Service;

/**
 * @program: ci-test
 * @ClassName MyService
 * @description:
 * @author: muxiaonong
 * @create: 2020-11-10 23:03
 * @Version 1.0
 **/
@Service
public class MyService {

    public int add(int a, int b) {
        return a+b;
    }
}