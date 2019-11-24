package com.zjf.test;

/**
 * className:Singleton_01
 * package:com.zjf.test
 * Description:单例模式--->饿汉模式
 *          ------>https://blog.csdn.net/zhangliangzi/article/details/52438401
 * @date: 2019/8/14 15:06
 * @Author: ASUS
 */
public class Singleton_01 {

    //在类加载的时候就创建对象（突出一个"急"）
    private static Singleton_01 s1 = new Singleton_01();

    //构造方法设置为私有的，防止new对象
    private Singleton_01() {
    }

    //此方法返回一个实例化对象，此对象时static的，在内存中保留着他的引用
        //确保每次调用的是同一个对象
    public static Singleton_01 getInstance(){
        return s1;
    }
}
