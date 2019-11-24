package com.zjf.controller;

import com.zjf.common.Constant;
import com.zjf.service.NumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * className:TestController
 * package:com.zjf.controller
 * Description:简单描述
 *
 * @date: 2019/9/19 11:24
 * @Author: ASUS
 */
@Controller
public class TestController {
    @Autowired
    private NumService numService;

    @RequestMapping("/{name}")
    public String test(Model model, @PathVariable String name) {
        numService.modify(name);
        model.addAttribute(Constant.MESSAGE,"调用成功");
        return "index.jsp";
    }

}
