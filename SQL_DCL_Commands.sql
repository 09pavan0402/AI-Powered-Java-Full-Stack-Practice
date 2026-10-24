-- DCL Commands
CREATE user 'testuser'@'localhost' identified by 'test';
GRANT select on students to 'testuser'@'localhost';
GRANT insert,update on students to 'testuser'@'localhost';
GRANT insert,update on sqlcommands_db.* to 'testuser'@'localhost';
REVOKE insert,update on students from 'testuser'@'localhost';
