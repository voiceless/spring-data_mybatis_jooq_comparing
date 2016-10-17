package springdao;

import model.FeedInstance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Collection;
import java.util.List;

/**
 * Created by pbezglasnyi on 17.10.2016.
 */
public class FeedInstanceDaoExtImpl implements FeedInstanceDaoExt {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<FeedInstance> findByIds(Collection<Long> ids) {
        TypedQuery<FeedInstance> query = entityManager.createQuery
                ("SELECT f FROM FeedInstance f WHERE id in :ids",
                        FeedInstance.class);
        query.setParameter("ids", ids);
        return query.getResultList();
    }
}
