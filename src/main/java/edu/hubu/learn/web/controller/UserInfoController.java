package edu.hubu.learn.web.controller;

import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.web.service.UserInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

  @ApiOperation(value = "查询全部数据")
  @GetMapping(value = "selectAll")
  public List<UserInfo> selectAll(){
    return userInfoService.selectAll();
  }
}
