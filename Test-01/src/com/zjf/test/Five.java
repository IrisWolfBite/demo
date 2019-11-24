package com.zjf.test;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:Five
 * package:com.zjf.test
 * Description:简单描述
 *
 * @date: 2019/10/1 21:31
 * @Author: ASUS
 */
public class Five {


    public static void main(String[] args) {
        byte b1 = 1,b2 = 2,b3,b6;
        final byte b4 = 4,b5 = 6;
        Boolean flag = false;
        flag = Boolean.valueOf(true);
//        flag = true;
        if(flag){
            System.out.println("right");
        }else {
            System.out.println("wrong");
        }
         b6 = (b4 + b5);
//        b3 = b1 + b2;
//        System.out.println(b3 + b6);


        byte[] b = {1,2,4,5};
        String s= null;
        try {
            s = new String(b,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(s);
        int a = 'A';
        System.out.println(a);


    }

}
