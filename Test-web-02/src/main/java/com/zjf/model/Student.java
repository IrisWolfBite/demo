package com.zjf.model;

import java.io.Serializable;

/**
 * className:Student
 * package:com.zjf.model
 * Description:简单描述
 *
 * @date: 2019/11/13 15:49
 * @Author: ASUS
 */
public class Student implements Serializable{
    private String name;
    private String gender;
    private Integer age;


    public Student(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }
}
