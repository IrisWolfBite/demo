package com.zjf;

import java.io.*;
import java.nio.charset.StandardCharsets;

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
        String recourseFile = "F:/截图/2019-06-05_100042.png";
        String destinationFile = "C:/Users/ASUS/Desktop/desitination.png";
//        copyFileWithStream(recourseFile,destinationFile);

        //使用字节缓冲流BufferedOutPutStream、BufferedInPutStream完成文件的拷贝
//        copyFileWithBufferedStream(recourseFile,destinationFile);

        //使用字符流Writer、Reader完成对文本的拷贝(只能对文本进行拷贝)
        copyFile("D:/io/a.txt","D:/io/b.txt");

    }


    private static void copyFileWithStream(String resourceFile,String destinationFile) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(resourceFile);
            fos = new FileOutputStream(destinationFile,true);
            //读取文件数据，read()方法从文件中读取一个字节数组，并把读取到的数组返回，读到文件末位则返回-1
            byte[] bytes = new byte[1024];
            int num = 0;
            while ((num = fis.read(bytes)) != -1){
                //把读取到的字节数组保存到输出流中
                fos.write(bytes,0,num);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            //关闭流通道
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


    private static void copyFileWithBufferedStream(String rescourseFile,String destinationFile){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(rescourseFile));
            bos = new BufferedOutputStream(new FileOutputStream(destinationFile,true));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
            bos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bis != null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void copyFile(String resourceFile,String desitinationFile){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            //原文本文件的编码方式
            isr = new InputStreamReader(new FileInputStream(resourceFile),"GBK");
            //选择要输出的编码方法，默认就是当前环境的编码方式(utf-8)
            osw = new OutputStreamWriter(new FileOutputStream(desitinationFile,true), StandardCharsets.UTF_8);
            char[] chars = new char[1024];
            int len = 0;
            while ((len = isr.read(chars)) != -1){
                osw.write(chars,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(osw != null){
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
