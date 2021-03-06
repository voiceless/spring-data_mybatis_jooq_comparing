/**
 * This class is generated by jOOQ
 */
package jooq.generated.tables;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.ProjectRecord;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Project extends org.jooq.impl.TableImpl<ProjectRecord> {

	private static final long serialVersionUID = -40228450;

	/**
	 * The singleton instance of <code>public.project</code>
	 */
	public static final Project PROJECT = new Project();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ProjectRecord> getRecordType() {
		return ProjectRecord.class;
	}

	/**
	 * The column <code>public.project.id</code>.
	 */
	public final org.jooq.TableField<ProjectRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>public.project.name</code>.
	 */
	public final org.jooq.TableField<ProjectRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400), this, "");

	/**
	 * Create a <code>public.project</code> table reference
	 */
	public Project() {
		this("project", null);
	}

	/**
	 * Create an aliased <code>public.project</code> table reference
	 */
	public Project(String alias) {
		this(alias, Project.PROJECT);
	}

	private Project(String alias, org.jooq.Table<ProjectRecord> aliased) {
		this(alias, aliased, null);
	}

	private Project(String alias, org.jooq.Table<ProjectRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<ProjectRecord, Long> getIdentity() {
		return Keys.IDENTITY_PROJECT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<ProjectRecord> getPrimaryKey() {
		return Keys.PROJECT_PKEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<ProjectRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<ProjectRecord>>asList(Keys.PROJECT_PKEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Project as(String alias) {
		return new Project(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Project rename(String name) {
		return new Project(name, null);
	}
}
