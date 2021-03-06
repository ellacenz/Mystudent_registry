/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gui_project;

/**
 *
 * @author ellac
 */
public class Student {

    private String firstName;
    private String lastName;
    private String description;
    private String gender;
    private int id;

    public Student(String firstName, String lastName, String description, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.gender = gender;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public boolean isDetailsComplete() {
       
        return !(firstName.isBlank() || lastName.isBlank() || description.isBlank() || gender.isBlank());
    }

}
