package com.zjf.test01;

import java.util.Date;

/**
 * className:TestMain01
 * package:com.zjf.test01
 * Description:简单描述
 *
 * @date: 2019/9/11 10:21
 * @Author: ASUS
 */
public class TestMain01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        try {
            Thread.sleep(15000);
            System.gc();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }
}
