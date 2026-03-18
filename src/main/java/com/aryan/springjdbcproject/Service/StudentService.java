package com.aryan.springjdbcproject.Service;

import com.aryan.springjdbcproject.Model.Student;
import com.aryan.springjdbcproject.Repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("Stuservice")
public class StudentService {

    private Studentrepo repo;

    public void add (Student s)
    {
        repo.save(s);
    }

    @Autowired
    public void setRepo(Studentrepo repo)         {
        this.repo = repo;
    }

    public List<Student> getall()
    {
        return repo.findall();
    }
}
