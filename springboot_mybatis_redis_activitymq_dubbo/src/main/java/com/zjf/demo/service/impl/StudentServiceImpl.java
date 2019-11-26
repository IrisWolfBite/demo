package com.zjf.demo.service.impl;

import com.zjf.demo.mapper.StudentMapper;
import com.zjf.model.Student;
import com.zjf.service.StudentService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * className:StudentServiceImpl
 * package:com.zjf.demo.service
 * Description:简单描述
 *
 * @date: 2019/11/25 0:27
 * @Author: ASUS
 */
@Service    //spring的Service注解
@com.alibaba.dubbo.config.annotation.Service(interfaceClass = StudentService.class,timeout = 10000)    //相当于暴露接口
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private RedisTemplate<String,Student> redisTemplate;

    @Override
    public int add(Student student) {
        int num = studentMapper.insertSelective(student);
        return num;
    }

    @Override
    public int modify(Student student) {
        int num = studentMapper.updateByPrimaryKeySelective(student);
        redisTemplate.opsForValue().set("student", student, 60, TimeUnit.SECONDS);
        return num;
    }
}
