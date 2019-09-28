package com.zjf.test;

import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("b1");
        list.add("b2");
        list.add("b3");
        list.add("a");
        list.add("c");
        System.out.println(list.size());    //6
        for(int i = 0;i < list.size();i ++){
            String str = list.get(i);
            if(str.contains("b")){
                list.remove(str);       //b,b2
            }
        }
        System.out.println(list.size());    //4
    }
}
