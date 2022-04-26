create table events
(
    id bigint auto_increment primary key unique ,
    event_name varchar(15) not null ,
    file_id bigint not null,
    user_id bigint not null,
    FOREIGN KEY (file_id) references files (id),
    FOREIGN KEY (user_id) references users (id)
);

create table files
(
    id bigint auto_increment primary key unique ,
    name varchar(15) not null ,
    user_id bigint not null ,
    FOREIGN KEY (user_id) references users (id)
);

create table users
(
    id bigint auto_increment primary key unique ,
    username varchar(50) not null,
    password varchar(255) not null,
    status varchar(25) not null default 'ACTIVE'
);

create table roles
(
    id bigint auto_increment primary key unique ,
    name varchar(50) not null,
    status varchar(25) not null default 'ACTIVE'
);

create table user_roles
(
    user_id bigint,
    role_id bigint,
    primary key (user_id,role_id),
    foreign key (user_id) references users(id) ,
    foreign key (role_id) references roles(id)
);