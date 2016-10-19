package springdao;

import model.Feed;

import java.util.List;

/**
 * Created by pbezglasnyi on 19.10.2016.
 */
public interface FeedDaoExt {

    List<Feed> selectWithSql(long feedId);
}
