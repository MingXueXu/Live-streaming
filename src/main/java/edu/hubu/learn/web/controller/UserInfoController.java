package edu.hubu.learn.web.controller;

import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.web.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static edu.hubu.learn.util.PageConstant.CURRENT_PAGE;
import static edu.hubu.learn.util.PageConstant.PAGE_SIZE;

/**
 * @moduleName UserInfoController
 * @description user_info 对应的控制器，创建提供给前台的 API
 * @Author 杨睿
 * @since 2019-10-07 21:39
 **/

@RestController
@RequestMapping(value = "userInfo")
public class UserInfoController {
  @Autowired
  UserInfoService userInfoService;

  @PutMapping(value = "insert")
  public int insert(@RequestBody UserInfo userInfo){
    userInfoService.insert(userInfo);
    return 1;
  }


}
