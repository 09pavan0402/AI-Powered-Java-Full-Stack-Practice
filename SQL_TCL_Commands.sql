
CREATE TABLE students (
stu_id integer,
stu_name varchar(20),
marks integer
);
INSERT INTO students values(1,'pavan',98);
INSERT INTO students(stu_id,stu_name) values(2,'gopal');
INSERT INTO students values(3,'bhanu',92),(4,'bhallu',90);
INSERT INTO students values(5,'rajesh',62),(6,'raju',70);
DELETE FROM students;
-- TCL Commands
commit;
set autocommit=0;
SELECT * FROM students;
DELETE FROM students;

rollback;

INSERT INTO students values(1,'pavan',98);
savepoint insert1;
INSERT INTO students(stu_id,stu_name) values(2,'gopal');
savepoint insert2;
INSERT INTO students values(3,'bhanu',92),(4,'bhallu',90);
savepoint insert3;

rollback to insert2;