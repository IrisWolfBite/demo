package com.zjf.demo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.zjf.demo.mapper"})
@EnableDubboConfiguration
public class SpringbootMybatisRedisActivitymqDubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisRedisActivitymqDubboApplication.class, args);
    }
}
