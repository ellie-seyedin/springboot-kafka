package oca.chapter6.implementation;

import oca.chapter6.interface8.Interviewer;
import oca.chapter6.model.NewEmployee;

public class HRExecutive extends NewEmployee implements Interviewer {
    public String[] specialization;

    @Override
    public String print() {
        return null;
    }

    @Override
    public void conductInterview() {
        System.out.println("HRExecutive - conducting interview");
    }
}
