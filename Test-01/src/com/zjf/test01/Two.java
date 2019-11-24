package com.zjf.test01;

import java.awt.*;
import java.util.Scanner;

/**
 * className:Two
 * package:com.zjf.test01
 * Description:将一个英文语句以单词为单位逆序排放。
 *              例如：“I am a boy” ---> "boy a am I"
 *实现思路：将此字符串语句以空格隔开拆分，元素逆序输出
 * @date: 2019/9/29 20:23
 * @Author: ASUS
 */
public class Two {
    public static void main(String[] args) {
        String str = "I am a boy";
        reverse(str);
    }


    public static void reverse(String str){
        String[] splitStr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = splitStr.length - 1; i >= 0; i--) {
            sb.append(splitStr[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
