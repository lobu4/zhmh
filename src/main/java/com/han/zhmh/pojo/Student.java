package com.han.zhmh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int sid; //学号
    private String password; //密码
    private String name; //姓名
    private String gender; //性别
    private int age; //年龄
    private String major; //专业
    private int grade; //年级
    private String classname; //班级
    private String origin; //生源地
    private String mail; //邮箱

    //add
    public Student(int sid, String name, String gender, int age, String major, int grade, String classname, String origin, String mail) {
        this.sid = sid;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.major = major;
        this.grade = grade;
        this.classname = classname;
        this.origin = origin;
        this.mail = mail;
    }

    //update(学生)
    public Student(int sid, String passowrd, String mail) {
        this.sid = sid;
        this.password = passowrd;
        this.mail = mail;
    }

    //login
    public Student(int sid, String password) {
        this.sid = sid;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "学号=" + sid +
                ", 密码='" + password + '\'' +
                ", 姓名='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 年龄=" + age +
                ", 专业='" + major + '\'' +
                ", 年级=" + grade +
                ", 班级='" + classname + '\'' +
                ", 生源地='" + origin + '\'' +
                ", 邮箱='" + mail + '\'' +
                '}';
    }
}
