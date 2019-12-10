package edu.hubu.learn.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateUtil {

  private static final String DATA_FORMAT = "yyyy-MM-dd  HH:mm";

  public String setTime(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATA_FORMAT);
    return simpleDateFormat.format(new Date());
  }
}
