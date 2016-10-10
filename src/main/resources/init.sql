drop table if exists user_account;
create memory table user_account (
id bigint not null,
login varchar(255) not null,
name varchar(255) not null,
primary key(id)
);
insert into user_account (id, login, name) values (1, 'user', 'Пользователь');
insert into user_account (id, login, name) values (2, 'admin', 'Администратор');
