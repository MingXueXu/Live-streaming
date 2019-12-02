package edu.hubu.learn.web.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import edu.hubu.learn.entity.User;
import edu.hubu.learn.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public ModelAndView user(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        User user = userService.getUser(id);
        mav.addObject("user", user);
        mav.setViewName("user");
        return mav;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id) {
        userService.deleteUser(id);
        ModelAndView mav = new ModelAndView("redirect:/user/list");
        return mav;
    }

    @RequestMapping("/list")
    public ModelAndView users() {
        ModelAndView mav = new ModelAndView();
        List<User> users = userService.getUsers();
        mav.addObject("users", users);
        mav.setViewName("users");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView addUser() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user_add");
        return mav;
    }

    @RequestMapping("/do_add")
    public ModelAndView doAddUser(User user) {
        userService.addUser(user);
        ModelAndView mav = new ModelAndView("redirect:/user/list");
        return mav;
    }

    @RequestMapping("/modify/{id}")
    public ModelAndView modifyUser(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("user", userService.getUser(id));
        mav.setViewName("user_modify");
        return mav;
    }

    @RequestMapping("/do_modify")
    public ModelAndView doModifyUser(User user) {
        userService.modifyUser(user);
        ModelAndView mav = new ModelAndView("redirect:/user/list");
        return mav;
    }

    @RequestMapping("/search")
    public ModelAndView searchUser() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("user_search");
        return mav;
    }

    @RequestMapping("/do_search")
    public ModelAndView doSearchUser(HttpServletRequest httpRequest) {
        ModelAndView mav = new ModelAndView();
        String keyword = httpRequest.getParameter("keyword");
        List<User> users = userService.searchUsers(keyword);
        mav.addObject("users", users);
        mav.setViewName("users");
        return mav;
    }

    @RequestMapping("/add_avatar/{id}")
    public ModelAndView addUserAvatar(@PathVariable Long id) {
        ModelAndView mav = new ModelAndView();
        mav.addObject("user", userService.getUser(id));
        mav.setViewName("user_add_avatar");
        return mav;
    }

    @RequestMapping("/do_add_avatar/{id}")
    public ModelAndView doAddUserAvatar(@RequestParam("avatar") MultipartFile file, @PathVariable Long id) {
        try {
            String fileName = file.getOriginalFilename();
            String filePath = ResourceUtils.getURL("classpath:").getPath() + "../../../resources/main/static/";
            File dest = new File(filePath + fileName);
            log.info(dest.getAbsolutePath());
            file.transferTo(dest);
            User user = userService.getUser(id);
            // user.setAvatar(fileName); 未实现该功能
            userService.modifyUser(user);
        } catch (Exception e) {
            log.error("upload avatar error", e.getMessage());
        }
        return new ModelAndView("redirect:/user/list");
    }
}