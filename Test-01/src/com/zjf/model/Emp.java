package com.zjf.model;

import java.util.Comparator;

/**
 * className:Emp
 * package:com.zjf.model
 * Description:简单描述
 *
 * @date: 2019/8/31 11:24
 * @Author: ASUS
 */
public class Emp {
    private String name;
    private Integer age;

    public Emp(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Emp() {
    }

    public String getName() {
        return name;
    }

    public Emp setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }




    public Emp setAge(Integer age) {
        this.age = age;
        return this;
    }


    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
