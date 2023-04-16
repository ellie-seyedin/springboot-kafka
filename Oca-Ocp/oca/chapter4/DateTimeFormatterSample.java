package oca.chapter4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatterSample {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String format = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println(format);

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String medium = LocalDateTime.now().format(formatter);
        System.out.println("medium = " + medium);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        String lon = LocalDateTime.now().format(formatter1);
        System.out.println("lon = " + lon);

    }

    static class pattern{
        public static void main(String[] args) {
            LocalDate date = LocalDate.of(2024, 12, 15);
            LocalTime time = LocalTime.of(15, 14, 32);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("y M d");
            DateTimeFormatter format = DateTimeFormatter.ofPattern("e");
            System.out.println(format);
            System.out.println(formatter.format(date));

            DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s a");
            DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");
            System.out.println(time.format(t1));
            System.out.println(time.format(t2));
        }
    }
}
