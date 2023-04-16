package oca.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[2];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 5;
        }
        System.out.println(Arrays.toString(intArray));
        String[] s = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = ("Hello " + i);
        }
        System.out.println(Arrays.toString(s));

        int[][] multiArr = new int[2][1];
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
                multiArr[i][j] = i + j;
            }
        }
        System.out.println(Arrays.toString(multiArr));

        String multiStrArr[][] = new String[][]{
                {"A", "B"},
                null,
                {"Jan", "Feb", null},
        };
        for (String[] aaa : multiStrArr) {
            System.out.println(Arrays.toString(aaa));
        }
        System.out.println("WHAT??? " + multiStrArr[1]);
    }


    static class deleteElement {
        public static void main(String[] args) {
            ArrayList<StringBuilder> myArrayList = new ArrayList<>();
            myArrayList.add(new StringBuilder("One"));
            myArrayList.add(new StringBuilder("Two"));
            myArrayList.add(new StringBuilder("Three"));
            myArrayList.add(new StringBuilder("Four"));
            myArrayList.add(new StringBuilder("Fivee"));
            System.out.println("myArrayList : \n" + myArrayList.get(4).deleteCharAt(4));
            myArrayList.remove(2);
            for (StringBuilder s : myArrayList) {
                System.out.println(s);
            }
        }
    }

    static class deletePerson {
        public static void main(String[] args) {
            ArrayList<Person> people = new ArrayList<>();

            people.add(new Person("Ellie"));
            people.add(new Person("Sina"));
            people.add(new Person("Ali"));
            people.add(new Person(""));
            for (Person p : people) {
                System.out.println(p.getName());
            }
            boolean sina = people.get(3).equals(new Person(""));
            System.out.println(sina);

        }
    }

    static class addElement {
        public static void main(String[] args) {
            ArrayList<String> myArrayList = new ArrayList<>();
            myArrayList.add("One");
            myArrayList.add("Two");
            myArrayList.add("Three");
            myArrayList.add("Four");

            ArrayList<String> yourArrayList = new ArrayList<>();
            yourArrayList.add("Five");
            yourArrayList.add("Six");
            myArrayList.addAll(myArrayList.size(), yourArrayList);
            System.out.println("myArrayList = " + myArrayList);

            for (String a : myArrayList) {
                System.out.println(a);
            }
            System.out.println("yourArrayList = " + yourArrayList);
        }

        static class addElementExercise {
            public static void main(String[] args) {
                ArrayList<String> myArrList = new ArrayList<String>();
                String one = "One";
                String two = new String("Two");
                myArrList.add(one);
                myArrList.add(two);
                ArrayList<String> yourArrList = myArrList;
                one.replace("O", "B");
                for (String val : myArrList)
                    System.out.print(val + ":");
                for (String val : yourArrList)
                    System.out.print(val + ":");
            }
        }

        static class clear {
            public static void main(String[] args) {
                ArrayList<String> myArrList = new ArrayList<String>();
                myArrList.add("One");
                myArrList.add("Two");
                myArrList.clear();
                for (String val : myArrList)
                    System.out.print(val + ":");
            }
        }

        static class modifyArrayList {
            public static void main(String[] args) {
                ArrayList<StringBuilder> myArrayList = new ArrayList<>();
                myArrayList.add(new StringBuilder("One"));
                myArrayList.add(new StringBuilder("Two"));
                myArrayList.add(new StringBuilder("Three"));
                for (StringBuilder s : myArrayList) {
                    System.out.println(s.reverse());
                }
            }
        }

        static class MiscMethodsArrayList {
            public static void main(String[] args) {
                ArrayList<Person> people = new ArrayList<>();

                people.add(new Person("Ellie"));
                people.add(new Person("Sina"));
                people.add(new Person("Ali"));
                //return true, because create equal() method in Person class.
                System.out.println(people.contains(new Person("Ellie")));
                System.out.println(people.indexOf(new Person("Ellie")));
                System.out.println(people.lastIndexOf(new Person("Ali")));
            }
        }

        static class MiscMethodsArrayList3 {
            public static void main(String args[]) {
                ArrayList<StringBuilder> myArrList = new ArrayList<>();
                StringBuilder sb1 = new StringBuilder("Jan");
                StringBuilder sb2 = new StringBuilder("Feb");
                myArrList.add(sb1);
                myArrList.add(sb2);
                myArrList.add(sb2);
                System.out.println(myArrList.contains(new StringBuilder("Jan")));
                System.out.println(myArrList.contains(sb1));
                System.out.println(myArrList.indexOf(new StringBuilder("Feb")));
                System.out.println(myArrList.indexOf(sb2));
                System.out.println(myArrList.lastIndexOf(
                        new StringBuilder("Feb")));
                System.out.println(myArrList.lastIndexOf(sb2));
            }
        }
    }

    static class Shuffle {
        public static void main(String[] args) {
            int num;
            for (num=0; num++>20 ; num++) {
            }
            System.out.println(num);

//            while (num++>20){
//                num--;
//            }
//            System.out.println(num);


//            int[] array = new int[]{1,2,3,4,5,6};
//            Random random = new Random();
//            for (int j = 0; j <array.length ; j++) {
//                int i = random.nextInt(array.length-4);
//                System.out.println(i);
//            }
//            sortArray(array);
//            for (int a:array) {
//                System.out.println(a);
//
//            }
        }

        static void sortArray(int[] a) {
            Random random = new Random();
             random.nextInt();
            for (int i = 0; i < a.length; i++) {
                int elements = i + random.nextInt((a.length) - i);
                swap(a, i,elements);
            }
        }

        static void swap(int[] a, int i, int change) {
            int helper = a[i];
            a[i] = a[change];
            a[change] = helper;
        }

        static class init{
            public static void main(String[] args) {

            }
        }
    }
}