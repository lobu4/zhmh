package com.han.zhmh.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int tid;
    private String password;
    private String name;
    private String gender;
    private int age;
    private String college;
    private String mail;
}
