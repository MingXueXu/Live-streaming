package edu.hubu.learn.service;

import edu.hubu.learn.dao.UserInfoDao;
import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.web.common.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;


@Service
public class UserInfoService extends BaseService<UserInfo, Long> {
    @Autowired
    UserInfoDao userInfoDao;
    //登录检验用户名和密码
    public int login(String username, String password){
        return userInfoDao.login(username, password);
    }

    //存储用户信息
    public UserInfo addUserInfo(UserInfo userInfo) {
        return userInfo.save(userInfo);
    }

    //根据Id删除用户信息
    public void deleteUserInfo(Long id) {
        UserInfo.deleteById(id);
    }

    //根据用户id对用户排序
    public List<UserInfo> searchUserInfo(String keyword) {
        UserInfo userinfo = new UserInfo();
        userinfo.setUsername(keyword);
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("username", match->match.contains());
        Example<UserInfo> example = Example.of(userinfo, matcher);
        Sort sort = new Sort(Direction.DESC, "id");
        return userinfoDao.findAll(example, sort);
    }
    //根据用户id排序
    public List<UserInfo> getUserInfo() {
        return userInfoDao.findAll(new Sort(Direction.DESC, "id"));
    }
}
