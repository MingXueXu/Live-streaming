package edu.hubu.learn.web.service;

import edu.hubu.learn.dao.UserInfoDao;
import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.web.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService extends BaseService<UserInfo, Long> {
    @Autowired
    UserInfoDao userInfoDao;

}
