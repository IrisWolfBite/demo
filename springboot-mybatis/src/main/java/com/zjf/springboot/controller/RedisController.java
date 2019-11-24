package com.zjf.springboot.controller;

import com.zjf.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:RedisController
 * package:com.zjf.springboot.controller
 * Description:简单描述
 *
 * @date: 2019/8/30 21:20
 * @Author: ASUS
 */
@Controller
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/set")
    public @ResponseBody Object set(){
        redisService.set();
        return "添加redis成功";
    }


    @RequestMapping(value = "/get")
    public @ResponseBody Object get(){
        Object object = redisService.get();
        if(null != object){
            return "获取redis成功" + "---->" + object.toString();
        }else{
            return "获取redis失败";
        }
    }
}
