package com.zjf.springboot.controller;

import com.zjf.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className:StudentController
 * package:com.zjf.springboot.controller
 * Description:简单描述
 *
 * @date: 2019/8/30 20:42
 * @Author: ASUS
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/add")
    public Object addStudent(){
        studentService.add();
        return "添加学生信息成功";

    }
}
