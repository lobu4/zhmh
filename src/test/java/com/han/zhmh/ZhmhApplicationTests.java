package com.han.zhmh;

import com.han.zhmh.pojo.Student;
import com.han.zhmh.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZhmhApplicationTests {

    @Autowired
    private StudentServiceImpl studentService;

    @Test
    void findStudentById(){
        Student student = studentService.findStudentById(1);
        System.out.println(student);
    }

    @Test
    void addStudent(){
        int id = 190511066;
        Student student = new Student(id,"hao","女",21,"计算机科学与技术",3,"计科1902","四川","123");
        System.out.println(student);
        Student student1 = studentService.findStudentById(id);
        if(student1 != null){
            System.out.println("该学号已存在，创建失败增加失败");
        }else {
            studentService.addStudent(student);
        }
    }

    @Test
    void delete(){
        studentService.deleteStudent(2);
    }

    @Test
    void update(){
        int id = 1;
        Student student = new Student(id,"123456","123");
        studentService.updateStudent(student);
    }

    @Test
    void login(){
        Student student = new Student(1,"123456");
        System.out.println(studentService.login(student));
    }

}
