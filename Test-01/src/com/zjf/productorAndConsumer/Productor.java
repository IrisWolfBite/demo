package com.zjf.productorAndConsumer;

import java.util.Random;

/**
 * className:Productor
 * package:com.zjf.productorAndConsumer
 * Description:简单描述
 *
 * @date: 2019/9/10 8:10
 * @Author: ASUS
 */
public class Productor extends Thread{
    private Cab cab;

    public Productor(Cab cab) {
        super();
        this.cab = cab;
    }

    public Productor() {
        super();
    }

    @Override
    public void run() {
    //不断生产产品
        for (int i = 1;i <= 100; i++) {
            String productName = "product" + new Random().nextInt(200);
            cab.save(productName);
        }
    }
}
