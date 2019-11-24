package com.zjf.test01;

/**
 * className:ttt
 * package:com.zjf.test01
 * Description:简单描述
 *
 * @date: 2019/9/27 10:14
 * @Author: ASUS
 */
public class ttt {
    public static void main(String[] args) {
        Object o1 = TestMain04.DoubleCheckSingleton();
        Object o2 = TestMain04.DoubleCheckSingleton();
        Object o3 = TestMain04.DoubleCheckSingleton();
        System.out.println(o1 == o2 && o2 == o3);
    }
}
