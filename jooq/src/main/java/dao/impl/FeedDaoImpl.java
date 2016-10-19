package dao.impl;

import dao.api.FeedDao;
import jooq.generated.tables.records.FeedRecord;
import jooq.generated.tables.records.ProjectRecord;
import model.Feed;
import model.Project;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static jooq.generated.tables.Feed.FEED;
import static jooq.generated.tables.FeedProj.FEED_PROJ;
import static jooq.generated.tables.Project.PROJECT;

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

    @Override
    public Feed selectFeedWithProjects(long feedId) {

        Feed feed = null;
        List<Project> projectList = new ArrayList<>();
        dsl.select(FEED.ID, FEED.NAME, FEED.DESCRIPTION, PROJECT.ID, PROJECT.NAME).from(FEED).
                join(FEED_PROJ).on(FEED.ID.eq(FEED_PROJ.FEED_ID)).
                join(PROJECT).on(FEED_PROJ.PROJ_ID.eq(PROJECT.ID)).fetch().into().forEach(record -> {
            FeedRecord feedRecord = record.into(FEED);
            ProjectRecord projectRecord = record.into(PROJECT);
        });
        //todo
        return null;
    }
}
