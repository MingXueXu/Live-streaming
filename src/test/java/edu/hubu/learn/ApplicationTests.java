package edu.hubu.learn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import edu.hubu.learn.service.WatchinghistoryService;
import junit.framework.TestCase;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    // @Autowired
    // private UserInfoService userInfoService;

	@Test
	public void testUser() {

	}
	@Test
	public void testWatchinghistory(){
		long video = WatchinghistoryService.getWatchinghistory(1l).getId();
		TestCase.assertEquals(video, "1");

	}


}
