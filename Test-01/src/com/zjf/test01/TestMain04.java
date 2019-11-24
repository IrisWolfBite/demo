package com.zjf.test01;

import com.zjf.test.Singleton;

/**
 * className:TestMain04
 * package:com.zjf.test01
 * Description:冒泡排序
 *
 *
 * @date: 2019/9/26 10:19
 * @Author: ASUS
 */
public final class TestMain04 {
    private static volatile Object SingleObject;

    private TestMain04(){

    }

    public static Object DoubleCheckSingleton(){
        if(null == SingleObject){
            synchronized (TestMain04.class){
                if(null == SingleObject){
                    SingleObject = new Object();
                }
            }
        }
        return SingleObject;
    }
}
