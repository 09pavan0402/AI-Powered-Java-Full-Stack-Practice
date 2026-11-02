create database hibernate;
use hibernate;

create table students
(
stu_id integer primary key,
stu_name varchar(40),
stu_marks integer
);

create table employees
(
emp_id integer primary key auto_increment,
emp_name varchar(40),
emp_salary decimal(10,2)
);
