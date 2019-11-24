package com.zjf.test;

import java.io.Console;
import java.util.Scanner;

/**
 * className:TestMain14
 * package:com.zjf.test
 * Description:输入一个整数，将这个整数以字符串的形式逆序输出。
 *              程序不考虑负数的情况，若数字含有0，则逆序也会含有0
 *              如输入100，输出001
 *
 * @date: 2019/10/1 9:54
 * @Author: ASUS
 */
public class TestMain14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i = scanner.nextInt();
        String str = String.valueOf(i);
        StringBuilder sb = new StringBuilder();
        for (int j = str.length() - 1; j >= 0; j--) {
            sb.append(str.charAt(j));
        }
        System.out.println(sb);

    }
}
