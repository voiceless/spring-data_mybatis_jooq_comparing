package springdao;

import model.FeedInstance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pbezglasnyi on 17.10.2016.
 */
@Repository
public interface FeedInstanceDao extends CrudRepository<FeedInstance, Long>, FeedInstanceDaoExt {
}
