package com.zjf.test;

import com.zjf.model.Address;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * className:TT
 * package:com.zjf
 * Description:简单描述
 *
 * @date: 2019/9/29 0:30
 * @Author: ASUS
 */
public class TT extends HttpServlet {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("云南");
        new TT().change(address);
        System.out.println(address.getAddName());
    }

    public void change(Address address) throws CloneNotSupportedException {
        Address add = (Address) address.clone();
        add.setAddName("Guangxi");
        System.out.println(add.getAddName());
    }
}
