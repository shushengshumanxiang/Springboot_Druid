package com.itheima.springboot_druid.domain;

import lombok.Data;

import java.math.BigInteger;
import java.sql.Time;


@Data
public class Employees {
    private BigInteger id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String sex;
    private String id_number;
    private int Status;
    private Time create_time;
    private Time update_time;
    private BigInteger create_user;
    private BigInteger update_user;
}
