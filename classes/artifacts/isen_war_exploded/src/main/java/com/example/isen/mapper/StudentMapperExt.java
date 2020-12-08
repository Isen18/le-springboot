package com.example.isen.mapper;

import com.example.isen.entry.Student;

/**
 * @author Isen
 * @date 2018/10/25 16:32
 * @since 1.0
 */
public interface StudentMapperExt extends StudentMapper {

//    @Select("SELECT * FROM student")
//    List<Student> findAll();

    Student selectById(Integer id);
}