package com.zjf.springboot.service.impl;

import com.zjf.springboot.mapper.StudentMapper;
import com.zjf.springboot.model.Student;
import com.zjf.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * className:StudentServiceImpl
 * package:com.zjf.springboot.service.impl
 * Description:简单描述
 *
 * @date: 2019/8/30 20:46
 * @Author: ASUS
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public void add() {
        Student s = new Student("wangwu",25);
        studentMapper.insertSelective(s);
    }
}
