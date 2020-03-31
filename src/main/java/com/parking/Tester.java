package com.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        Instant instant=Instant.now();
        System.out.println(instant); //時區
        LocalDateTime now=LocalDateTime.now();
        System.out.println(now);    //當地時區
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));  //時區變電腦版
        System.out.println(now.plus(Duration.ofHours(3)));//加小時
        LocalDateTime other= LocalDateTime.of(2018,11,23,8,8);
        System.out.println(other); //輸入時間

        //JAVA();

    }

    private static void JAVA() {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(date));
        String s="2020/3/31 06:00:00";
        Date other =null;
        try {
            other = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH,9);
        System.out.println(calendar.getTime());
        calendar.set(Calendar.DAY_OF_YEAR,4);
        System.out.println(calendar.getTime());
    }
}
