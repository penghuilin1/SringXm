package com.xyh.demo.controller;

import com.xyh.demo.pojo.Haixian;
import com.xyh.demo.pojo.Shucai;
import com.xyh.demo.pojo.Shuiguo;
import com.xyh.demo.pojo.Yhbiao;
import com.xyh.demo.reposi.haixianI;
import com.xyh.demo.reposi.shucaiI;
import com.xyh.demo.reposi.shuiguoI;
import com.xyh.demo.reposi.yhbiaoI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class Booklist {
    @Autowired
    private shucaiI s;
    @Autowired
    private shuiguoI si;
    @Autowired
    private yhbiaoI yh;
    @Autowired
    private haixianI ha;
    @GetMapping("/find")
    public List<Shucai> findAll(){
        return s.findAll();
    }
    @GetMapping("/shuiguo")
    public List<Shuiguo> find(){
        return si.findAll();
    }
    @GetMapping("/fa")
    public List<Yhbiao> fa(){
        return yh.findAll();
    }
    @GetMapping("/hai")
    public List<Haixian> haixians(){
        return ha.findAll();
    }
}
