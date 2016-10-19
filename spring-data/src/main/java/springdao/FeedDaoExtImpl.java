package springdao;

import model.Feed;
import model.Feed_;
import model.Project;
import model.Project_;

import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by pbezglasnyi on 19.10.2016.
 */
public class FeedDaoExtImpl implements FeedDaoExt {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Feed> selectWithSql(long feedId) {
        //todo
        return null;
    }

    @Override
    public List<Feed> selectCriteria(long projId) {
        EntityGraph entityGraph = entityManager.getEntityGraph("Feed.projects");
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Feed> criteriaQuery = builder.createQuery(Feed.class);
        Root<Feed> root = criteriaQuery.from(Feed.class);
        Join<Feed, Project> join = root.join(Feed_.projects, JoinType.LEFT);
        criteriaQuery.where(builder.equal(join.get(Project_.id), projId));
        return entityManager.createQuery(criteriaQuery).
                setHint("javax.persistence.loadgraph", entityGraph).
                getResultList();
    }
}
