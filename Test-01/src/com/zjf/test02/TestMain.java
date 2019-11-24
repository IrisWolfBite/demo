package com.zjf.test02;

import com.zjf.model.Student;

/**
 * className:TestMain
 * package:com.zjf.test02
 * Description:ThreadLocal的使用
 *
 * @date: 2019/11/3 9:28
 * @Author: ASUS
 */
public class TestMain {
    private static ThreadLocal<Student> threadLocal = new ThreadLocal<Student>();
    public static void main(String[] args) {
        Student s = new Student("zs",23);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                if(threadLocal.get() == null){
                    threadLocal.set(s);
                }
                System.out.println("Thread01："+Thread.currentThread().getName());
                System.out.println(threadLocal.get().toString());
                System.out.println(threadLocal.get().getName());
                System.out.println(threadLocal);
                System.out.println("------------------");
                threadLocal.remove();
            }
        },"Thread1");



        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
            Student s2 = new Student("lisi",s.getAge());
            if(threadLocal.get() != null){
                System.out.println(threadLocal.get().toString());
            }else {
                threadLocal.set(s2);
                System.out.println("Thread02："+Thread.currentThread());
                System.out.println(threadLocal.get().toString());
                System.out.println(threadLocal.get().getName());
                System.out.println(threadLocal);
            }
        }
    },"Thread02");

        t1.start();
        t2.start();

        System.out.println("++++++");
    }
}
