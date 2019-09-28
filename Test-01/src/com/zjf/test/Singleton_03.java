package com.zjf.test;

/**
 * className:Singleton_01
 * package:com.zjf.test
 * Description:单例模式--->双重锁模式
 *   ---需在要创是饱汉模式的优化，进行双重判断，当已经创建过实例对象后就无需加锁，提高效率。也是一种推荐使用的方式。
 *
 * @date: 2019/8/14 15:18
 * @Author: ASUS
 */
public class Singleton_03 {

    private static Singleton_03 s;

    private Singleton_03() {
    }

    public static  Singleton_03 getInstance(){
        if(s == null){
            synchronized (Singleton_03.class){
                if(s == null){
                    s = new Singleton_03();
                }
            }
        }
        return s;
    }
}
