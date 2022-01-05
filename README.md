This is Simple System for Student Management System. This is a java and mysql based system and for this system i used NetBeans IDE.

//For login system

	User name - shenuka
	Password - 123
	
// sql query for create batabase

	CREATE DATABASE school;
	
// sql query for create student table

	CREATE TABLE student(
	   id INT NOT NULL AUTO_INCREMENT,
	   name VARCHAR(50) NOT NULL,
	   age INT NOT NULL,
	   grade  CHAR (25) ,       
	   PRIMARY KEY (id)
	);
