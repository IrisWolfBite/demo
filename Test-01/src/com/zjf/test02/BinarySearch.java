package com.zjf.test02;

import com.zjf.Utils.RandomArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * className:BinarySearch
 * package:com.zjf.test02
 * Description:简单描述
 *
 * @date: 2019/11/12 20:09
 * @Author: ASUS
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要查找的数字：");
        int searchNumber = scanner.nextInt();
        Object[] array = RandomArray.getRandomArray();
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(search(array,searchNumber));
    }


    public static int search(Object[] array,int searchNumber){
        int start = 0;
        int end = array.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if(searchNumber == (Integer) array[mid]){
                return mid;
            }else if((Integer)array[mid] > searchNumber){
                end = mid - 1;
            }else if((Integer)array[mid] < searchNumber){
                start = mid + 1;
            }else{
                return -1;
            }
        }
        return -1;
    }
}
