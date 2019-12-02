package edu.hubu.learn.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.hubu.learn.service.VideoInfoService;

@RestController
@RequestMapping("/video_info")
public class VideoInfoController {

    @Autowired
    private VideoInfoService service;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Object getAll() {
        return service.getVideoInfo();
    }
}