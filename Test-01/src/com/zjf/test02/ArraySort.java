package com.zjf.test02;

import com.zjf.Utils.RandomArray;

import java.util.Arrays;

/**
 * className:ArraySort
 * package:com.zjf.test02
 * Description:简单描述
 *
 * @date: 2019/11/12 10:05
 * @Author: ASUS
 */
public class ArraySort {
    public static void main(String[] args) {
        //生成一个含有10个元素（0-20）的随机数组
        Object[] randomArray = RandomArray.getRandomArray();
        for (Object o : randomArray) {
            System.out.print(o.toString() + "、");
        }
        System.out.println();

//        快速排序
        /*Arrays.sort(randomArray);
        for (Object o : randomArray) {
            System.out.print(o.toString() + "、");
        }*/


        /**
         * 冒泡排序升序
         */

        /*for(int i = 0;i < randomArray.length - 1; i ++){
            for(int j = 0;j < randomArray.length - i - 1;j ++){
                if(Integer.valueOf(randomArray[j].toString()) > Integer.valueOf(randomArray[j + 1].toString())){
                    Object temp = randomArray[j];
                    randomArray[j] = randomArray[j + 1];
                    randomArray[j + 1] = temp;
                }
            }
            System.out.println("第" + (i + 1) +  "轮后，" + Arrays.toString(randomArray));
        }*/


        /**
         * 选择排序
         * 外层循环次数n-1
         * 内层循环从
         */
        for(int i = 0;i < randomArray.length - 1;i ++){
            for(int j = i + 1;j < randomArray.length;j ++){
                if(Integer.valueOf(randomArray[j].toString()) > Integer.valueOf(randomArray[j - 1].toString())){
                    Object temp = randomArray[j - 1];
                    randomArray[j - 1] = randomArray[j];
                    randomArray[j] = temp;
                }
            }
            System.out.println("第" + (i + 1) +  "轮后，" + Arrays.toString(randomArray));
        }
    }
}
