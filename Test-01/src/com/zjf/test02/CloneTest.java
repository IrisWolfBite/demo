package com.zjf.test02;

import com.zjf.model.Emp;
import com.zjf.model.Student;

/**
 * className:CloneTest
 * package:com.zjf.test02
 * Description:简单描述
 *
 * @date: 2019/11/3 9:46
 * @Author: ASUS
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Emp e1 = new Emp("zs", 23);
        System.out.println(e1);
        System.out.println(e1.getName());

        System.out.println("+++++++++++++++++++++");

        Emp e2 = (Emp)e1.clone();
        e2.setName("lisi");
        System.out.println(e2);
        System.out.println(e2.getName());


    }
}
