package oca.chapter5;

public class Decision {
    public static void main(String[] args) {
        int score = 50;
        String result = "";
        String name = "Lion";
        java.io.File file = new java.io.File("F");

        if (score == 100 & name.equals("Ali"))
            System.out.println(result = "A");
        else if (score == 50)
            System.out.println(result = "B");
        else if (score == 10)
            System.out.println(result = "C");
        else
            System.out.println(result = "F");


        if ((score = score + 10) < 100) {
            System.out.println();

        }

        boolean testValue = true;
        if (!testValue) {
            System.out.println("HI");
        } else
            System.out.println("value is false");
    }

    static class missBrace {
        public static void main(String[] args) {
            String name = "Lion";
            int score = 100;
            if (name.equals("Lion")) {
                score = 200;
                name = "Larry";
                System.out.println(score + " " + name);
            } else {
                score = 129;
            }
        }

        static class Ternary {
            public static void main(String[] args) {
                int bill = 2000;
                int result = (bill < 3000) ? bill - 200 : bill + 200;
                System.out.println("result = " + result);
            }
        }

        static class Ter {
            public static void main(String[] args) {
                int bill = 2000;
                int discount = (bill > 2000) ? getSpecDisc() : getRegDisc();
                System.out.println(discount);
            }
           static int getRegDisc() {
                return 11;
            }
         static  int getSpecDisc() {
                return 15;
            }
        }

        static class nestedTernary{
            public static void main(String[] args) {
                int bill = 2000;
                int qty = 10;
                int days = 10;
                int discount = (bill > 1000)?
                        (qty > 11)?
                                10
                                : days > 9 ? 20 : 30
                        : 5;
                System.out.println(discount);
            }
        }

    }

}
