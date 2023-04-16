package oca.chapter6.interface8;

public interface BaseInterface2 {
//    String getName();
    default void getName() {
        System.out.println("Base 1");
    }
    static void status() { System.out.println("Base 1"); }
}
