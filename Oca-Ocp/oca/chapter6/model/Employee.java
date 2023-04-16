package oca.chapter6.model;


public class Employee {
    //instance variable
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected float experience;
    String certificate;
    int performanceRating;
    double salary;

    public Employee(String name,
                    String address,
                    String phoneNumber,
                    float experience,
                    String certificate,
                    int performanceRating,
                    double salary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.experience = experience;
        this.certificate = certificate;
        this.performanceRating = performanceRating;
        this.salary = salary;
    }

    public Employee(String name, int performanceRating, double salary) {
        this.name = name;
        this.performanceRating = performanceRating;
        this.salary = salary;
    }
    public Employee() {
        name = "NoName";
        address = "NoAddress";
    }

    public Employee(String name, String address) {
        this();
        if (name != null) this.name = name;
        if (address != null) this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String toString() {
        return name + ":" + performanceRating + ":" + salary;
    }

}
