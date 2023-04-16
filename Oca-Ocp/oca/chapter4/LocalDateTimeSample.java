package oca.chapter4;

import java.time.LocalDateTime;

public class LocalDateTimeSample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime ceremonyPrize = LocalDateTime.of(2022, 12, 25, 14, 30, 0, 0);
        LocalDateTime chefPrize = LocalDateTime.of(2022, 12, 26, 10, 10, 0, 0);
        if (ceremonyPrize.plusDays(2).isAfter(chefPrize)) {
            System.out.println("President will be invited!");
        } else {
            System.out.println("President won't be invited!");
        }
        if (ceremonyPrize.getMonthValue() == 6) {
            System.out.println("Prime Minister will be invited!");
        } else {
            System.out.println("Prime Minister will not be invited!");
        }
    }
}
