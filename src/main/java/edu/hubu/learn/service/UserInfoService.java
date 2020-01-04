package edu.hubu.learn.service;

import edu.hubu.learn.dao.UserInfoDao;
import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.web.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoService extends BaseService<UserInfo, Long> {
    @Autowired
    UserInfoDao userInfoDao;

    public int login(String username, String password){
        return userInfoDao.login(username, password);
    }


}
