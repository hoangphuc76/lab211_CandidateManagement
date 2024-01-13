/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Common.Validations;
import Model.Candidate;
import Model.ExperienceCandidate;
import Model.FresherCandidate;
import Model.InterCandidate;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CandidateView {

    private Validations vd = new Validations();

    public ExperienceCandidate getExCandidate() {
        String firstName = vd.getName("first name"),
                lastName = vd.getName("last name");
        LocalDate dob = vd.getDateFromInput("date of birth");
        String phone = vd.inputPatter("phone number", "[0-9]{10,}"),
                email = vd.inputPatter("email", "[a-zA-Z0-9]{1,}@[a-zA-Z]{1,}.[a-zA-Z]{1,}");

        int yoe = vd.getIntFromInput("year of experience", 0, 11);
        String proSkill = vd.getString("pro skill");
        ExperienceCandidate ex = new ExperienceCandidate(yoe, proSkill, firstName, lastName, dob, phone, email);
        return ex;
    }

    public FresherCandidate getFresherCandidate() {
        String firstName = vd.getName("first name"),
                lastName = vd.getName("last name");
        LocalDate dob = vd.getDateFromInput("date of birth");
        String phone = vd.inputPatter("phone number", "[0-9]{10,}"),
                email = vd.inputPatter("email", "[a-zA-Z0-9]{1,}@[a-zA-Z]{1,}.[a-zA-Z]{1,}");
        int graTime = vd.getIntFromInput("year of graduation", 1950, 2024);
        String rog = chooseTypeGrad();
        String university = vd.getString("university name");
        FresherCandidate fc = new FresherCandidate(graTime, rog, university, firstName, lastName, dob, phone, email);
        return fc;
    }

    public InterCandidate getInterCandidate() {
        String firstName = vd.getName("first name"),
                lastName = vd.getName("last name");
        LocalDate dob = vd.getDateFromInput("date of birth");
        String phone = vd.inputPatter("phone number", "[0-9]{10,}"),
                email = vd.inputPatter("email", "[a-zA-Z0-9]{1,}@[a-zA-Z]{1,}.[a-zA-Z]{1,}"),
                majors = vd.getString("major"),
                semester = vd.getString("semester"),
                university = vd.getString("university name");
        InterCandidate ic = new InterCandidate(majors, semester, university, firstName, lastName, dob, phone, email);
        return ic;
    }

    public String chooseTypeGrad() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Rank of graduate");
        System.out.println("-----------------------");
        System.out.println("1 - Excellence");
        System.out.println("2 - Good");
        System.out.println("3 - Fair");
        System.out.println("4 - Poor");
        System.out.print("Select: ");
        String res = "";
        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    res = "Excellence";
                    break;
                case 2:
                    res = "Good";
                    break;
                case 3:
                    res = "Fair";
                    break;
                case 4:
                    res = "Poor";
            }
        } while (choice < 1 && choice > 4);
        return res;
    }

    public String getName() {
        return vd.getString("Candidate name");
    }

    public int canType() {
        return vd.getIntFromInput("type of candidate", -1, 3);
    }

    public void display(List<Candidate> canList) {
        System.out.println("List of candidate: ");
        System.out.println("==========EXPERIENCE CANDIDATE==============");
        for (Candidate can : canList) {
            if (can instanceof ExperienceCandidate) {
                System.out.println(can.toString());
            }
        }
        System.out.println("==========FRESHER CANDIDATE==============");
        for (Candidate can : canList) {
            if (can instanceof FresherCandidate) {
                System.out.println(can.toString());
            }
        }
        System.out.println("===========INTERN CANDIDATE==============");
        for (Candidate can : canList) {
            if (can instanceof InterCandidate) {
                System.out.println(can.toString());
            }
        }
    }
}
