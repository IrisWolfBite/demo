package com.zjf.springboot.mapper;

import com.zjf.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface StudentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAllStudentList();

}