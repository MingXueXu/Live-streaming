package edu.hubu.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.hubu.learn.web.controller.service.UserService;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UserService userService;

	@Test
	public void testUser() {
		String username = userService.getUser(1l).getUsername();
		String password = userService.getUser(1l).getPassword();
		TestCase.assertEquals(username, "root");
		TestCase.assertEquals(password, "1234");
	}

}
