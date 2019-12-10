package edu.hubu.learn.util;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

@Component
public final class FileConstant {

  public static String UPLOAD_PATH;

  static {
    try {
      UPLOAD_PATH = ResourceUtils.getURL("classpath:").getPath() + "../../../resources/main/static/";
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static final String IMG_FILE_NAME = "usersImages/";

  public static final String VIRTUAL_IMG_PATH = "img/**";

  public static final String VIDEO_PATH = "video/";

  public static final String VIRTUAL_VIDEO_PATH = "video/**";
}
