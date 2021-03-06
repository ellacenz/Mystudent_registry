/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ellac
 */
public class StudentDBManager {
    private Connection conn;
    private DB_connector dbconnector;

    public StudentDBManager() {
        dbconnector = new DB_connector();
        
    }
    public void saveStudent(Student student) throws SQLException{
        dbconnector.openConnection();
        conn = dbconnector.getConnection();
        
        String query = "";
        
        if(student.getId()>0){
        query = "UPDATE students set firstname = ?, lastname = ?, "
                + "description = ?, gender= ? WHERE id = ?";
        }
        else{
        query = "INSERT INTO students (firstname, lastname, description, gender)"
        + " values (?, ?, ?, ?)";
        }
        
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, student.getFirstName());
        preparedStmt.setString(2, student.getLastName());
        preparedStmt.setString(3, student.getDescription());
        preparedStmt.setString(4, student.getGender());
        
        if(student.getId()>0){
        preparedStmt.setInt(5, student.getId());
        }

        // execute the preparedstatement
        preparedStmt.execute();

        conn.close();
    }
    
     public List<Student> getStudents() throws SQLException{
        dbconnector.openConnection();
        conn = dbconnector.getConnection();
        
        String query = "SELECT id, firstname, lastname, description, gender FROM students";
        
        
        PreparedStatement preparedStmt = conn.prepareStatement(query);
            ResultSet resultSet = preparedStmt.executeQuery();
            List<Student> studentList = new ArrayList<>();
            
            while(resultSet.next()){
            Student student = new Student();
            student.setId(resultSet.getInt("id"));
            student.setFirstName(resultSet.getString("firstname"));
            student.setLastName(resultSet.getString("lastname"));
            student.setDescription(resultSet.getString("description"));
            student.setGender(resultSet.getString("gender"));
            studentList.add(student);
            }

        conn.close();
        
        return studentList;
    }
}
