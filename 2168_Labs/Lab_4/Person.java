// CIS2168
// Section: 003
// Assignment 4
//File: Person.java. 
// Author: Jon Tanner Nelson, Email: jon.tanner.nelson@temple.edu

//Assign 4, Person class.
package Lab_4;

import java.util.ArrayList;

public class Person { //new applicants, current employees, past employees
    
    private String name;
    private String degree;
    private ArrayList<String> skills;

    public Person(){ //empty constructor
    }
    //normal constructor
    public Person(String name, String degree, ArrayList<String> skills){
        this.name = name;
        this.degree = degree;
        this.skills = skills;
    }
    public String toString(){
        return "Name: " + name + "Degree: " + degree + "Skills: " + skills.toString();
    }

    public String getDegree() {
        return degree;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getSkills() {
        return skills;
    }
    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }
}

