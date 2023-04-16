package oca.chapter6.polymorphism;

public class PolymorphismWithClasses {
    public static void main(String[] args) {
        Employee developer = new Programmer();
        Employee manager = new Manager();
        developer.reachOffice();
        manager.reachOffice();
        developer.startProjectWork();
        manager.startProjectWork();
    }
}