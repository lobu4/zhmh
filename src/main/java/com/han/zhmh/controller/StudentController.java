package com.han.zhmh.controller;

import com.han.zhmh.pojo.Student;
import com.han.zhmh.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @GetMapping("/findStudentById")
    public Student findStudentById(int id){
        return studentService.findStudentById(id);
    }
}
