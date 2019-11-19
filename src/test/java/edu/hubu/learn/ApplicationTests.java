package edu.hubu.learn;

import edu.hubu.learn.dao.UserInfoDao;
import edu.hubu.learn.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.TestCase;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    UserInfoDao userInfoDao;

    @Test
    public void t1(){
        List<UserInfo> list = userInfoDao.selectAll();
        for (UserInfo user:list
             ) {
            System.out.println(user);
            System.out.println("this is selectallmethed !");
        }
    }

}
