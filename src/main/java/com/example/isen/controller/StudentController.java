package com.example.isen.controller;

import com.example.isen.config.StudentConfig;
import com.example.isen.entry.Student;
import com.example.isen.entry.StudentExample;
import com.example.isen.mapper.StudentMapper;
import com.example.isen.mapper.StudentMapperExt;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Isen
 * @date 2018/10/25 16:32
 * @since 1.0
 */
@Controller
public class StudentController {

    @Resource
    private StudentMapper studentMapper;

    @Resource
    private StudentMapperExt studentMapperExt;

    @RequestMapping("/listStudent")
    public void listStudent(Model model) {
//        List<Student> students = studentMapperExt.findAll();
//        model.addAttribute("students", students);
//        System.out.println("thread name=" + Thread.currentThread().getName() + " studentMapperExt.hashCode=" + studentMapperExt.hashCode());
//        System.out.println(studentMapperExt.getClass() + " " + studentMapper.getClass());
//        Student student = studentMapperExt.selectById(1);
//        Student student2 = studentMapper.selectByPrimaryKey(1);
//        System.out.println(studentMapperExt.hashCode() + " " + studentMapper.hashCode() + " " + studentMapper2.hashCode());
        StudentExample example = new StudentExample();
        List<Student> students = studentMapperExt.selectByExample(example);
        System.out.println(students);
    }

}
