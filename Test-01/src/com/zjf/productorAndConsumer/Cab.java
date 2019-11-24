package com.zjf.productorAndConsumer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * className:Cab
 * package:com.zjf.productorAndConsumer
 * Description:简单描述
 *
 * @date: 2019/9/10 8:02
 * @Author: ASUS
 */

//仓库
public class Cab {
    private LinkedList<String> list = new LinkedList<String>();

    private static  final int MAX = 100;

    //存储产品，期间不允许消费者消费
    public synchronized void save(String product){
        while (list.size() >= MAX){
            try {
                //当仓库满了，等待消费者消费
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.offer(product);
        System.out.println("+++++++" + Thread.currentThread().getName() + "存储了" + product + "后，仓库有" + list.size());
        this.notifyAll();//唤醒其他等待的线程（消费者）
    }

    //取出产品，生产者需要等消费者取完产品后才能再存储产品
    public synchronized void get(){
        while (list.size() <= 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list.poll();
            System.out.println("--------" + Thread.currentThread().getName() + "消费了后，仓库有" + list.size());
        }
        this.notifyAll();//消费完成，唤醒生产者
    }
}
