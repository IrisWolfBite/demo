package com.zjf.productorAndConsumer;

/**
 * className:Consumer
 * package:com.zjf.productorAndConsumer
 * Description:简单描述
 *
 * @date: 2019/9/10 8:10
 * @Author: ASUS
 */
public class Consumer extends Thread{
    private Cab cab;

    public Consumer(Cab cab) {
        super();
        this.cab = cab;
    }

    public Consumer() {
        super();
    }

    //不断消费产品
    @Override
    public void run(){
        for (int i = 1;i <= 500; i++) {
             cab.get();
        }
    }
}
