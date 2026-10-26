use jdbc;

create table users
(
user_id integer primary key auto_increment,
user_name varchar(20) unique,
user_password varchar(10)
);