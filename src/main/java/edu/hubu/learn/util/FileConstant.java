package edu.hubu.learn.util;

import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

/**
 * @moduleName: FileConstant
 * @description: 文件保存的目录
 *
 * @author: 杨睿
 * @since: 2019-12-02 21:54
 */
@Component
public final class FileConstant {
  /**
   * 文件上传  根目录
   */
  public static String UPLOAD_PATH;

  static {
    try {
      UPLOAD_PATH = ResourceUtils.getURL("classpath:").getPath() + "../../../resources/main/static/";
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  /**
   * 用户头像保存的目录
   */
  public static final String IMG_FILE_NAME = "usersImages/";

  /**
   * 图片相对路径
   */
  public static final String VIRTUAL_IMG_PATH = "img/**";

  /**
   * 保存用户上传的视频的目录
   */
  public static final String VIDEO_PATH = "video/";

  /**
   * 视频的相对路径，用于资源映射
   */
  public static final String VIRTUAL_VIDEO_PATH = "video/**";
}
