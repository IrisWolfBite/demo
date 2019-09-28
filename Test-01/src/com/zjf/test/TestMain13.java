package com.zjf.test;

import com.zjf.model.Emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * className:TestMain13
 * package:com.zjf.test
 * Description:简单描述
 *
 * @date: 2019/8/31 11:35
 * @Author: ASUS
 */
public class TestMain13 {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp("allen",23));
        empList.add(new Emp("lisi",24));
        empList.add(new Emp("lisi",25));


        Comparator<Emp> comparator = new Comparator<Emp>() {
            @Override
            public int compare(Emp o1, Emp o2) {
                if(o1.getName().compareTo(o2.getName()) == 0){
                    if(o1.getAge() > o2.getAge()){
                        return 1;
                    }else if(o1.getAge() == o2.getAge()){
                        return 0;
                    }else{
                        return -1;
                    }
                }else if(o1.getName().compareTo(o2.getName()) > 0){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        Collections.sort(empList,comparator);
        System.out.println("排序后" + empList);
    }
}
