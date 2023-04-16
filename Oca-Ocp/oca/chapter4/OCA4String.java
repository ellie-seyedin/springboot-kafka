package oca.chapter4;

public class OCA4String {
    public static void main(String[] args) {
        // Create two String objects by using the operator new
        String str1 = new String("Paul");
        String str2 = new String("Paul");
        System.out.println(str1 == str2);

        //Initialize two String variables by using assignment operator
        String str3 = "Harry";
        String str4 = "Harry";
        System.out.println(str3 == str4);

    }

    static class ContString {
        public static void main(String... args) {
//                String summer = new String("Summer");
//                String summer2 = "Summer";
//                System.out.println("Summer");
//                System.out.println("autumn");
//                System.out.println("autumn" == "summer");
//                System.out.println("autumn" == "Summer");
            String autumn = new String("Summer");
            String letters = "ABCAB";
//                System.out.println(letters.indexOf('B', 0));
//
//                String day = "SunDday";
//                day.replace('D', 'Z').substring(3);
//                System.out.println(day);
//                day = day.replace('D', 'Z').substring(3);
//                System.out.println(day);
//
//                String letters1 = "ABCAB";
//                System.out.println(letters1.substring(0, 2).startsWith("A"));
//
//                int val =10;
//                int num=22;
//                String al ="OCA";
//                 String result = al +"" +val + num  ;
//                System.out.println(result);
//                String re = al + (val + num);
//                System.out.println(re);
//                al +="dajkd";
//                System.out.println(al);
            StringBuilder name = new StringBuilder("123");
            char[] nam = {'j', 'a', 'v', 'a', '8'};

//                System.out.println(nam);
//                name.append(nam,2,2);
//                System.out.println(name);
//                name.append(new Person("eliii"));
//                System.out.println(name);

            name.insert(2, nam, 1, 4);
            System.out.println(name);
            name.delete(0, 3);
            System.out.println(name);
            name.reverse();
            System.out.println(name);
            String substring = name.substring(0, 3);
            System.out.println(substring);

            String esm = "siii";
            String y = esm.replace("ii", "ALI");
            System.out.println(y);

            StringBuilder newOne = new StringBuilder("Eshrat");
            StringBuilder joon = newOne.replace(1, 1, "joon");
            System.out.println(joon);

            StringBuilder sb1 = new StringBuilder("0123456");
            System.out.println(sb1.subSequence(2, 4));
            System.out.println(sb1);
            int x = 10;
            int yy = 2;
            int[] array = new int[x * yy];
            System.out.println(array.length);
            String[] arr = new String[Math.max(x, yy)];
            System.out.println(arr.length);

        }
    }

}