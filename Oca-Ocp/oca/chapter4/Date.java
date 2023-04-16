package oca.chapter4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Date {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2022,12,1));
        System.out.println(LocalDate.of(2022, Month.APRIL,1));

        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate date2 = LocalDate.parse("2025-08-09");
        System.out.println(date2);

        //querying
        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getMonthValue());

        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");
        System.out.println(shreyaBday.isAfter(paulBday));
        System.out.println(shreyaBday.isBefore(paulBday));
        System.out.println(shreyaBday.isBefore(shreyaBday));


        LocalDate parse = LocalDate.parse("2022-12-11");
        System.out.println(parse.minusDays(1));
        System.out.println(parse.minusWeeks(2));
        System.out.println(parse.minusMonths(1));
        System.out.println(parse);

        LocalDate p = LocalDate.of(2022,12,11);
        System.out.println(p.minusDays(1));
        System.out.println(p.minusWeeks(2));
        System.out.println(p.minusMonths(1));
        System.out.println(p);

        LocalDate firstSex = LocalDate.of(2036,02,28);
        System.out.println(firstSex.withDayOfMonth(1));
        System.out.println(firstSex.withDayOfYear(1));
        System.out.println(firstSex.withMonth(7));
        System.out.println(firstSex.withYear(1));

        LocalDate interviewDate = LocalDate.of(2022, 12, 15);
        System.out.println(interviewDate.atTime(16,30));
        System.out.println(interviewDate.atTime(16,30,22));
        System.out.println(interviewDate.atTime(16,30,22,3000));
        System.out.println(interviewDate.atTime(LocalTime.of(16,30,30,8)));

        LocalDate launchBook = LocalDate.of(2016,2,8);
        LocalDate aDate = LocalDate.of(1970,1,8);
        System.out.println(launchBook.toEpochDay());
        System.out.println(aDate.toEpochDay());

    }
}
