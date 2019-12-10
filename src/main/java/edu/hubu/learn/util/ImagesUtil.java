package edu.hubu.learn.util;

import edu.hubu.learn.dao.UserInfoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Component
public class ImagesUtil {
  @Autowired
  UserInfoDao userInfoDao;

  private static final Logger logger = LoggerFactory.getLogger(ImagesUtil.class);

  private static final String IMAGES_PATH = FileConstant.UPLOAD_PATH + FileConstant.IMG_FILE_NAME;

  public String saveImage(MultipartFile file, String username) {
    //重写上传的图片的图片名，文件名改为用户名
    String saveName = username + "." + getFileSuffix(file.getOriginalFilename());
    try {
      File targetFile = new File(IMAGES_PATH);
      //如果该文件夹不存在，则新建
      if (!targetFile.exists()) {
        targetFile.mkdirs();
      } else {
        String userImgSuffix = getFileSuffix(userInfoDao.getUserImgUrl(username));
        if (userImgSuffix==null){
          userImgSuffix="*";
        }
        File file1 = new File(IMAGES_PATH + "/" + username + "." + userImgSuffix);
        if (file1.exists() || file1.isFile()) {
          file1.delete();
        }
      }
      //保存图片
      file.transferTo(new File(IMAGES_PATH + "/" + saveName));
    } catch (IOException e) {
      e.printStackTrace();
      logger.debug("--- 图片保存异常：{} ---" + e.getMessage());
      return null;
    }
    String filePath = FileConstant.VIRTUAL_IMG_PATH + "/" + saveName;
    return filePath;
  }

  public String getImagesPath(HttpServletRequest request, String path){
    String serverBasePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
    return serverBasePath+"/"+path;
  }

  private static String getFileSuffix(String path) {
    String index=".";
    String suffix = "jpg";
    if (path != null && path.indexOf(index) > 0) {
      suffix = path.substring(path.lastIndexOf(".") + 1);
    }
    return suffix;
  }

}
