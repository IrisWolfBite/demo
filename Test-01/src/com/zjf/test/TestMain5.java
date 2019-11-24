package com.zjf.test;
import java.lang.Byte;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    要求输出字符串    "我ABC"
* */
public class TestMain5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我ABC汉DEF";
        //判断获取需要截取的长度
        int k = trim(str.getBytes("GBK"),6);
        System.out.println(str.substring(0,k));
    }

    private static int trim(byte[] bytes, int j) {
        int num = 0;
        boolean b = false;
        for(int i = 0;i < j;i ++){
            if(bytes[i] < 0 && !b){
              b = true;
            }else{
                num ++;
                b = false;
            }
        }
        return num;
    }
}
