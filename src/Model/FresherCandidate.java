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
public class FresherCandidate extends Candidate{
    
    private int graTime;
    private String rankOfGra, university;

    public FresherCandidate(int graTime, String rankOfGra, String university, String firstName, String lastName, LocalDate dob, String phoneNumber, String email) {
        super(firstName, lastName, dob, phoneNumber, email, 1);
        this.graTime = graTime;
        this.rankOfGra = rankOfGra;
        this.university = university;
    }

    @Override
    public String toString() {
         return id + " | " + firstName + " " + lastName + " | " + dob.toString() + " | " 
                 + phoneNumber + " | " + email + " | " + canType + " | " 
                 + " | " + graTime + " | "  + " | " + rankOfGra + " | " + university; 

    }
    

    
 
    
}
