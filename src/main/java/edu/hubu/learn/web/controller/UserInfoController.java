package edu.hubu.learn.web.controller;

import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// @RestController
@Controller
@RequestMapping(value = "userInfo")
public class UserInfoController {
  @Autowired
  UserInfoService userInfoService;

  // @PutMapping(value = "insert")
  // public int insert(@RequestBody UserInfo userInfo){

    //显示前台界
    @RequestMapping(value= "fileName")
    public ModelAndView getFileName(){
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("FileName");
      return modelAndView;
    }

    @RequestMapping(value = "index")
    public ModelAndView getIndex(){
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("index");
      return modelAndView;
    } 

    @RequestMapping(value = "login")
    public ModelAndView login(UserInfo userInfo){
      String username = userInfo.getUsername();
      String password = userInfo.getPassword();
      int count = userInfoService.login(username, password);
      if(count == 1){
        return new ModelAndView("redirect:/userInfo/index");
      }else{
        return new ModelAndView("redirect:/userInfo/fileName");
      }
    }




  




}
