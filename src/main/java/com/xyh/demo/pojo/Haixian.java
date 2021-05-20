package com.xyh.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Haixian {
    @Id
    private Integer idh;
    private String nameh;
    private String rukuh;
    private String zhuangtaih;
    private String tupianh;
    private double jiageh;
    private String jieshaoh;
}
