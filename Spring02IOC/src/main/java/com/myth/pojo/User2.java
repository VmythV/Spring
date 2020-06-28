package com.myth.pojo;

/**
 * @author myth
 * @Date 2020-06-20 21:31
 */
public class User2 {
    private String name;

    public User2(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
