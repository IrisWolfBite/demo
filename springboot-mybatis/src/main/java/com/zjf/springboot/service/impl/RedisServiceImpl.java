package com.zjf.springboot.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zjf.springboot.mapper.StudentMapper;
import com.zjf.springboot.model.Student;
import com.zjf.springboot.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * className:RedisServiceImpl
 * package:com.zjf.springboot.service.impl
 * Description:简单描述
 *
 * @date: 2019/8/30 21:23
 * @Author: ASUS
 */
@Service
public class RedisServiceImpl implements RedisService {

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public void set() {
        //设置key和value的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<String>(String.class));
        Student student1 = new Student((long) 10,"张三",23);
        Student student2 = new Student((long) 11,"李四",24);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        String jsonString = JSONObject.toJSONString(studentList);
        //System.out.println("+++++++++" + jsonString);
        redisTemplate.opsForValue().set("jsonString", jsonString, 15, TimeUnit.MINUTES);
    }

    @Override
    public Object get() {
        //设置key的序列化方式
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //为了避免多线程下出现的缓存穿透问题，这里使用了双重检测+同步代码块解决这个问题
        String jsonString = (String) redisTemplate.opsForValue().get("jsonString");
        if(null == jsonString){
            synchronized (this){
                //再次从redis缓存中取
                jsonString = (String) redisTemplate.opsForValue().get("jsonString");
                //再次判断是否为空
                if(null == jsonString){
                    //去数据库中查询
                    List<Student> studentList = studentMapper.selectAllStudentList();
                    //再将其存进redis中
                    //将studentList转换成json格式的字符串
                    String string = JSONObject.toJSONString(studentList);
                    redisTemplate.opsForValue().set("jsonString", string, 15, TimeUnit.MINUTES);
                }
            }
        }
        return jsonString;
    }
}
