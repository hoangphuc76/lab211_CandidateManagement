/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author LENOVO
 */
public class CandidateManager {

    private List<Candidate> canList = new ArrayList<Candidate>();

    public CandidateManager() {
    }

    public void addCan(Candidate ex) {
        canList.add(ex);
    }

    public List search(String name, int type) {
        Predicate<Candidate> canPre = u -> ((u.getFirstName().contains(name) || u.getLastName().contains(name)) && u.getCanType() == type);
        List<Candidate> searchList = canList.stream().filter(canPre).collect(Collectors.toList());
        return searchList;
    }

    public List<Candidate> getCanList() {
        return canList;
    }
    
    

}
