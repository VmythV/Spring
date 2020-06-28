package com.myth.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author myth
 * @Date 2020-06-21 13:58
 */
public class User {
    private String name;
    @Autowired
    @Qualifier(value = "cat1")
    private Cat cat;

    @Resource(name = "dog2")
    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }


    public Dog getDog() {
        return dog;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
