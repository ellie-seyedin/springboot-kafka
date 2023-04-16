package oca.chapter6.implementation;

import oca.chapter6.model.Employee;
import oca.chapter6.interface8.Interviewer;

import java.time.LocalDateTime;

public class Manager extends Employee implements Interviewer {
    public int teamSize;
    //protected int teamSize;

    public Manager() {
        super();
    }

    public void reportProjectStatus() {}

    static String bookConferenceRoom(LocalDateTime dateTime, int dur) {
        System.out.println("Manager-bookConferenceRoom");
        return null;
    }

    public static void main(String[] args) {
//        Interviewer.bookConferenceRoom(LocalDateTime.now(),2);
        bookConferenceRoom(LocalDateTime.now(),2);
            }

    @Override
    public void  submitInterviewStatus() {
        Interviewer.super.submitInterviewStatus();
    }

    @Override
    public String print() {
        return("I am " + this);
    }

    @Override
    public void conductInterview() {

    }

    static class Foo{
        public static void main(String[] args) {
            Interviewer interviewer = new Manager();
            interviewer.submitInterviewStatus();
        }
    }

}
