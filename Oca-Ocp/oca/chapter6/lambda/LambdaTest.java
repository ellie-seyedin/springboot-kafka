package oca.chapter6.lambda;

import oca.chapter6.implementation.ValidatePerformanceRating;
import oca.chapter6.interface8.Validate;
import oca.chapter6.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Shreya", 5, 9999.00));
        employees.add(new Employee("Paul", 4, 1234.00));
        employees.add(new Employee("Harry", 5, 8769.00));
        employees.add(new Employee("Selva", 1, 2769.00));
        Validate validatePerformance =  employee -> employee.getPerformanceRating() >= 5;
        filter(employees, validatePerformance);
    }

   static void filter(List<Employee> employees, Validate rule){
        for (Employee emp: employees) {
            if (rule.check(emp))
                System.out.println("emp = " + emp);
        }
    }
}
