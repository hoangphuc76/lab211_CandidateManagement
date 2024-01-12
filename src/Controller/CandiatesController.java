/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Candidate;
import Model.CandidateManager;
import View.*;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public class CandiatesController extends Menu {

    private CandidateManager cm = new CandidateManager();
    private CandidateView cv = new CandidateView();
    public CandiatesController() {
        super("CANDIDATE MANAGEMENT SYSTEM", new String[]{
            "Experience", "Fresher", "Internship", "Searching", "Exit"
        });
    }

    @Override
    public void execute(int choice) {
        switch(choice) {
            case 1:
                CreateExCandidate();
                cv.display(cm.getCanList());
                break;
            case 2:
                CreateFresCandidate();
                cv.display(cm.getCanList());
                break;
            case 3:
                CreateInternCandidate();
                cv.display(cm.getCanList());
                break;
            case 4:
                doSearch(cm.search(cv.getName(), cv.canType()));
                break;
            case 5:
                System.out.println("Thank you <3");
        }
    }

    public void CreateExCandidate() {
        cm.addCan(cv.getExCandidate());
    }
    public void CreateFresCandidate() {
        cm.addCan(cv.getFresherCandidate());       
    }
    public void CreateInternCandidate() {
        cm.addCan(cv.getInterCandidate());
    }
    
    public void doSearch(List<Candidate> canList) {
        System.out.println("The candidates found: ");
        for (Candidate can : canList) {
            System.out.println(can.toStringSearch());
        }
    }
}
