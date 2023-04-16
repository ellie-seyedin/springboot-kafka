package generic;

import java.io.Serializable;

public class Printer<T extends Animal & Serializable> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }



    public void print(){
        thingToPrint.eat();
    }

    public static void main(String[] args) {
//        Printer<Double> doublePrinter = new Printer<>(23.4);
//        doublePrinter.print();
//        Printer<Integer> integerPrinter = new Printer<>(24);
//            integerPrinter.print();
        Animal animal = new Animal();
        Printer<Animal> printer = new Printer<Animal>(animal);
        printer.print();

    }

//     class PrintAnimal<T extends Animal & Serializable>{
//        T thingsToPrint;
//
//        public PrintAnimal(T thingsToPrint) {
//            this.thingsToPrint = thingsToPrint;
//        }
//
//        public void print(){
//            thingsToPrint.eat();
//            System.out.println(thingsToPrint);
//        }
//
//
//    }

}
