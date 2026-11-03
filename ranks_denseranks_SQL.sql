-- find first highest salary
SELECT emp_salary FROM employees
ORDER BY emp_salary DESC
LIMIT 1;
-- find second highest salary
select emp_salary from employees
order by emp_salary desc
limit 1,1;
-- Finding the Top 3 Distinct Salaries distinct uses unique values not duplicate
select distinct emp_salary from employees
order by emp_salary desc
limit 1,3;

-- sub queries
select max(emp_salary) 
from employees 
where emp_salary < (select max(emp_salary) from employees);

-- Ranks and Dense Ranks
-- rank()
select emp_name,emp_salary,
RANK() over(order by emp_salary desc) 
from employees;

-- Dense Rank
select emp_name,emp_salary,
dense_rank() over(order by emp_salary desc) as emprank
from employees;

select * from (
	select emp_name,emp_salary,
	dense_rank() over(order by emp_salary desc) as emp_rank
	from employees
)emp 
where emp_rank=6;

-- indexes
create index city_index on employees(city);

show index from employees;

drop index city_index on employees;