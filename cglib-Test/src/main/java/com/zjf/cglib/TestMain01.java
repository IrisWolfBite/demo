package com.zjf.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * className:TestMain01
 * package:com.zjf.cglib
 * Description:简单的cglib动态代理
 *
 * @date: 2019/9/2 21:36
 * @Author: ASUS
 */
public class TestMain01 {

    public void test(){
        System.out.println("hello word");
    }

    public static void main(final String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TestMain01.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy proxy) throws Throwable {
                System.out.println("before mothod run ...");
                Object result = proxy.invokeSuper(o, objects);
                System.out.println("after mothod run...");
                return result;
            }
        });

        TestMain01 testMain01 = (TestMain01) enhancer.create();
        testMain01.test();
    }
}
