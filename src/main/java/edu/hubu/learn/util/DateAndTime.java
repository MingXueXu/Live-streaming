package edu.hubu.learn.util;
import java.io.UnsupportedEncodingException;
import java.util.Date;
public class DateAndTime {
    public static void main(String[] args){
        Date date = new Date();
        String time = String.format("%tF",date);
        System.out.println("timeMessage:"+date);
    }
}
