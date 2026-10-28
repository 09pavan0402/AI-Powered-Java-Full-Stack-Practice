create database joins_db;
use joins_db;

create table departments
(
dept_id integer primary key,
dept_name varchar(30)
);

create table managers
(
manager_id integer primary key,
manager_name varchar(30),
dept_id integer,
foreign key(dept_id) references departments(dept_id)
);

create table employees
(
emp_id integer primary key,
emp_name varchar(30),
emp_salary decimal(10,2),
dept_id integer,
manager_id integer,
foreign key(dept_id) references departments(dept_id),
foreign key(manager_id) references managers(manager_id)
);

SELECT * FROM joins_db.departments;
insert into departments values(1,'HR');
insert into departments values(2,'Sales');
insert into departments values(3,'Tech');
insert into departments values(4,'Marketing');
insert into departments values(5,'OPS');
insert into departments values(6,'Non-Tech');

SELECT * FROM joins_db.employees;

insert into employees values(1,'emp1',220000,1,2);
insert into employees values(2,'emp2',120000,2,1);
insert into employees values(3,'emp3',320000,3,2);
insert into employees values(4,'emp4',420000,1,2);
insert into employees values(5,'emp5',620000,3,3);
insert into employees values(6,'emp6',220000,4,4);
insert into employees values(7,'emp7',220000,3,2);
insert into employees values(8,'emp8',120000,4,4);
insert into employees values(9,'emp9',820040,5,5);
insert into employees values(10,'emp10',220000,5,6);
insert into employees values(11,'emp11',220000,5,7);
insert into employees values(12,'emp12',22000,4,null);
insert into employees values(13,'emp13',22000,null,null);
insert into employees values(14,'emp14',342000,null,1);

SELECT * FROM joins_db.managers;

insert into managers values(1,'manager1',1);
insert into managers values(2,'manager2',2);
insert into managers values(3,'manager3',1);
insert into managers values(4,'manager4',3);
insert into managers values(5,'manager5',1);
insert into managers values(6,'manager6',2);
insert into managers values(7,'manager7',3);
insert into managers values(8,'manager8',4);
insert into managers values(9,'manager9',5);
insert into managers values(10,'manager10',4);
insert into managers values(11,'manager11',null);
insert into managers values(12,'manager12',null);
insert into managers values(13,null,null);

-- inner join
select e.emp_id, e.emp_name, d.dept_name
from employees as e
inner join
departments as d
on e.emp_id = d.dept_id;

-- left join
select e.emp_id, e.emp_name, d.dept_name
from employees as e
left join
departments as d
on e.emp_id = d.dept_id;

-- Right join
select e.emp_id, e.emp_name, d.dept_name
from employees as e
right join
departments as d
on e.emp_id = d.dept_id;

-- full join
select e.emp_id, e.emp_name, d.dept_name
from employees as e
left join
departments as d
on e.emp_id = d.dept_id
union
select e.emp_id, e.emp_name, d.dept_name
from employees as e
right join
departments as d
on e.emp_id = d.dept_id;

-- cross join
create table clothes
(
id integer primary key,
item_name varchar(30),
price int
);
insert into clothes values(1,'techno shirt',300);
insert into clothes values(2,'techno t-shirt',600);
insert into clothes values(3,'techno short',300);
insert into clothes values(4,'techno shoes',1300);
insert into clothes values(5,'puma shirt',1300);
insert into clothes values(6,'puma t-shirt',2300);

create table sizes 
(
size_id integer,
size varchar(20)
);
insert into sizes values(1,'M');
insert into sizes values(2,'L');
insert into sizes values(3,'XL');
insert into sizes values(4,'XXL');
insert into sizes values(5,'XXXL');

select c.item_name, s.size
from clothes c
cross join sizes s;

-- natural join
select e.emp_name, d.dept_name
from employees e
natural join departments d;

-- self join
create table categories
(
category_id int,
category_name varchar(30),
parent_category_id int
);
insert into categories values(1,'electronics',null);
insert into categories values(2,'furniture',null);
insert into categories values(3,'clothes',null);
insert into categories values(4,'mobiles',null);
insert into categories values(5,'sofa',2);
insert into categories values(6,'samsung mobile',1);
insert into categories values(6,'puma',3);
SET SQL_SAFE_UPDATES = 0;
delete from categories where category_name='samsung mobile';

select child.category_name as child_category, parent.category_name  as parent_category
from categories child
left join categories parent
on child.parent_category_id = parent.category_id;