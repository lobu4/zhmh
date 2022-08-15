package com.han.zhmh.service.impl;

import com.han.zhmh.mapper.StudentMapper;
import com.han.zhmh.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentMapper{
    @Autowired
    private StudentMapper studentMapper;


    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentMapper.findStudentById(id);
    }

    @Override
    public Student login(Student student) {
        return studentMapper.login(student);
    }

}
