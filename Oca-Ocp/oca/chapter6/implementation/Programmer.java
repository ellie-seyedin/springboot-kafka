package oca.chapter6.implementation;

import oca.chapter6.model.Employee;

public class Programmer extends Employee {
    private String[] programmingLanguages;
    protected String phoneNumber;

    public void accessBaseClassMembers() {
        name = "Programmer";
        address = "Coventry";
    }
    void accessEmployeeVariables() {
        this.name = "Programmer";
    }

    public String getName() {
        return name;
    }

    public Programmer(String val) {
        name = val;
    }


}
