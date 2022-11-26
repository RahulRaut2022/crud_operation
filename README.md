# crud_operation

table creation

create database crud_operation;
use crud_operation;
CREATE TABLE employee (
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255),
    last_name varchar(255),
    email varchar(255)
    age int,
    PRIMARY KEY (id)
);
