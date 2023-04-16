package oca.chapter6.usingThisAndSuper;

class Employee {
    String name;
    String address;

    public Employee(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

class Programmer extends Employee {
    String progLanguage;
    String name;

    public Programmer(String name, String address, String progLanguage) {
        super(name, address);
        this.progLanguage = progLanguage;
    }

    void setNames() {
        this.name = "Programmer";
        super.name = "Employee";
    }

    void printNames() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}

    class UsingThisAndSuper {
       public static void main(String[] args) {
        Programmer programmer = new Programmer("Elie","UK", "Java");
        programmer.setNames();
        programmer.printNames();
    }
}
