package edu.hubu.learn;

import edu.hubu.learn.entity.UserInfo;
import edu.hubu.learn.web.service.UserInfoService;
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
    private UserInfoService userInfoService;

	@Test
	public void testUser() {

	}


}
