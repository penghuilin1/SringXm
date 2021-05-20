package com.xyh.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Shuiguo {
    @Id
    private Integer ido;
    private String nameo;
    private Integer rukuo;
    private Integer baoxiano;
    private String tupiano;
    private double jiageo;
    private Integer xlo;
    private String yingyo;

}
