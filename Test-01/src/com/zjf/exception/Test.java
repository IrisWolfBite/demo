package com.zjf.exception;

import jdk.nashorn.internal.objects.Global;

import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * className:Test
 * package:com.zjf.exception
 * Description:简单描述
 *
 * @date: 2019/11/17 22:33
 * @Author: ASUS
 */
public class Test {
    private static Logger logger = LogManager.getLogManager().getLogger("Test");
    public static void main(String[] args) {

        Person p = new Person("zs",23,"男");

        try {
            p.setName("lisi");
            int num = 10/0;
        }catch (RuntimeException e){
            e.printStackTrace();
            String message = e.getMessage();
            logger.info("修改名称失败！");
        }


    }
}
