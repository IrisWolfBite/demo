package com.zjf.test;

/**
 * className:Singleton_01
 * package:com.zjf.test
 * Description:单例模式--->双重锁模式（加volatile关键字，最终版本）
 *   ---需在要创是饱汉模式的优化，进行双重判断，当已经创建过实例对象后就无需加锁，提高效率。也是一种推荐使用的方式。
 *
 * @date: 2019/8/14 15:18
 * @Author: ASUS
 */
public class Singleton {

    /**uniqueInstance 采用 volatile 关键字修饰也是很有必要的，  uniqueInstance = new Singleton(); 这段代码其实是分
     为三步执行：
            1.为 uniqueInstance 分配内存空间
            2.初始化 uniqueInstance
            3.将 uniqueInstance 指向分配的内存地址
     但是由于 JVM 具有指令重排的特性，执行顺序有可能变成 1->3->2。指令重排在单线程环境下不会出现问题，但是在
     多线程环境下会导致一个线程获得还没有初始化的实例。例如，线程 T1 执行了 1 和 3，此时 T2 调用
     getUniqueInstance() 后发现 uniqueInstance 不为空，因此返回 uniqueInstance，但此时 uniqueInstance 还未被
     初始化。

     使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。s
     *
     */
    private static volatile Singleton uniqueInstance;

    //无参构造定义成私有属性，防止直接new对象
    private Singleton() {
    }

    public static Singleton getUniqueInstance(){
        //先检测对象是否已经实例化,没有实例化才进入加锁同步代码
        if(uniqueInstance == null){
            //类对象加锁
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }

        return uniqueInstance;
    }
}
