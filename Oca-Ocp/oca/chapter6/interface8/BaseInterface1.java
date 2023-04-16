package oca.chapter6.interface8;

public interface BaseInterface1 {
//    String getName();
default void getName() {
    System.out.println("Base 2");
}

    static void status() { System.out.println("Base 1"); }
}
