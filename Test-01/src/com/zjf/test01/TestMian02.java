package com.zjf.test01;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * className:TestMian02
 * package:com.zjf.test01
 * Description:数组的逆序实现（不使用api）
 *              还可以通过Apache的common-lang3的ArrayUtils工具包实现（ArrayUtils.reverse()）
 *
 * @date: 2019/9/19 9:37
 * @Author: ASUS
 */
public class TestMian02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        rev(arr);

    }

    private static void rev(int[] arr) {
        int len = arr.length;
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }

    }
}
