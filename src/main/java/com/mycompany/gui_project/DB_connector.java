/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ellac
 */

public class DB_connector {
    
    public static void main(String[] args) throws SQLException {
        DB_connector dB_connector = new DB_connector();
        dB_connector.openConnection();
        
        Statement stmt=dB_connector.getConnection().createStatement();
           //execute sql query
           ResultSet rs=stmt.executeQuery("select * from students");
           //process the result
           while(rs.next())
           {
               System.out.println(rs.getString("firstname")+" = "+rs.getString(1));
           }          
    }
     //JDBC driver name and database URL
    private String JDBC_DRIVER;  
    private String DB_URL;
    //Database credentials
    private String USER;
    private String PASS;
    private static Connection conn;
    
    
    public DB_connector(){
        JDBC_DRIVER = "com.mysql.jdbc.Driver";
        DB_URL = "jdbc:mysql://localhost/student_register?useUnicode=yes&characterEncoding=UTF-8";
        USER = "root";
        PASS = "";
        conn = null;
    }
    public void openConnection(){
        try{
            //Register JDBC driver
            Class.forName(JDBC_DRIVER);         
            //Open a connection
            System.out.print("Connecting to a selected database... ");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Success!");     
        }catch(Exception e){
            //Handle errors for JDBC
            e.printStackTrace();
        }
    }
    public void closeConnection(){
        try{
            if(conn!=null)
            conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }
        System.out.println("Connection closed");
    }
    public Connection getConnection(){
        return conn;
    }
}

