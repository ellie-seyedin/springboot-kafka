package oca.chapter4;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTime {
    public static void main(String[] args) {
        System.out.println(Period.ofDays(3));
        Period period1 = Period.of(1, 2, 7);
        Period period2 = Period.ofYears(2);
        System.out.println("period1 = " + period1);
        System.out.println("period2 = " + period2);
        Period ofWeeks = Period.ofWeeks(1);
        System.out.println("ofWeeks = " + ofWeeks);
        Period ofMonths = Period.ofMonths(2);
        System.out.println("ofMonths = " + ofMonths);
        Period ofDays = Period.ofDays(12);
        System.out.println("ofDays = " + ofDays);

        Period parse = Period.parse("-P12Y-11M2W3D");
        System.out.println("parse = " + parse);

        Period p5Yrs10 = Period.parse("-P5W");
        System.out.println("p5Yrs10 = " + p5Yrs10);

        LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);
        Period between = Period.between(carnivalStart, carnivalEnd);
        System.out.println("between = " + between);
    }

    static class manipulate{
        public static void main(String[] args) {
            LocalDate bday = LocalDate.of(2020, 10, 29);
            LocalDate today = LocalDate.now();
            Period period10Days = Period.of(0, 0, 10);
            if (bday.minus(period10Days).isBefore(today))
                System.out.println("Time to send out reminders to friends");
        }
    }

    static class minus{
        public static void main(String[] args) {
            Period period10Days = Period.of(0, 0, 10);
            Period period1Month = Period.of(0, 1, 0);
            System.out.println(period10Days.minus(period1Month));
            System.out.println(period10Days.minusDays(5));
            System.out.println(period10Days.minusMonths(5));
            System.out.println(period10Days.minusYears(5));
        }
    }
    static class multipliedBy{
        public static void main(String[] args) {
            Period year1Month9Day20 = Period.of(1, 9, 20);
            System.out.println(year1Month9Day20.multipliedBy(2));
            System.out.println(year1Month9Day20.multipliedBy(-2));

            System.out.println(Period.of(10,5,40).toTotalMonths());
        }
    }
}
