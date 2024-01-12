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
public class ExperienceCandidate extends Candidate{
    private int yoe;
    private String proSkill;

    public ExperienceCandidate(int yoe, String proSkill, String firstName, String lastName, LocalDate dob, String phoneNumber, String email) {
        super(firstName, lastName, dob, phoneNumber, email, 0);
        this.yoe = yoe;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
         return id + " | " + firstName + " " + lastName + " | " + dob.toString() + " | " 
                 + phoneNumber + " | " + email + " | " + canType + " | " 
                 + yoe + " | " + proSkill; 

    }
    
    
  
}
