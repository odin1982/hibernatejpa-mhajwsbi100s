/*CREATE TABLE person(
	id INTEGER NOT NULL,
	name VARCHAR(255) NOT NULL,
	location VARCHAR(255),
	birth_date TIMESTAMP,
	PRIMARY KEY(id)
);*/

insert into person (ID,NAME,LOCATION,BIRTH_DATE) values(1000,'odin','tizayuca',sysdate());
insert into person (ID,NAME,LOCATION,BIRTH_DATE) values(1001,'amaya','santa fe',sysdate());
insert into person (ID,NAME,LOCATION,BIRTH_DATE) values(1002,'sarai','san francisco',sysdate());


INSERT INTO course (ID,NAME) values(1000,'jpa');
INSERT INTO course (ID,NAME) values(1001,'hibernate');
INSERT INTO course (ID,NAME) values(1002,'spring');
INSERT INTO course (ID,NAME) values(1003,'angular');