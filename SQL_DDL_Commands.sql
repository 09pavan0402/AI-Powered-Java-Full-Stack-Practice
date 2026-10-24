CREATE DATABASE sqlcommands_db;
USE sqlcommands_db;

-- DDL Commands 
-- Example for creating a Table using CREATE command
CREATE TABLE student (
stu_id integer,
stu_name varchar(20),
marks integer
);

-- Example for Alter a Table using ALTER command
ALTER TABLE student ADD COLUMN stu_branch varchar(20);
ALTER TABLE student MODIFY COLUMN stu_name varchar(30);
ALTER TABLE student RENAME COLUMN marks TO stu_marks;
ALTER TABLE student DROP COLUMN stu_marks;
ALTER TABLE student ADD COLUMN stu_marks integer after stu_name;
ALTER TABLE students ADD COLUMN stu_rollno integer first;
ALTER TABLE students DROP COLUMN stu_rollno;

-- Example for Rename a Table using RENAME command
RENAME TABLE student to students;

DROP TABLE students;
DROP DATABASE jfs;

truncate students;