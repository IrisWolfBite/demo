package com.zjf.test01;

import java.io.*;

/**
 * className:IOStream
 * package:com.zjf.test01
 * Description:使用I/O流实现简单的文件复制
 *
 * @date: 2019/9/17 20:05
 * @Author: ASUS
 */
public class IOStream {
    public static void main(String[] args) {
        /*FileInputStream fis = null;
        try {
            File file = new File("C:/Users/ASUS/Desktop/补充.txt");
            fis = new FileInputStream(file);
            byte[] bytes = new byte[1024];//一般是1024倍
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = fis.read(bytes)) != -1){
                sb.append(new String(bytes,0,len));
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/
        String destinationFile = "C:/Users/ASUS/Desktop/补充Copy.txt";
        String resourceFile = "C:/Users/ASUS/Desktop/补充.txt";
        copy(resourceFile,destinationFile);
    }

    public static void copy(String resourceFile,String destinationFile){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(resourceFile);
            fos = new FileOutputStream(destinationFile);
            byte[] bytes = new byte[1024];
            int len = fis.read(bytes);
            while (len != -1){
                fos.write(bytes, 0,len);
                len = fis.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
