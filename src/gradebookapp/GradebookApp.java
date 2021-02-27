/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebookapp;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author User
 */
public class GradebookApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //fist object
       
       GradeBook calculus = new GradeBook(); //Constructor: GradeBook()
       calculus.setCourseName("Calculus");
       calculus.displayMessage();
       
       //second object
       GradeBook cProgramming = new GradeBook();
       cProgramming.setCourseName("C Programming");
       cProgramming.displayMessage();
       
       //third object 
       GradeBook bEthics = new GradeBook();
       bEthics.setCourseName("Business Ethics");
       bEthics.displayMessage();
        
    }
    
}
