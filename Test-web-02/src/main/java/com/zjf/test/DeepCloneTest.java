package com.zjf.test;

import com.zjf.model.Address;
import com.zjf.model.Person;

/**
 * className:DeepCloneTest
 * package:com.zjf.test
 * Description:简单描述
 *
 * @date: 2019/11/4 22:53
 * @Author: ASUS
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        //这里只是Person类实现了Cloneable接口，重写了clone方法（浅克隆，被克隆对象的成员变量中没有引用数据类型）
        /**
         * 云南
         * 男
         * 云南
         * 女
         * 西藏
         * 西藏
         *
         */
        Address address = new Address("云南");
        Person p1 = new Person(address,"男");
        System.out.println(p1.getAddress().getAddName());
        System.out.println(p1.getGender());

        Person p2 = (Person) p1.clone();
        p2.setGender("女");
        System.out.println(p2.getAddress().getAddName());
        System.out.println(p2.getGender());

        address.setAddName("西藏");
        System.out.println(p1.getAddress().getAddName());
        System.out.println(p2.getAddress().getAddName());



        //这里对被克隆对象中的引用类型的成员变量Address类也进行实现cloneable接口，然后重写clone方法(深克隆)
        /**
         * 云南
         * 男
         * 云南
         * 女
         * 西藏
         * 云南
         *
         */

    }
}
