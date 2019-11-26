package com.zjf.service;


import com.zjf.model.Student;

/**
 * className:StudentService
 * package:com.zjf.demo.service
 * Description:简单描述
 *
 * @date: 2019/11/25 0:27
 * @Author: ASUS
 */

public interface StudentService {
    /**
     * 添加
     * @param student
     * @return
     */
    int add(Student student);

    /**
     * 修改（同时将信息保存进redis中）
     * @param student
     * @return
     */
    int modify(Student student);

}
