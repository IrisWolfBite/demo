package com.zjf.test;

/**
 * className:TestMain7
 * package:com.zjf.test
 * Description:有一字符串，计算其中的数字、字母和汉字的个数
 *
 * @date: 2019/8/14 12:05
 * @Author: ASUS
 */
public class TestMain7 {
    public static void main(String[] args) {
        String str = "中国 aadf 的111 萨 bbb 菲的 zz 萨菲";
        String s = str.replaceAll(" ", "");
        int num = 0;
        int chinese = 0;
        int ap = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 48 && c <= 58){
                num ++;
            }else if(c >= 97 && c <= 122){
                ap ++;
            }else{
                chinese ++;
            }
        }
        System.out.println("数字个数：" + num);
        System.out.println("字母个数：" + ap);
        System.out.println("汉字个数：" + chinese);
    }


}
