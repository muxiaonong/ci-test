package com.example.citest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CiTestApplicationTests {

    @Autowired
    MyService myService;

    @Test
    public void testAdd() {
        int add = myService.add(2, 6);
        assert add == 8;
        System.out.println("我是牧小农");
    }

}
