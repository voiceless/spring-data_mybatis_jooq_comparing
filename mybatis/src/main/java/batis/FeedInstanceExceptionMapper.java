package batis;

import model.FeedInstanceException;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
public interface FeedInstanceExceptionMapper {

    FeedInstanceException findException(Long id);

    void insertException(FeedInstanceException e);
}
