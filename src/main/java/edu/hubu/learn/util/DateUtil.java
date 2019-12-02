package edu.hubu.learn.util;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @moduleName: DateUtil
 * @description: 指定时间格式，实现date与String之间的转换
 *
 * @author: 杨睿
 * @since: 2019-12-02 21:52
 **/
@Component
public class DateUtil {
  /**
   * 同一时间的格式
   */
  private static final String DATA_FORMAT = "yyyy-MM-dd  HH:mm";

  /**
   * 获取当前系统时间
   * @return String
   */
  public String setTime(){
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATA_FORMAT);
    return simpleDateFormat.format(new Date());
  }
}
