/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.FeedRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Feed extends org.jooq.impl.TableImpl<FeedRecord> {

	private static final long serialVersionUID = 1541913476;

	/**
	 * The singleton instance of <code>public.feed</code>
	 */
	public static final Feed FEED = new Feed();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<FeedRecord> getRecordType() {
		return FeedRecord.class;
	}

	/**
	 * The column <code>public.feed.id</code>.
	 */
	public final org.jooq.TableField<FeedRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.feed.name</code>.
	 */
	public final org.jooq.TableField<FeedRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(300), this, "");

	/**
	 * The column <code>public.feed.description</code>.
	 */
	public final org.jooq.TableField<FeedRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(500), this, "");

	/**
	 * Create a <code>public.feed</code> table reference
	 */
	public Feed() {
		this("feed", null);
	}

	/**
	 * Create an aliased <code>public.feed</code> table reference
	 */
	public Feed(String alias) {
		this(alias, Feed.FEED);
	}

	private Feed(String alias, org.jooq.Table<FeedRecord> aliased) {
		this(alias, aliased, null);
	}

	private Feed(String alias, org.jooq.Table<FeedRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<FeedRecord, Long> getIdentity() {
		return Keys.IDENTITY_FEED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<FeedRecord> getPrimaryKey() {
		return Keys.FEED_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<FeedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<FeedRecord>>asList(Keys.FEED_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Feed as(String alias) {
		return new Feed(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Feed rename(String name) {
		return new Feed(name, null);
	}
}
