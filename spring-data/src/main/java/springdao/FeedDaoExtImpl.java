package springdao;

import model.Feed;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by pbezglasnyi on 19.10.2016.
 */
public class FeedDaoExtImpl implements FeedDaoExt {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Feed> selectWithSql(long feedId) {
        //todo
        return null;
    }
}
