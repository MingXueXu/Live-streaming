package edu.hubu.learn.web.controller;

import edu.hubu.learn.entity.Comment;
import edu.hubu.learn.service.CommentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// @RestController
@Controller
@RequestMapping(value = "userInfo")
public class CommentController {
  @Autowired
  CommentService CommentService;

  // @PutMapping(value = "insert")
  // public int insert(@RequestBody UserInfo userInfo){


}
