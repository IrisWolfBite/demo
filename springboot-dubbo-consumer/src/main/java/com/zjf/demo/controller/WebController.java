package com.zjf.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zjf.model.Student;
import com.zjf.service.StudentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:WebController
 * package:com.zjf.demo.controller
 * Description:简单描述
 *
 * @date: 2019/11/25 11:22
 * @Author: ASUS
 */
@RestController
public class WebController {
    @Reference
    private StudentService studentService;

    @RequestMapping("/add")
    public String addStudent(){
        Student student = new Student(2L,"lisi",24,"新疆");
        int num = studentService.add(student);
        String msg = "";
        if(num > 0){
            msg = "添加信息成功";
        }
        return msg;
    }


    @RequestMapping("/modify")
    public String modifyStudent(){
        Student student = new Student(2L,"lisi",25,"新疆");
        int num = studentService.modify(student);
        String msg = "";
        if(num > 0){
            msg = "修改信息成功";
        }
        return msg;
    }

}


