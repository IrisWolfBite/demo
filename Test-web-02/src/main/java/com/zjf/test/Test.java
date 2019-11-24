package com.zjf.test;

import org.apache.commons.lang3.ArrayUtils;

/**
 * className:Test
 * package:com.zjf
 * Description:Apache-lang3下ArrayUtils的使用
 *
 * @date: 2019/9/15 10:47
 * @Author: ASUS
 */
public class Test {
    public static void main(String[] args) {
        rev();
    }

    public static void rev(){
        int[] arr = {1,2,3,4,5};
        ArrayUtils.reverse(arr);
        int[] res = ArrayUtils.remove(arr, 0);
        System.out.println(res.length);
        System.out.println(res[0]);
    }
}
