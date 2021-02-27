/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebookapp;

public class GradeBook {
    //member variable
    private String courseName;
    
    //Constructor 
    
    public GradeBook(){
        System.out.println("This is a constructor");
    } //default consturctor 
    //same name, but difeerent signatures 
    public GradeBook(String name){
    
    }
    
    //setters and getters
    //methods
    //setter
    public void setCourseName(String name){
        this.courseName = name;
    }
    
    //getter
    public String getCourseName(){
        return this.courseName;
    }
    
    public void displayMessage(){
        //we have pushed this to Github
        System.out.println("Welcome to " + this.courseName);
    }
}
