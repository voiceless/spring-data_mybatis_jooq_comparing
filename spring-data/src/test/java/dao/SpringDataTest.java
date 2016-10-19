package dao;

import app.ApplicationSpringData;
import model.Feed;
import model.FeedInstance;
import model.FeedInstanceException;
import model.Project;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import springdao.FeedDao;
import springdao.FeedInstanceDao;
import springdao.FeedInstanceExceptionDao;
import springdao.ProjectDao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationSpringData.class)
@ActiveProfiles("spring-data")
public class SpringDataTest {

    @Autowired
    FeedDao feedDao;

    @Autowired
    ProjectDao projectDao;

    @Autowired
    FeedInstanceDao feedInstanceDao;

    @Autowired
    FeedInstanceExceptionDao feedInstanceExceptionDao;


    @Test
    @Transactional
    @Rollback
    public void test() {
        Project project = new Project("Sample");
        projectDao.save(project);
        Feed feed = new Feed("rqr", "dafafasdf");
        feedDao.save(feed);
        feed.getProjects().add(project);
        feedDao.save(feed);
        for (Feed feed1 : feedDao.findAll()) {
            System.out.println(feed1);
        }
        int i = 0;
    }

    @Test
    @Transactional
    @Rollback
    public void feedSqlTest() {
        List<Feed> f = feedDao.selectWithSql(29L);
        int i = 0;
    }

    @Test
    @Transactional
    @Rollback
    public void testInstance() {
        Project project = new Project("Sample");
        projectDao.save(project);
        Feed feed = new Feed("rqr", "dafafasdf");
        feedDao.save(feed);
        feed.getProjects().add(project);
        feedDao.save(feed);
        FeedInstance feedInstance = new FeedInstance(feed, LocalDateTime.now(), "dasd");
        feedInstanceDao.save(feedInstance);
        FeedInstanceException feedInstanceException = new FeedInstanceException(feedInstance, "NPE");
        feedInstance.getExceptions().add(feedInstanceException);
        feedInstanceException = new FeedInstanceException(feedInstance, "Stack overflow");
        feedInstance.getExceptions().add(feedInstanceException);
        feedInstanceDao.save(feedInstance);
        List<FeedInstance> feedInstances = feedInstanceDao.findByIds(LongStream.range(0, 100).mapToObj(i -> i).collect(Collectors.toList()));
        System.out.println(feedInstances);
    }

}
