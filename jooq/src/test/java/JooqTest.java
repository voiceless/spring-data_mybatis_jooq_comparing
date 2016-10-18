import app.JooqApp;
import jooq.generated.tables.Feed;
import jooq.generated.tables.records.FeedRecord;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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

    @Test
    public void test() {
        Feed f = FEED.as("f");
        Result<FeedRecord> records = dsl.selectFrom(f).fetch();
        Arrays.stream(records.intoArrays()).forEach(a -> System.out.println(Arrays.toString(a)));
        int i = 0;
    }
}
