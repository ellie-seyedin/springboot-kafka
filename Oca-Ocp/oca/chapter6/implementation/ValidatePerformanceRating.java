package oca.chapter6.implementation;

import oca.chapter6.interface8.Validate;
import oca.chapter6.model.Employee;


public class ValidatePerformanceRating implements Validate {
    @Override
    public boolean check(Employee employee) {
        return (employee.getPerformanceRating() >= 3);
    }
}
