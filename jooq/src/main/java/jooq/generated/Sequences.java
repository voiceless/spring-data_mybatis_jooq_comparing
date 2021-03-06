/**
 * This class is generated by jOOQ
 */
package jooq.generated;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all sequences in public
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

	/**
	 * The sequence <code>public.feed_id_seq</code>
	 */
	public static final org.jooq.Sequence<Long> FEED_ID_SEQ = new org.jooq.impl.SequenceImpl<Long>("feed_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.feedinstance_id_seq</code>
	 */
	public static final org.jooq.Sequence<Long> FEEDINSTANCE_ID_SEQ = new org.jooq.impl.SequenceImpl<Long>("feedinstance_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.feedinstanceexception_id_seq</code>
	 */
	public static final org.jooq.Sequence<Long> FEEDINSTANCEEXCEPTION_ID_SEQ = new org.jooq.impl.SequenceImpl<Long>("feedinstanceexception_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));

	/**
	 * The sequence <code>public.project_id_seq</code>
	 */
	public static final org.jooq.Sequence<Long> PROJECT_ID_SEQ = new org.jooq.impl.SequenceImpl<Long>("project_id_seq", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.nullable(false));
}
