package com.xyh.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Shucai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ids;
    private String shucais;
    private String rukus;
    private Integer baoxians;
    private String tupian;
    private double jiages;
}
