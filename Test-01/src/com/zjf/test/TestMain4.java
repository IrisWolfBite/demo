package com.zjf.test;
import java.util.ListIterator;
import java.util.Vector;

public class TestMain4 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");

        /*Enumeration e = v.elements();
        while (e.hasMoreElements()){
            Object o = e.nextElement();
            System.out.println(o.toString());
        }*/

        /*Iterator<String> it = v.iterator();
        while (it.hasNext()){
            String str = it.next();
            if("b".equals(str)){
                it.remove();
            }
            System.out.println(str);
        }
        System.out.println(v.size());*/

        ListIterator<String> it = v.listIterator();
        while (it.hasNext()){
            String str = it.next();
            if("b".equals(str)){
                it.add("k");
            }
        }
        for(String s : v){
            System.out.println(s.toString());   //a,b,k,c,d
        }
    }
}
