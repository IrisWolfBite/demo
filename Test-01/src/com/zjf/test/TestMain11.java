package com.zjf.test;

import com.zjf.model.Student;

import java.util.*;

/**
 * className:TestMain11
 * package:com.zjf.test
 * Description:简单描述
 *
 * @date: 2019/8/29 21:38
 * @Author: ASUS
 */
public class TestMain11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("zs");
        s1.setAge(21);

        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(21);

        Student s3 = new Student();
        s3.setName("lk");
        s3.setAge(25);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        System.out.println("排序前：" + studentList);
        Collections.sort(studentList);
        System.out.println("排序后：" + studentList);
    }
}
