/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Student extends Person {
    private int studyCredits;
    
    public Student(String name, String address) {
        super(name, address);
        this.studyCredits = 0;
    }
    
    public int credits() {
        return this.studyCredits;
    }
    
    public void study() {
        this.studyCredits++; 
    }
    
    public String toString() {
        return super.toString() + "\n  credits " + this.studyCredits;
    }
    
    
}
