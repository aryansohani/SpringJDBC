package com.aryan.springjdbcproject;

import com.aryan.springjdbcproject.Model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbCprojectApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringJdbCprojectApplication.class, args);
       Student s1= context.getBean("student",Student.class);
       s1.setRollNo(1);
       s1.setName("Aryan");
       s1.setMarks(100);
       System.out.println(s1);


    }

}
