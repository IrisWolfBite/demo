package com.zjf.Utils;

import java.util.*;

/**
 * className:RandomArray
 * package:com.zjf.Utils
 * Description:随机生成10个不重复的0-20的随机数
 *
 * @date: 2019/11/12 10:06
 * @Author: ASUS
 */
public class RandomArray {
    private RandomArray() {
    }

    public static Object[] getRandomArray() {
        int num = new Random().nextInt(10);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;;i ++){
            map.put(new Random().nextInt(10),i);
            if(map.size() == 10){
                break;
            }
        }
        /*Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Integer m = (Integer) iterator.next();
            System.out.println(m);
        }*/

        /*for(Integer k:map.keySet()){
            System.out.println(k);
        }*/

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
//            System.out.println("第" + next.getValue() + "次随机: " + next.getKey());
        }
//        System.out.println("共有"+ map.size() + "个随机数");


        Object[] objects = map.keySet().toArray();
        return objects;
    }
}
