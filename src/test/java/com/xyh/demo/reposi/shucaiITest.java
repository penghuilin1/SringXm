package com.xyh.demo.reposi;

import com.xyh.demo.pojo.Haixian;
import com.xyh.demo.pojo.Shucai;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class shucaiITest {
    @Autowired
    private shucaiI s;
    @Autowired
    private haixianll ss;
    @Test
    void  findAll(){
        System.out.println(s.findAll());

}
     @Test
    void as(){
         List<Haixian> list = this.ss.findByIdhIs("401");
         for (Haixian h:list) {
             System.out.println(h);
         }
    }
    @Test
    void add(){
        Shucai shucai = new Shucai();
        shucai.setIds(114);
        shucai.setShucais("鸡蛋");
        shucai.setRukus("2021-11-10");
        shucai.setBaoxians(160);
        shucai.setTupian("12");
        shucai.setJiages(3.6);
        Shucai se=s.save(shucai);
        System.out.println(se);
    }
    @Test
    void  findById(){
       Shucai shucai= s.findById(113).get();
       System.out.println(shucai);
    }
    @Test
    void findss(){
          Shucai shucai =new Shucai();
          shucai.setIds(113);
          shucai.setShucais("鸭蛋");
          shucai.setRukus("2021-11-10");
          shucai.setBaoxians(45);
          shucai.setTupian("12");
          shucai.setJiages(3.6);
          Shucai ss =s.save(shucai);
          System.out.println(ss);
    }
    @Test
    void  uqdata(){
       s.deleteById(115);
       System.out.println("删除成功！");
    }
}