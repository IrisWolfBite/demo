package com.zjf.test;

import java.awt.*;
import java.util.*;
import java.util.List;


/**
 * className:Three
 * package:com.zjf.test
 * Description：给定n字符串，请对n个字符串按照字典顺序排序
 *实现思路：将字符串存入到集合中，用Collections这个集合工具类的sort方法进行排序
 *          最后用迭代器进行遍历
 *
 *
 * @date: 2019/10/1 20:27
 * @Author: ASUS
 */
public class Three {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] array = new String[num];
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(scanner.next());
        }
        Collections.sort(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        t();
    }

    //直接给定一个字符数组，对其中的每个元素进行字典顺序的排序
    public static void t(){
        String[] array = new String[]{"zs","ls","ww","gl","cq"};
        Arrays.sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
