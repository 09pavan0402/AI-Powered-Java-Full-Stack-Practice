CREATE DATABASE sqlcommands_db;
USE sqlcommands_db;

CREATE TABLE students (
stu_id integer,
stu_name varchar(20),
marks integer
);

-- DML Commands
-- inserting records into a table using INSERT command
INSERT INTO students values(1,'pavan',98);
INSERT INTO students(stu_id,stu_name) values(2,'gopal');
INSERT INTO students values(3,'bhanu',92),(4,'bhallu',90);
INSERT INTO students values(5,'rajesh',62),(6,'raju',70);
set sql_safe_updates=0;
-- update a records inside table 
UPDATE students SET stu_id = 2 WHERE stu_name = 'pavan';
UPDATE students SET stu_id = 1 WHERE marks = 98;

-- deleting records from table
DELETE FROM students;
DELETE FROM students WHERE stu_id=4;
