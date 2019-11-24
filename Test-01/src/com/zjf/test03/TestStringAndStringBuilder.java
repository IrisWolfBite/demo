package com.zjf.test03;
import java.lang.ref.*;

/**
 * className:TestStringAndStringBuilder
 * package:com.zjf.test03
 * Description:简单描述
 *
 * @date: 2019/11/17 10:44
 * @Author: ASUS
 */
public class TestStringAndStringBuilder {
    public static void main(String[] args) {
        String s1 = "123";
        System.out.println(s1);

        change(s1);
        System.out.println(s1);
    }

    static void change(String s){
        s = "345";
    }
}
