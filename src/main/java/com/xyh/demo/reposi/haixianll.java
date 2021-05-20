package com.xyh.demo.reposi;

import com.xyh.demo.pojo.Haixian;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface haixianll extends Repository<Haixian,Integer> {
    List<Haixian> findByIdhIs(String string);
}
