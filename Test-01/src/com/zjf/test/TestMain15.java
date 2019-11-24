package com.zjf.test;

import java.math.BigDecimal;

/**
 * className:TestMain15
 * package:com.zjf.test
 * Description:简单描述
 *
 * @date: 2019/10/27 0:29
 * @Author: ASUS
 */
public class TestMain15 {
    public static void main(String[] args) {
        System.out.println(2023.34+0.11);
        System.out.println(2023.11+0.34);
        System.out.println(BigDecimal.valueOf(2023.34).add(BigDecimal.valueOf(0.11)));
    }
}
