package dao;

import batis.FeedInstanceExceptionMapper;
import batis.FeedInstanceMapper;
import model.FeedInstance;
import model.FeedInstanceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
public class DaoTest {

    @Test
    public void daoTest() {
        try (InputStream stream = Resources.getResourceAsStream("mybatis-config.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(stream);
            SqlSession session = sqlSessionFactory.openSession();
            /*FeedMapper mapper = session.getMapper(FeedMapper.class);
            Feed feed = new Feed("feed new name 3" , "description");
            mapper.insertFeed(feed);
            Feed fromBatis = mapper.selectFeed(4L);*/
            FeedInstanceMapper feedInstanceMapper = session.getMapper(FeedInstanceMapper.class);
            FeedInstance feedInstance = feedInstanceMapper.selectFeedInstance(1L);
            FeedInstanceExceptionMapper exceptionMapper = session.getMapper(FeedInstanceExceptionMapper.class);
            exceptionMapper.insertException(new FeedInstanceException(feedInstance, "SOME EXCEPTION"));
            FeedInstanceException feedInstanceException = exceptionMapper.findException(8L);
            session.commit();
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
