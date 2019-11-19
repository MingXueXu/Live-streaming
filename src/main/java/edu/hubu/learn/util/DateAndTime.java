package edu.hubu.learn.util;

import java.util.Date;

public class DateAndTime {

    public DateAndTime(final Date date) {
        System.out.println("test time: 测试时间" + date);
    }

    public static void main(final String[] args) {
        final Date date = new Date();
        new DateAndTime(date);
    }

    public void Showdate(final Date date) {
        System.out.println("test date:" + date);
    }

    public String Returndate(final String date) {

        return date;
    }

}
