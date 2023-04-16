package oca.chapter7;

public class StackTrace {
    public static void main(String[] args) {
        method1();
    }

    private static void method1(){
        method2();
    }

    private static void method2(){
        String[] students = {"Lee", "Mary"};
        System.out.println(students[5].length());
    }
}
