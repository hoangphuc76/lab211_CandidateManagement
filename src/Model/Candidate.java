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
public class Candidate {
    protected static int nextId = 1;
    protected int id;
    protected String firstName, lastName;
    protected LocalDate dob;
    protected String phoneNumber;
    protected String email;
    protected int canType;

    public Candidate(String firstName, String lastName, LocalDate dob, String phoneNumber, String email, int canType) {
        this.id = nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.canType = canType;
    }

    public int getCanType() {
        return canType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
   
    public String toStringSearch() {
        return id + " | " + firstName + " " + lastName + " | " + dob.toString() + " | " 
                + phoneNumber + " | " + email + " | " + canType; 
    }
    
    
    
}
