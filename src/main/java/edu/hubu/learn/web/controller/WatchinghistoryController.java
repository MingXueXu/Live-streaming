package edu.hubu.learn.web.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.Watchinghistory;
import edu.hubu.learn.service.WatchinghistoryService;


// @RestController
@Controller
@RequestMapping(value = "Watchinghistory")
public class WatchinghistoryController {
  @Autowired
  WatchinghistoryService WatchinghistoryService;

  // @PutMapping(value = "insert")
  // public int insert(@RequestBody UserInfo userInfo){

    //显示前台界
    @RequestMapping(value= "fileName")
    public ModelAndView getFileName(){
      ModelAndView modelAndView = new ModelAndView();
      modelAndView.setViewName("FileName");
      return modelAndView;
    }

    @RequestMapping(value = "Watchinghistory")
    public Watchinghistory Watchinghistory(Watchinghistory watchinghistory){
      return watchinghistory;
    }

    @RequestMapping("/list")
    public ModelAndView Watchinghistorys() {
        ModelAndView mav = new ModelAndView();
        List<Watchinghistory> Watchinghistorys = WatchinghistoryService.getWatching_historys();
        mav.addObject("Watchinghistorys", Watchinghistorys);
        mav.setViewName("Watchinghistorys");
        return mav;
    }



  




}
