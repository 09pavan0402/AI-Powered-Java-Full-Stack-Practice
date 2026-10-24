USE sqlcommands_db;
CREATE TABLE students (
stu_id integer,
stu_name varchar(20),
marks integer
);
INSERT INTO students values(1,'pavan',98);
INSERT INTO students(stu_id,stu_name) values(2,'gopal');
INSERT INTO students values(3,'bhanu',92),(4,'bhallu',90);
INSERT INTO students values(5,'rajesh',62),(6,'raju',70);

-- DQL Commands
SELECT * FROM students; -- to see all columns from table
SELECT stu_name FROM students; -- to see specific columns from table
SELECT * FROM students where stu_id=1; -- to see perticular row from table
SELECT stu_name, marks FROM students where stu_id=1; 
