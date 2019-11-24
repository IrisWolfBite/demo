package com.zjf.test;

/**
 * className:TestMain9
 * package:com.zjf.test
 * Description:第1个人10岁，第2个比第1 个人大2岁，依次递推，请用递归方式计算出第8个人多大？
 *
 * @date: 2019/8/14 17:21
 * @Author: ASUS
 */
public class TestMain9 {
    public static void main(String[] args) {
        System.out.println(count(8));
    }

    private static int count( int num) {
        if(num == 1){
            return 10;
        }
        return (count(num - 1) + 2) ;
    }
}
