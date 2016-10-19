package model;

import model.Feed;
import model.Project;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Feed.class)
public abstract class Feed_ {

	public static volatile ListAttribute<Feed, Project> projects;
	public static volatile SingularAttribute<Feed, String> name;
	public static volatile SingularAttribute<Feed, String> description;
	public static volatile SingularAttribute<Feed, Long> id;

}

