package com.zjf.model;

/**
 * className:Address
 * package:com.zjf.model
 * Description:简单描述
 *
 * @date: 2019/11/4 22:49
 * @Author: ASUS
 */
public class Address implements Cloneable{
    private String addName;

    public Address(String addName) {
        this.addName = addName;
    }

    public Address() {
    }

    public String getAddName() {
        return addName;
    }

    public Address setAddName(String addName) {
        this.addName = addName;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
