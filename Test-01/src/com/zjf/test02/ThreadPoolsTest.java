package com.zjf.test02;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * className:ThreadPoolsTest
 * package:com.zjf.test02
 * Description:简单描述
 *
 * @date: 2019/11/3 11:58
 * @Author: ASUS
 */
public class ThreadPoolsTest {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,7,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(10));
        for(int i = 0;i < 15;i ++){
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    new ThreadPoolsTest().add();
                }
            });
            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }

    public void add(){
        int i = 0;
        ++i;
        System.out.println(i);
    }
}
