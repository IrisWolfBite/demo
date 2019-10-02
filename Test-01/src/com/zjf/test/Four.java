package com.zjf.test;

import java.util.Scanner;

/**
 * className:Four
 * package:com.zjf.test
 * Description:输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数
 *实现思路：该int型数据在内存中存储的类型类二进制数据，用Integer.toBinaryString()这个方法
 * @date: 2019/10/1 21:03
 * @Author: ASUS
 */
public class Four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String string = Integer.toBinaryString(num);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if("1".equals(String.valueOf(string.charAt(i)))){
                count++;
            }
        }
        System.out.println("个数为" + count);
    }
}
