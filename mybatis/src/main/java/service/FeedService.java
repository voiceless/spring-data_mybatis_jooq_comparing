package service;

import batis.FeedMapper;
import model.Feed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
public class FeedService {

    @Autowired(required = false)
    FeedMapper feedMapper;


    @Transactional
    public void saveFeed(String name, String desc) {
        Feed feed = new Feed(name, desc);
        feedMapper.insertFeed(feed);
    }

    @Transactional
    public Feed getFeed(Long id) {
        return feedMapper.selectFeed(id);
    }

}
