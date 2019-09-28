package com.zjf.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestMain3 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();

        a.add("java1");

        a.add("java2");

        a.add("java3");

        //Iterator it = a.iterator();
        Iterator it = a.listIterator();
        while(it.hasNext()){



            Object obj = it.next();

            if(obj.equals("java2")) {

                //a.add("java8");
                ((ListIterator) it).set("java8");
            }
        }
        System.out.println(a.size());
        for(Object o :a){
            System.out.println(o.toString());
        }
    }
}
