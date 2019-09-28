package com.zjf.test;

/**
 * className:Singleton_01
 * package:com.zjf.test
 * Description:单例模式--->饱汉模式
 *                    -------在需要创建对象的时候才创建对象，加锁避免线程安全问题，但是付出了效率的代价
 *
 * @date: 2019/8/14 15:18
 * @Author: ASUS
 */
public class Singleton_02 {

    private static Singleton_02 s;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance(){
        if(s == null){
            s = new Singleton_02();
        }
        return s;
    }
}
