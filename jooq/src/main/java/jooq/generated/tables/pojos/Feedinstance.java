/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Feedinstance implements java.io.Serializable {

	private static final long serialVersionUID = -1880580457;

	private final Long     id;
	private final Long     feedid;
	private final java.sql.Timestamp date;
	private final String   description;

	public Feedinstance(
		Long     id,
		Long     feedid,
		java.sql.Timestamp date,
		String   description
	) {
		this.id = id;
		this.feedid = feedid;
		this.date = date;
		this.description = description;
	}

	public Long getId() {
		return this.id;
	}

	public Long getFeedid() {
		return this.feedid;
	}

	public java.sql.Timestamp getDate() {
		return this.date;
	}

	public String getDescription() {
		return this.description;
	}
}
