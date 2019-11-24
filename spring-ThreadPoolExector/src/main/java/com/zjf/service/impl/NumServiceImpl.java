package com.zjf.service.impl;

import com.zjf.mapper.NumMapper;
import com.zjf.model.Num;
import com.zjf.service.NumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * className:NumServiceImpl
 * package:com.zjf.service.impl
 * Description:简单描述
 *
 * @date: 2019/9/19 12:00
 * @Author: ASUS
 */
@Service
public class NumServiceImpl implements NumService {
    @Resource
    private NumMapper numMapper;

    private int num;

    @Override
    public void modify(final String name) {
        String config = "ApplicationContext.xml";
        ApplicationContext act = new ClassPathXmlApplicationContext(config);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) act.getBean("threadPoolExecutor");

        for (int i = 0; i <= 50000; i++) {
            threadPoolExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    int flag = numMapper.update(name);
                    if(flag == 0){
                        System.out.println("数据更新失败！");
                    }
                    num ++;
                    System.out.println("success！！！！" + num);
                }
            });
        }

    }
}
