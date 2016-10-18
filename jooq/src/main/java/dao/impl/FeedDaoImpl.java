package dao.impl;

import dao.api.FeedDao;
import model.Feed;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

import static jooq.generated.tables.Feed.FEED;

/**
 * Created by pbezglasnyi on 18.10.2016.
 */
public class FeedDaoImpl implements FeedDao {

    @Autowired
    DSLContext dsl;

    @Override
    public Long insertFeed(Feed feed) {
        return dsl.insertInto(FEED, FEED.NAME, FEED.DESCRIPTION).values(feed.getName(), feed.getDescription()).
                returning(FEED.ID).fetchOne().getId();
    }
}
