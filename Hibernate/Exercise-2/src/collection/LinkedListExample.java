package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Ellie");
        namesLinkedList.add("Paul");
        namesLinkedList.add("John");
        namesLinkedList.add("Ringo");
        System.out.println(namesLinkedList.get(2));
        namesLinkedList.add(1,"Jerry");
        System.out.println(namesLinkedList);

        ArrayList<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Ellie");
        namesArrayList.add("Paul");
        namesArrayList.add("John");
        namesArrayList.add("Ringo");
        System.out.println(namesArrayList.get(2));
        namesArrayList.add(1, "Jerry");
        System.out.println(namesArrayList);
    }
}
