package com.example.send.controller;

import com.example.send.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * className:WebController
 * package:com.example.send.controller
 * Description:简单描述
 *
 * @date: 2019/11/15 11:13
 * @Author: ASUS
 */
@RestController
public class WebController {
    @Autowired
    private SenderService senderService;

    @RequestMapping("/web/send")
    public void sendMessage(HttpServletRequest request){
        String name = request.getParameter("name");
        senderService.sendMessage(name);
        System.out.println("消息发送成功！");
    }
}
