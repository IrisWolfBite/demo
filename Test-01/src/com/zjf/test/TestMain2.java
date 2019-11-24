package com.zjf.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestMain2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("b1");
        list.add("b2");
        list.add("b3");
        list.add("a");
        list.add("c");
        System.out.println(list.size());    //6
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            if(next.contains("b")){
                iterator.remove();
            }
        }
        System.out.println(list.size());    //2
    }
}
