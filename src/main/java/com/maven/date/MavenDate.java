package com.maven.date;

import org.joda.time.DateTime;
import org.joda.time.Seconds;

import java.util.Date;
public class MavenDate {

    public static void main(String Args[])
    {
        Date d1 = new Date();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date d2 = new Date();
        int seconds = Seconds.secondsBetween(new DateTime(d1), new DateTime(d2)).getSeconds();

        System.out.println("Seconds difference is :"+seconds);
    }
}
