package com.xyh.demo.reposi;

import com.xyh.demo.pojo.Shucai;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class shuiguoITest {
    @Autowired
    private shuiguoI si;
    @Autowired
    private yhbiaoI y;
    @Test
    void findAll(){
        System.out.println(si.findAll());
    }
    @Test
    void  fa(){
        System.out.println(y.findAll());
    }

}