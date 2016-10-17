package springdao;

import model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pbezglasnyi on 17.10.2016.
 */
@Repository
public interface ProjectDao extends CrudRepository<Project, Long> {
}
