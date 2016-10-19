package model;

import model.FeedInstance;
import model.FeedInstanceException;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FeedInstanceException.class)
public abstract class FeedInstanceException_ {

	public static volatile SingularAttribute<FeedInstanceException, String> description;
	public static volatile SingularAttribute<FeedInstanceException, Long> id;
	public static volatile SingularAttribute<FeedInstanceException, FeedInstance> feedInstance;

}

