package oca.chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(5, 8, 11, 2);
        System.out.println(localTime);
    }

    static class constants {
        public static void main(String[] args) {
            System.out.println(LocalTime.MIN);
            System.out.println(LocalTime.MAX);
            System.out.println(LocalTime.MIDNIGHT);
            System.out.println(LocalTime.NOON);
        }
    }

    static class queryTime {
        public static void main(String[] args) {
            LocalTime time = LocalTime.of(12, 33, 45, 66);
            System.out.println(time.getHour());
            System.out.println(time.getMinute());
            System.out.println(time.getSecond());
            System.out.println(time.getNano());
        }
    }

    static class specifiedTime {
        public static void main(String[] args) {
            LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
            LocalTime paulFinishTime = LocalTime.parse("17:09:12");
            if (shreyaFinishTime.isAfter(paulFinishTime))
                System.out.println("yes");
            else
                System.out.println("No");
        }
    }

    static class manipulateTime {
        public static void main(String[] args) {
            LocalTime movieStartTime = LocalTime.parse("21:00:00");
            int commuteMin = 35;
            LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
            System.out.println("Start by " + shreyaStartTime + " from office");

            int worldRecord = 10;
            LocalTime raceStartTime = LocalTime.of(8, 10, 55);
            LocalTime raceEndTime = LocalTime.of(8, 11, 11);
            if (raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime))
                System.out.println("New world record");
            else
                System.out.println("Try harder");
        }
    }

    static class replace {
        public static void main(String[] args) {
            LocalTime startTime = LocalTime.of(5, 7, 9);
            if (startTime.getMinute() < 30)
                startTime = startTime.withMinute(0);
            System.out.println(startTime);
        }

        static class combine{
            public static void main(String[] args) {
                LocalTime time = LocalTime.of(14, 10, 0);
                LocalDate date = LocalDate.of(2016,02,28);
                LocalDateTime dateTime = time.atDate(date);
                System.out.println(dateTime);
            }
        }
    }
}
