package oca.chapter4;

import java.util.Objects;

public class Person {
    private String name;
    public Person(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    static class Test {
        public static void swap(Person p1, Person p2) {
            Person temp = p1;
            p1 = p2;
            p2 = temp;
            System.out.println("P1= " + p1 + " P2 = " +  p2);
        }
        public static void main(String args[]) {
            Person person1 = new Person("John1");
            Person person2 = new Person("Paul2");
//            System.out.println(person1.getName()
//                    + ":" + person2.getName());
//            swap(person1, person2);
//            System.out.println(person1.getName()
//                    + ":" + person2.getName());
        }
    }
}