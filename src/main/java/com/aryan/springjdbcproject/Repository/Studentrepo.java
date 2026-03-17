package com.aryan.springjdbcproject.Repository;

import com.aryan.springjdbcproject.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
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
        String query1="SELECT * FROM student";

        RowMapper<Student>mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                Student s = new Student();
                s.setName(rs.getString("Name"));
                s.setRollNo(rs.getInt("RollNo"));
                s.setMarks(rs.getInt("marks"));

                return s;
            }
        };

        return jdbc.query(query1,mapper);
    }


}
