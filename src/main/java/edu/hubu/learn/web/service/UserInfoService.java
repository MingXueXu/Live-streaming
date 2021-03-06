package edu.hubu.learn.web.service;

import edu.hubu.learn.dao.UserInfoDao;
import edu.hubu.learn.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @moduleName UserInfoService
 * @description user_info对应的Service层，一般 dao 层中的方法都在这一层重新实现，如下所示。
 * @Author 杨睿
 * @since 2019-10-07 21:32
 **/
@Service
public class UserInfoService {
  @Autowired
  UserInfoDao userInfoDao;

  /**
   * 调用 dao 层的方法
   * @return
   */
  public List<UserInfo> selectAll(){
    return userInfoDao.selectAll();
  }
}
