package oca.chapter6.lambda;

import oca.chapter6.interface8.Validate;
import oca.chapter6.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaPredicate {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shreya", 5, 9999.00));
        employees.add(new Employee("Paul", 4, 1234.00));
        employees.add(new Employee("Harry", 5, 8769.00));
        employees.add(new Employee("Selva", 1, 2769.00));
        Predicate<Employee> employeePredicate = employee -> employee.getPerformanceRating() >= 5;
        filter(employees, employeePredicate);
    }

    static void filter(List<Employee> employees, Predicate<Employee> rule){
        for (Employee emp: employees) {
            if (rule.test(emp))
                System.out.println("emp = " + emp);
        }

    }
}
