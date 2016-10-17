package dao;

import app.ApplicationMyBatis;
import model.Feed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.FeedService;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationMyBatis.class)
@ActiveProfiles("mybatis")
public class SpringBatisTest {

    @Autowired
    FeedService feedService;

    @Test
    public void feedServiceTest() {
        feedService.saveFeed("ads", "asf");
        Feed feed = feedService.getFeed(5L);
        int i = 0;
    }
}
