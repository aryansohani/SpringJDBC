package com.aryan.springjdbcproject.Repository;

import com.aryan.springjdbcproject.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepo {

    public void save(Student s)
    {
        System.out.println(s+"is saved");
    }
    public List<Student> findall()
    {
        List<Student> stu= new ArrayList<>();
        return stu;
    }


}
