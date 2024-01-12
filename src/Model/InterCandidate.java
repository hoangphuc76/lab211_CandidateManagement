/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class InterCandidate extends Candidate{
    private String major, semester, university;

    public InterCandidate(String major, String semester, String university, String firstName, String lastName, LocalDate dob, String phoneNumber, String email) {
        super(firstName, lastName, dob, phoneNumber, email, 3);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    @Override
    public String toString() {
        return id + " | " + firstName + " " + lastName + " | " + dob.toString() 
                + " | " + phoneNumber + " | " + email + " | " + canType + " | " 
                + major + " | " + semester + " | " + university; 

    }
    
    
   
    
}
