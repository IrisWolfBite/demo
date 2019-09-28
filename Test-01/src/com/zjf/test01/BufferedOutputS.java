package com.zjf.test01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * className:BufferedOutputS
 * package:com.zjf.test01
 * Description:简单描述
 *
 * @date: 2019/9/17 22:00
 * @Author: ASUS
 */
public class BufferedOutputS {
    public static void main(String[] args) {
        OutputStream out = null;
        BufferedOutputStream bos = null;
        try {
            out = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\aa.txt");
            bos = new BufferedOutputStream(out);
            String str = "This is a example";
            byte[] bytes = str.getBytes("UTF-8");
            bos.write(bytes);
            bos.flush();//把缓冲区的数据清空到文件中
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
