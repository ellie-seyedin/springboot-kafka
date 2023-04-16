package oca.chapter6.interface8;

import java.time.LocalDateTime;

public interface Interviewer {
    int MIN_SALARY= 9999;
    static void bookConferenceRoom(LocalDateTime dateTime, int duration){
        System.out.println("Interview Scheduled on : " + dateTime);
        System.out.println("Book conference room for : " + duration);
    }
    default void submitInterviewStatus() {
        System.out.println(this);
        System.out.println(MIN_SALARY);
        System.out.println(this.print());
        System.out.println("Accept");
    }
    String print();
    public void conductInterview();


}
