package batis;

import model.Feed;
import model.FeedInstance;
import model.FeedInstanceException;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
public interface FeedInstanceMapper {

    @Select("SELECT * FROM feedInstance WHERE id=#{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "feed", column = "feedId", one = @One(select = "getFeed", fetchType = FetchType.EAGER)),
            @Result(property = "date", column = "date"),
            @Result(property = "description", column = "description"),
            @Result(property = "exceptions", column = "id", many = @Many(select = "getExceptions", fetchType = FetchType.EAGER))
    })
    FeedInstance selectFeedInstance(Long id);

    @Select("SELECT * FROM feed WHERE id=#{feedId}")
    Feed getFeed(Long id);

    @Select("SELECT * from FeedInstanceException WHERE feedInstanceId=#{feedInstanceId}")
    List<FeedInstanceException> getExceptions();

    @Insert("INSERT INTO feedInstance")
    void insertFeedInstance(FeedInstance feedInstance);
}
