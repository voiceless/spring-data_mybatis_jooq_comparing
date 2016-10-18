package batis;

import model.Feed;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * Created by pbezglasnyi on 13.10.2016.
 */
public interface FeedMapper {

    @Select("SELECT * FROM feed WHERE id=#{id}")
    Feed selectFeed(long id);

    @Insert("INSERT INTO feed(name, description) VALUES(#{name}, #{description})")
    @Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
    void insertFeed(Feed feed);

    Feed selectFeedWithProject(long id);
}
