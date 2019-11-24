package com.zjf.test03;

import java.util.UUID;

/**
 * className:testUUID
 * package:com.zjf.test03
 * Description:简单描述
 *
 * @date: 2019/11/11 14:57
 * @Author: ASUS
 */
public class testUUID {
    public static void main(String[] args) {
        //原来带"-"的UUID有36位，去掉后只有32位
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
    }
}
