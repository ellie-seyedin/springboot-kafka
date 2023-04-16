package oca.chapter5;

public class SwitchSample {
    public static void main(String[] args) {
        int marks = 20;
        switch (marks) {
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    static class week {
        public static void main(String[] args) {
            String day = "Sunday";
            switch (day) {
                case "MON":
                case "TUE":
                case "WED":
                case "THU":
                    System.out.println("Time to work.");
                    break;
                case "FRI":
                    System.out.println("Near to weekend");
                    break;
                case "SAT":
                case "SUN":
                    System.out.println("Weekend");
                    break;
                default:
                    System.out.println("NO Match!");
                    break;
            }

          final  int a=10, b=20, c=30;
             final int d = b + c;
            switch (a) {
                case d:
                    System.out.println(b + c);
                    break;
            }

           int score = 50;
            String result;
            switch (score) {
                case 100:
                    result = "A";
                case 50 :
                    System.out.println("result = " + "B");
                case 10 :
                    result = "C";
                default : result = "F";
            }
//            final int a = 50;
//            final int b = 20;
//            final int c = 30;
//            switch (a) {
//                case b+c: System.out.println(b+c);
//                break;
//
//            }
        }
    }
}
