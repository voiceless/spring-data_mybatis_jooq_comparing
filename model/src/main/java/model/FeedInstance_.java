package model;

import model.Feed;
import model.FeedInstance;
import model.FeedInstanceException;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FeedInstance.class)
public abstract class FeedInstance_ {

	public static volatile SingularAttribute<FeedInstance, LocalDateTime> date;
	public static volatile SingularAttribute<FeedInstance, Feed> feed;
	public static volatile SingularAttribute<FeedInstance, String> description;
	public static volatile SingularAttribute<FeedInstance, Long> id;
	public static volatile ListAttribute<FeedInstance, FeedInstanceException> exceptions;

}

