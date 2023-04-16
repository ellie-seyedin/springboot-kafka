package oca.chapter6.casting;

import oca.chapter6.implementation.HRExecutive;
import oca.chapter6.implementation.Manager;
import oca.chapter6.interface8.Interviewer;

public class OfficeWhyCasting {
    public static void main(String[] args) {
        Interviewer interviewer = new HRExecutive();
        ((HRExecutive) interviewer).specialization = new String[] {"staffing"};

        Interviewer[] interviewers = new Interviewer[2];
        interviewers[0] = new Manager();
        interviewers[1] = new HRExecutive();
        for (Interviewer inter: interviewers) {
            if(inter instanceof Manager) {
                int teamSize = ((Manager) inter).teamSize;
                if (teamSize>10) {
                    inter.conductInterview();
                }else {
                    System.out.println("Mgr can't interview with team size less than 10");
                }
            } else if (inter instanceof HRExecutive) {
                inter.conductInterview();

            }
        }
    }
}
