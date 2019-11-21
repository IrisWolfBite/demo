package com.zjf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * className:IOTest
 * package:com.zjf
 * Description:关于IO流的练习
 *
 * @date: 2019/11/21 20:40
 * @Author: ASUS
 */
public class IOTest {
    public static void main(String[] args) {
        //使用字节流OutPutStream、InPutStream完成文件的拷贝
        String recourseFile = "";
        String destinationFile = "";
       copyFileWithStream(recourseFile,destinationFile);

       //使用字符流Writer、Reader完成对小文件的拷贝
    }


    private static void copyFileWithStream(String resourceFile,String destinationFile){
        try {
            FileInputStream fis = new FileInputStream(resourceFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
