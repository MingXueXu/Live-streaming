package edu.hubu.learn.util;

import java.util.Date;

public class DateAndTime {

    public DateAndTime(Date date){
// 是对
        System.out.println("test time: 测试时间"+date);
    }
    public static void main(String[] args){
//
        Date date = new Date();
        String time = String.format("%tF",date);
        new DateAndTime(date);
    }

    public void ShowTime(Date date){
        System.out.println("test time:"+date);
    }
    public String ReturnTime(String time){

        return time;
    }
}
