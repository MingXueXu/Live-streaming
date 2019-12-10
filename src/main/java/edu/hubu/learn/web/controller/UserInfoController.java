package edu.hubu.learn.web.controller;

import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
