package com.han.zhmh.service;

import com.han.zhmh.pojo.Student;

public interface StudentService {
    // 增
    int addStudent(Student student);
    // 删
    int deleteStudent(int id);
    // 改
    int updateStudent(Student student);
    // 查一个
    Student findStudentById(int id);
    // 登录
    Student login(Student student);
}
