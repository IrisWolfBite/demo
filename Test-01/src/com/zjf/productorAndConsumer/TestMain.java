package com.zjf.productorAndConsumer;

import java.security.PublicKey;

/**
 * className:TestMain
 * package:com.zjf.productorAndConsumer
 * Description:简单描述
 *
 * @date: 2019/9/10 8:11
 * @Author: ASUS
 */
public class TestMain {
    public static void main(String[] args) {
        //创建仓库
        final Cab cab = new Cab();

        //创建多个消费者线程
        Consumer c1 = new Consumer(cab);
        Consumer c2 = new Consumer();
        Consumer c3 = new Consumer();
        c1.setName("c1");
        c1.setName("c2");
        c1.setName("c3");
        c1.start();
        c2.start();
        c3.start();

        //创建多个生产者线程
        Productor s1 = new Productor(cab);
        Productor s2 = new Productor(cab);
        Productor s3 = new Productor(cab);
        s1.setName("s1");
        s1.setName("s2");
        s1.setName("s3");
        s1.start();
        s2.start();
        s3.start();
    }
}
