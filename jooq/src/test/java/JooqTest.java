import app.JooqApp;
import dao.api.FeedDao;
import jooq.generated.tables.records.FeedRecord;
import model.Feed;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

import static jooq.generated.Tables.FEED;


/**
 * Created by pbezglasnyi on 18.10.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {JooqApp.class})
public class JooqTest {

    @Autowired
    DSLContext dsl;

    @Autowired
    FeedDao feedDao;

    @Test
    public void test() {
        Result<FeedRecord> records = dsl.selectFrom(FEED).fetch();
        Arrays.stream(records.intoArrays()).forEach(a -> System.out.println(Arrays.toString(a)));
        int i = 0;
        System.out.println("----------------------------");
        dsl.selectFrom(FEED).fetch().map(r -> new Feed(r.value2(), r.value3())).forEach(System.out::println);
        System.out.println("----------------------------");
        dsl.selectFrom(FEED).fetch().into(Feed.class).forEach(System.out::println);
    }

    @Test
    @Transactional
    @Rollback
    public void feedDaoTest() {
        Feed feed = new Feed("jooq name", "jooq description");
        long id = feedDao.insertFeed(feed);
        int i = 0;
    }
}
