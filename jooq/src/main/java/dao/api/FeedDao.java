package dao.api;

import model.Feed;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pbezglasnyi on 18.10.2016.
 */
public interface FeedDao {

    @Transactional(propagation = Propagation.MANDATORY)
    Long insertFeed(Feed feed);

    @Transactional(propagation = Propagation.MANDATORY)
    Feed selectFeedWithProjects(long feedId);
}
