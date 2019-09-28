package com.zjf.test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * className:kk
 * package:com.zjf.test
 * Description:测试单例模式
 *              -------->https://blog.csdn.net/zhangliangzi/article/details/52438401
 *
 * @date: 2019/8/14 15:14
 * @Author: ASUS
 */
public class kk {
    public static void main(String[] args) {

        //饿汉模式
        /*Singleton_01 s1 = Singleton_01.getInstance();
        Singleton_01 s2 = Singleton_01.getInstance();
        System.out.println(s1 == s2);*/


        /*饱汉模式(模拟多线程访问)*/

        //创建一个固定的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(200);
        for (int i = 0; i < 1000; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    Singleton_02 instance = Singleton_02.getInstance();
                    System.out.println(instance);
                }
            });
        }
    }
}
