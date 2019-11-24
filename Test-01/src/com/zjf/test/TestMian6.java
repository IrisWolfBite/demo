package com.zjf.test;

import java.io.UnsupportedEncodingException;

/**
 * className:TestMian6
 * package:com.zjf.test
 * Description:编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截
 * 取的字符串，但要保证汉字不被截取半个，如“我 ABC”， 4，应该截取“我 AB”，
 * 输入“我 ABC 汉 DEF”， 6，应该输出“我 ABC”，而不是“我 ABC+汉的半个”。
 *
 *      分析：1.判断字符串是否为空串
 *           2.汉字截半的话对应字节的ASC码为小于0的数值
 *             边界处理，判断最后一个截取的字节是否为负数
 *
 *
 * @date: 2019/8/14 10:57
 * @Author: ASUS
 */
public class TestMian6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "我ABC汉DEF";
        trim(str,6);    //想要的结果："我ABC"
    }

    private static void trim(String str, int i) throws UnsupportedEncodingException {
        if(str.length() != 0){
            byte[] bytes = str.getBytes("GBK");
            String s = "";
            int bLength = bytes.length;//获取字符串字节数组长度
            if(i <= bLength){   //要截取的长度不超过字节长度
                if(bytes[i-1] < 0){   //截取的最后一个字节值为负数
                    if(bytes[i-2] < 0){   //因为GBK编码中文占2个字节，所以还要继续判断
                        s= new String(bytes,0,i-=2,"GBK");
                    }else{
                        s= new String(bytes,0,--i,"GBK");
                    }
                    System.out.println(s);
                }else{    //截取的最后一个字节值为正数
                    i = bLength;
                    s = new String(bytes,0,i);
                    System.out.println(s);
                }
            }else{
                System.out.println("截取长度超过范围！");
            }
        }

    }
}
