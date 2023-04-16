package oca.chapter6;

import oca.chapter6.implementation.HRExecutive;
import oca.chapter6.implementation.Manager;
import oca.chapter6.implementation.ValidatePerformanceRating;
import oca.chapter6.interface8.Interviewer;
import oca.chapter6.interface8.Validate;
import oca.chapter6.model.Car;
import oca.chapter6.model.Employee;
import oca.chapter6.model.NewEmployee;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.turnAlarmOn());
    }

    static class Test {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Shreya", 5, 9999.00));
            employees.add(new Employee("Paul", 4, 1234.00));
            employees.add(new Employee("Harry", 5, 8769.00));
            employees.add(new Employee("Selva", 1, 2769.00));
            Predicate<Employee> predicate = employee -> employee.getPerformanceRating() >= 5;
            filter(employees, predicate);
            employees.removeIf(employee -> employee.getName().startsWith("H"));
            System.out.println("After Deletion: ");
            for (Employee e : employees) {
                System.out.println(e);
            }
        }

        static void filter(List<Employee> employees, Predicate<Employee> rule) {
            for (Employee emp : employees) {
                if (rule.test(emp))
                    System.out.println("emp = " + emp);
            }
        }
    }

    static class Office {
        public static void main(String[] args) {
            HRExecutive hrExecutive = new HRExecutive();
            hrExecutive.specialization = new String[]{"Staffing"};
            hrExecutive.name = "Pav Gupta";
            System.out.println(hrExecutive.name);
            hrExecutive.conductInterview();
        }
    }

    static class Office2 {
        public static void main(String[] args) {
            Interviewer[] interviewer = new Interviewer[2];
            interviewer[0] = new Manager();
            interviewer[1] = new HRExecutive();
            for (Interviewer in : interviewer) {
                in.conductInterview();
            }
        }
    }
}