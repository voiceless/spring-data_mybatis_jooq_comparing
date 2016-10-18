create table if not exists Feed(
	id bigserial primary key,
    name varchar(300),
    description varchar(500)
);

create table if not exists FeedInstance(
	id bigserial primary key,
    feedId bigint not null,
    date TIMESTAMP,
    description varchar(400),
    FOREIGN key (feedId) REFERENCES feed on delete cascade
);

create table if not exists FeedInstanceException(
	id bigserial primary key,
    feedInstanceId bigint not null,
    description varchar(500),
    FOREIGN key (feedInstanceId) REFERENCES FeedInstance on delete cascade
);

CREATE TABLE IF NOT EXISTS Project(
	id bigserial primary key,
	name varchar(400)
);

CREATE TABLE IF NOT EXISTS FEED_PROJ(
	feed_id bigint not null,
	proj_id bigint not null,
	FOREIGN key (feed_id) REFERENCES feed on delete cascade
	FOREIGN key (proj_id) REFERENCES Project on delete cascade
);