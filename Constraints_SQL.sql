use sqlcommands_db;

-- Constraints in SQL 

create table employees
(
emp_id integer primary key auto_increment,
emp_name varchar(30) not null,
emp_salary decimal(12,2),
emp_email varchar(40) unique
);

insert into employees values(1,'pavan',200000,'pavan@gmail.com');
insert into employees values(2,'gopal',100000,'gopal@gmail.com');
insert into employees values(3,'bhanu',200000,'bhanu@gmail.com');

alter table employees modify column emp_email varchar(40) not null;

create table voters
(
voter_id integer primary key auto_increment,
voter_name varchar(30) not null,
voter_age integer check(voter_age>18), 
country varchar(6) default 'INDIA'
);
insert into voters values(1,'pavan',20,'India');
insert into voters values(2,'pandu',19,'India');
insert into voters(voter_id,voter_name,voter_age) values(3,'pavan',22);
insert into voters(voter_name,voter_age) values('bhallu',22);