package com.han.zhmh.mapper;

import com.han.zhmh.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
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
