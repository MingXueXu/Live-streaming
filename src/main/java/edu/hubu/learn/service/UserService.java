package edu.hubu.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.hubu.learn.dao.UserInfoDao;
import edu.hubu.learn.entity.UserInfo;

@Service
public class UserService {

    @Autowired
    private UserInfoDao userDao;

    public UserInfo getUser(Long id) {
        return userDao.findById(id).get();
    }

    public List<UserInfo> getUsers() {
        return userDao.findAll(new Sort(Direction.DESC, "id"));
    }

    public List<UserInfo> searchUsers(String keyword) {
        UserInfo user = new UserInfo();
        user.setUsername(keyword);
        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("username", match->match.contains());
        Example<UserInfo> example = Example.of(user, matcher);
        Sort sort = new Sort(Direction.DESC, "id");
        return userDao.findAll(example, sort);
    }

    public UserInfo addUser(UserInfo user) {
        return userDao.save(user);
    }

    public void deleteUser(Long id) {
        userDao.deleteById(id);
    }

    public void modifyUser(UserInfo user) {
        userDao.save(user);
    }
}