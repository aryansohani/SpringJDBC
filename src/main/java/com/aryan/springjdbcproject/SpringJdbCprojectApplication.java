package com.aryan.springjdbcproject;

import com.aryan.springjdbcproject.Model.Student;
import com.aryan.springjdbcproject.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbCprojectApplication {

    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(SpringJdbCprojectApplication.class, args);
       Student s1= context.getBean("student",Student.class);
       s1.setRollNo(11);
       s1.setName("Aryan");
       s1.setMarks(100);
       System.out.println(s1);


        StudentService service= context.getBean("Stuservice",StudentService.class);
        service.add(s1);
        List<Student> Studentlist = service.getall();
        System.out.println(Studentlist);

    }

}
