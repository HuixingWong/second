package com.example.huixing.day4;

/**
 * Created by huixing on 2016/9/21.
 */

public class User {
    private int head;
    private String name;
    private String desc;

    public User(int head, String name, String desc) {
        this.head = head;
        this.name = name;
        this.desc = desc;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
