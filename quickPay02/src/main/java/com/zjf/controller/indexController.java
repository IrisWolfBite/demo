package com.zjf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * className:indexController
 * package:com.zjf.controller
 * Description:简单描述
 *
 * @date: 2019/9/11 21:35
 * @Author: ASUS
 */
@Controller
public class indexController {
    @RequestMapping("/toPay")
    public String index(){
        return null;
    }
}
