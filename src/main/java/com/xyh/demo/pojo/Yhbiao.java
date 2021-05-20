package com.xyh.demo.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Yhbiao {
    @Id
    private Integer id;
    private String number;
    private String name;
    private Integer password;
    private String address;
    private Integer telephone;
}
