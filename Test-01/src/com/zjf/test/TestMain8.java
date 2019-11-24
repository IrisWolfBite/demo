package com.zjf.test;

/**
 * className:TestMain8
 * package:com.zjf.test
 * Description:一个整数，大于0，不用循环和本地变量，按照 n， 2n， 4n， 8n 的顺序递增，当值大于5000
 * 时，把值按照指定顺序输出来。
 *          例： n=1237,则输出为：1237，2474，4948，9896，9896，4948，2474，1237
 *          先递增，再递减
 *
 * @date: 2019/8/14 16:29
 * @Author: ASUS
 */
public class TestMain8 {
    public static void main(String[] args) {
        recursion(1237);
    }

    private static void recursion(int num) {
        if(num <= 5000){
            System.out.println(num);
            num *= 2;
            recursion(num);

            if(num > 5000){
                System.out.println(num);
            }
            System.out.println(num/2);
        }
    }
}

//1237，2474，4948，9896，4948，2474，1237