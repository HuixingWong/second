package com.example.huixing.a928activity;

import java.io.Serializable;

/**
 * Created by huixing on 2016/9/28.
 */

public class bean implements Serializable{

    private String name;
    private int age;
    private String address;

    public bean(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public  String tostring(){

        return name+age+address;
    }


}
