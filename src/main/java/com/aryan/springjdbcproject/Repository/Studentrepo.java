package com.aryan.springjdbcproject.Repository;

import com.aryan.springjdbcproject.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Studentrepo {


    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s)
    {
        String query="INSERT INTO student(RollNo,Name,marks) VALUES (?,?,?)";
        int row = jdbc.update(query,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(row + "affected");
    }
    public List<Student> findall()
    {
        List<Student> stu= new ArrayList<>();
        return stu;
    }


}
