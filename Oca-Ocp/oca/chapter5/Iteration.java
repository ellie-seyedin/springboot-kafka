package oca.chapter5;

import oca.chapter4.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        String line = "ab";
        for (int i = 0; i < line.length(); ++i, printMethod())
            System.out.println(line.charAt(i));
    }

    private static void printMethod() {
        System.out.println("Happy");
    }

    static class optional {
        public static void main(String[] args) {
            int a = 1;
            for (; a < 5; ++a) {
                System.out.println(a);
            }
        }

        static class infinite {
            public static void main(String[] args) {
                infinite1();
                infinite2();
                infinite3();
            }

            static void infinite1() {
                //infinite loop
                for (; ; ) {
                    System.out.println(1);
                }
            }

            static void infinite2() {
                //infinite loop
                for (int c = 10; c > 5; ) {
                    System.out.println(c);
                }
            }

            static void infinite3() {
                //infinite loop
                for (int b = 10; ; ++b) {
                    System.out.println(b);
                }


            }
        }

        static class NestedLoop {
            public static void main(String[] args) {
                //Outer loop iterates values 1 through 6
                for (int hrs = 1; hrs <= 2; hrs++) {
                    //Inner loop iterates values 1 through 59
                    for (int min = 0; min < 60; min++) {
                        //Executes 6 * 60 times (total outer loop iterations * total inner loop iterations)
                        System.out.println(hrs + ":" + min);
                    }
                }
            }

            static class MultiDimensional {
                public static void main(String[] args) {
                    int[][] arr = new int[2][3];
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            arr[i][j] = i + j;
                            System.out.println(arr[i][j]);
                        }
                    }

                }
            }

            static class nested {
                public static void main(String[] args) {
                    int weeks = 1;
                    int days = 2;
                    int hours = 2;
                    int minute = 60;
                    for (int week = 1; week <= weeks; week++) {
                        for (int day = 1; day <= days; day++) {
                            for (int hour = 0; hour <= hours; hour++) {
                                for (int min = 0; min < minute; min++) {
                                    System.out.println("week = " + week + " and day = " + day +
                                            " hour = " + hour + " and min = " + min);
                                }

                            }
                        }
                    }
                }
            }

            static class multiplyTable {
                public static void main(String[] args) {
                    int[][] array = new int[3][10];
                    for (int i = 1; i < array.length; i++) {
                        for (int j = 1; j < array[i].length; j++) {
                            int multiply = i * j;
                            System.out.printf("%d * %d = %d\r\n", i, j, multiply);
                        }
                    }
                }
            }

            static class divideArray {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please Enter array size :");
                    int size = scanner.nextInt();
                    int[] myArray = new int[size];
                    System.out.println("Please Enter array's element :");
                    for (int i = 0; i < myArray.length; i++) {
                        myArray[i] = scanner.nextInt();
                        System.out.println("elements = " + Arrays.toString(myArray));
                    }
                    int[] dividedArray = new int[size];
                    for (int i = 0; i < dividedArray.length; i++) {
                        dividedArray[i] = myArray[i] / 5;
                    }
                    System.out.println(Arrays.toString(dividedArray));


                }

            }

            static class a {
                public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please Enter the size of your array :");
                    int size = scanner.nextInt();
                    int[] array = new int[size];
                    System.out.println("Please enter elements : ");
                    for (int i = 0; i < array.length; i++) {
                        int element = scanner.nextInt();
                        array[i] = element;
                    }
                    System.out.println(" result : ");
                    System.out.println(Arrays.toString(array));
                    for (int i = 0; i < array.length; i++) {
                        array[i] = array[i] / 5;
                    }
                    System.out.println("DIVIDE ARRAY : " + Arrays.toString(array));
                }
            }

            static class NestedArrayList {
                public static void main(String[] args) {
                    List<String> exams = new ArrayList<>();
                    exams.add("Java");
                    exams.add("Oracle");

                    List<String> levels = new ArrayList<>();
                    levels.add("Basic");
                    levels.add("medium");
                    levels.add("Advances");

                    List<String> grades = new ArrayList<>();
                    grades.add("Pass");
                    grades.add("Fail");

                    List<List<String>> lists = new ArrayList<>();
                    lists.add(exams);
                    lists.add(levels);
                    lists.add(grades);

                    for (List<String> outer : lists) {
                        for (String inner : outer) {
                            System.out.println(inner);
                        }
                    }
                }
            }

            static class iterate {
                public static void main(String[] args) {
                    int total = 0;
                    int[] primeNumber = {2, 3, 5, 7};
                    for (int sum : primeNumber) {
                        total += sum;
                    }
                    System.out.println(total);
                }
            }

            static class EnhancedForLoopProblem {
                public static void main(String[] args) {
                    int[] numbers = {1, 2, 3, 4};
                    for (int num : numbers) {
                        num += 1;
                        System.out.println(num);
                    }
                    System.out.println(" __________________ ");
                    for (int num : numbers) {
                        System.out.println(num);
                    }
                }
            }

            static class PassByReference {
                public static void main(String[] args) {
                    Person[] people = new Person[2];
                    people[0] = new Person("Ali");
                    people[1] = new Person("ELLLI");
                    for (Person p : people) {
                        System.out.println(p);
                    }

                    for (Person p : people) {
                        p.setName("SIna");
                        System.out.println(p);
                    }

                    for (Person p : people) {
                        System.out.println(p);
                    }
                }

                static class PassByValue {
                    public static void main(String[] args) {
                        int[] people = {1, 2};
                        for (int p : people) {
                            System.out.println(p);
                        }

                        for (int p : people) {
                            p += p + 1;
                            System.out.println(p);
                        }

                        for (int p : people) {
                            System.out.println(p);
                        }
                    }
                }

                static class InitializedArrayCompatible {
                    public static void main(String[] args) {
                        int[] my = new int[5];
                        for (int i = 0; i < my.length; i++) {
                            my[i] = i;
                            if (my[i] % 2 == 0)
                                my[i] = 20;
                        }
                        System.out.println(Arrays.toString(my));
                    }
                }

                static class InitForLoop {
                    public static void main(String[] args) {
                        int[] my = {1, 2, 3, 4};
                        int columnNum = 0;
                        for (int m : my) {
                            System.out.println(columnNum + "  :  " + m);
                            ++columnNum;
                        }
                        System.out.println(Arrays.toString(my));

                    }
                }

                static class failForEachLoop {
                    public static void main(String[] args) {
                        List<StringBuilder> list = new ArrayList<>();
                        list.add(new StringBuilder("a"));
                        list.add(new StringBuilder("d"));
                        list.add(new StringBuilder("s"));
                        for (StringBuilder s : list) {
                            System.out.println(s);
                        }
                        for (StringBuilder s : list) {
                            s = null;
                            System.out.println(s);
                        }
                        for (StringBuilder s : list) {
                            System.out.println(s);
                        }
                        ArrayList<Person> people = new ArrayList<>();
                        people.add(new Person("EEE"));
                        people.add(new Person("ew"));
                        people.add(new Person("dnjed"));
                        people.add(new Person("djd"));
                        people.add(new Person("ncjnc"));

                        for (int i = 0; i < people.size(); i++) {
                            System.out.println(people);

                            Person remove = people.remove(1);
                            System.out.println(remove);

                        }
                        System.out.println(people);
                        for (Person p : people) {
                            System.out.println(p);
                        }
                        for (Person p : people) {
                            p = null;
                            System.out.println(p);
                        }
                        for (Person p : people) {
                            System.out.println(p);
                        }


                        for (int i = 0; i < people.size(); i++) {
                            people = null;
                            System.out.println(people);
                        }

                        for (int i = 0; i < people.size(); i++) {
                            System.out.println(people);
                        }
                    }
                }

                static class EnhancedFor {
                    public static void main(String[] args) {
                        String[] programmers = {"Outer", "Inner"};
                        for (String p : programmers) {
                            for (String q : programmers) {
                                if (q.equals("Inner"))
                                    break;
                                System.out.println("p = " + p + " , q = " + q);
                            }

                        }
                    }
                }

                static class Continue {
                    public static void main(String[] args) {
                        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
                        for (String name : programmers) {
                            if (name.equals("Shreya"))
                                continue;
                            System.out.println(name);
                        }
                    }
                }

                static class Break {
                    public static void main(String[] args) {
                        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
                        for (String name : programmers) {
                            if (name.equals("Shreya"))
                                break;
                            System.out.println(name);
                        }
                    }
                }

                static class Labeled {
                    public static void main(String[] args) {
                        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
                        outer:
                        for (String name1 : programmers) {
                            for (String name : programmers) {
                                if (name.equals("Shreya"))
                                    continue outer;
                                System.out.println(name);
                            }
                        }
                    }
                }


            }
        }
    }

}