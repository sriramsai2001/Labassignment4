/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.Icon;

/**
 *
 * @author ram
 */
public class Patient {
    
    private String firstname;
private String lastname;  
private String age; 
 private String email;    
private String message; 
 private String type; 
    private Icon photo; 
    private String gender; 
    private String date;

    
    public String getFirstname() {
        return firstname;
    }

    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    public String getLastname() {
        return lastname;
    }

    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    public String getAge() {
        return age;
    }

   
    public void setAge(String age) {
        this.age = age;
    }

    
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the photo
     */
    public Icon getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(Icon photo) {
        this.photo = photo;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

   

 
    
}
