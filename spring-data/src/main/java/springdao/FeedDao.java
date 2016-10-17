package springdao;

import model.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by pbezglasnyi on 14.10.2016.
 */
@Transactional(propagation = Propagation.REQUIRED)
@Repository
public interface FeedDao extends CrudRepository<Feed, Long> {
}
