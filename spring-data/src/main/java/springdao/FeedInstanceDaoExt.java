package springdao;

import model.FeedInstance;

import java.util.Collection;
import java.util.List;

/**
 * Created by pbezglasnyi on 17.10.2016.
 */
public interface FeedInstanceDaoExt {

    List<FeedInstance> findByIds(Collection<Long> ids);
}
