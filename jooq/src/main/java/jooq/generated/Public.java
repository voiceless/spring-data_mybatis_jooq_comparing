/**
 * This class is generated by jOOQ
 */
package jooq.generated;

import jooq.generated.tables.*;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -981369089;

	/**
	 * The singleton instance of <code>public</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("public");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			Sequences.FEED_ID_SEQ,
			Sequences.FEEDINSTANCE_ID_SEQ,
			Sequences.FEEDINSTANCEEXCEPTION_ID_SEQ,
			Sequences.PROJECT_ID_SEQ);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			Feed.FEED,
			FeedProj.FEED_PROJ,
			Feedinstance.FEEDINSTANCE,
			Feedinstanceexception.FEEDINSTANCEEXCEPTION,
			Project.PROJECT);
	}
}
