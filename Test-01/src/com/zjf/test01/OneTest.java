package com.zjf.test01;

/**
 * className:OneTest
 * package:com.zjf.test01
 * Description:简单描述
 *
 * @date: 2019/9/29 19:43
 * @Author: ASUS
 */
public class OneTest {
    public static void main(String[] args){
        new OneTest().t();
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("创建一个线程");
            }
        }).start();
    }

    public void t(){
        new Thread(() -> System.out.println("使用lambda表达式创建一个线程")).start();
    }
}
