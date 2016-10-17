package dao;

import app.ApplicationSpringData;
import model.Feed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import springdao.FeedDao;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationSpringData.class)
@ActiveProfiles("spring-data")
public class SpringDataTest {

    @Autowired
    FeedDao feedDao;


    @Test
//    @Transactional
//    @Rollback
    public void test() {
        Feed feed = new Feed();
        feedDao.save(feed);
        for (Feed feed1 : feedDao.findAll()) {
            System.out.println(feed1);
        }
        int i = 0;
    }

}
