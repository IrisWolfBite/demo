package com.zjf.model;

/**
 * className:Student
 * package:com.zjf.model
 * Description:简单描述
 *
 * @date: 2019/8/30 11:43
 * @Author: ASUS
 */


//这里的Comparable接口需要制定泛型
public class Student implements Comparable<Student> {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Student setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Student s) {
        if(this.name.compareTo(s.name) == 0){
            if(this.age.compareTo(s.age) == 0 ){
                return 0;
            }else if(this.age > s.age){
                return 1;
            }else{
                return -1;
            }
        }else if(this.name.compareTo(s.name) > 0){
            return 1;
        }else{
            return -1;
        }
    }
}
