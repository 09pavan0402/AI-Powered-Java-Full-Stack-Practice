create database sqlcommands_db2;
use sqlcommands_db2;

create table students
(
student_id integer primary key,
student_name varchar(30),
marks integer,
dept_id integer,
foreign key(dept_id) references departments(dept_id)
);

create table departments(
dept_id integer primary key auto_increment,
dept_name varchar(20)
);

insert into departments(dept_name) values('CSE');
insert into departments(dept_name) values('EEE');
insert into departments(dept_name) values('ECE');
insert into departments(dept_name) values('MECH');
insert into departments(dept_name) values('MCA');
insert into departments(dept_name) values('MBA');

insert into students values (1,'pavan',100,1);
insert into students values (2,'pandu',90,2);
insert into students values (3,'bhallu',20,3);
insert into students values (4,'pavani',50,1);
insert into students values (5,'phani',10,1);
insert into students values (6,'ballu',60,2);
insert into students values (7,'deepu',70,3);
insert into students values (8,'geetu',50,1);

-- Aggregate functions 
-- count() -> Counts total rows.
select count(*) from students; 
select count(student_name) from students;
select count(student_name) as total_names from students; -- Here as means alias, it print name as temporarily
select count(*) from students where dept_id=3;

-- sum() -> Adds values of a column.
select sum(marks) from students;
select sum(marks) as sum from students;
select sum(marks) from students where dept_id=1;

-- AVG() -> Calculates average. 
select avg(marks) as avg from students;
select avg(marks) from students where dept_id=3;

-- MIN()/MAX() – Gets smallest/largest values
select max(marks) as max_marks from students;
select max(marks) from students where dept_id=1;
select min(marks) as min_marks from students;
select min(marks) from students where dept_id=1;

-- OrderedBy 
-- Sorts results in ascending or descending order.

select * from students order by marks;
select * from students order by marks desc;
select * from students order by marks desc limit 3;
select * from students order by marks desc limit 3, 1;

-- GROUP BY
-- Groups rows for aggregation.
select dept_id,count(*) from students group by dept_id;

-- HAVING
-- Filters grouped data (used with GROUP BY).
select dept_id,count(*) from students group by dept_id having count(*)>2;
select dept_id, sum(marks) from students group by dept_id having sum(marks)> 40;
select dept_id,count(*) 
from students where marks > 30
group by dept_id
having count(*) >1;

-- LIKE Operator
-- Used for pattern matching in WHERE clause. 
-- % matches any number of characters. 
-- _ matches exactly one character.

SELECT * FROM students WHERE student_name LIKE 'p%'; -- Starts with A 
SELECT * FROM students WHERE student_name LIKE '%n'; -- Ends with n 
SELECT * FROM students WHERE student_name LIKE '_a%'; -- Second letter is a

