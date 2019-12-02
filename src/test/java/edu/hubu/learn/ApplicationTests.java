package edu.hubu.learn;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.hubu.learn.dao.UserDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserDao userInfoDao;

    @Test
    public void t1() {
        List<edu.hubu.learn.entity.User> list = userInfoDao.selectAll();
        for (edu.hubu.learn.entity.User user : list
             ) {
            System.out.println(user);
            System.out.println("this is selectallmethed !");
        }
    }

}
