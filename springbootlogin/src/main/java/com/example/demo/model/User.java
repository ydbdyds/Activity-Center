package com.example.demo.model;

import lombok.Data;

@Data
public class User {
    //lombok 的Data注解 不用再写Getset方法 此处为用户Model 第二版再修改
    private String username;
    private String password;
}
