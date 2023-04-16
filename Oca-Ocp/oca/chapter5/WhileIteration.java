package oca.chapter5;

import oca.chapter4.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WhileIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Number : ");
        int number = scanner.nextInt();
        List<Person> people = new ArrayList<>();

        while (number !=0){
            System.out.println("Please Enter the Name : ");
            String next = scanner.next();
            people.add(new Person(next));
            System.out.println(people);
            number = number+2;
            if (number >= 26)
                return;
        }
    }


    static class DOWhile{
        public static void main(String[] args) {
            boolean select = false;
            Scanner scanner = new Scanner(System.in);
            Person person = new Person("Eli");
            do {
                System.out.println("PLS Enter NAME : ");
                person.setName(scanner.next());
                if (person.equals(new Person("Eli")))
                    select = true;
                else
                    select = false;
            }while (select);
        }
    }
}
