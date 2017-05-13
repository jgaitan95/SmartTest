
DROP DATABASE IF EXISTS smarttest_db;
CREATE DATABASE smarttest_db;
USE smarttest_db;

/*
* deployed tests table
*/
CREATE TABLE deployedTests(
    id INT AUTO_INCREMENT PRIMARY KEY,
    pincode VARCHAR(81),
    byteStr MEDIUMTEXT CHARACTER SET ascii
);

/*
* users table
*/
CREATE TABLE users(
    id INT AUTO_INCREMENT PRIMARY KEY,
    uname VARCHAR(81),
    password VARCHAR(81),
    byteStr MEDIUMTEXT CHARACTER SET ascii
);

/*
* admins table
*/

CREATE TABLE admins(
    id INT AUTO_INCREMENT PRIMARY KEY,
    uname VARCHAR(81),
    password VARCHAR(81)
);

INSERT INTO admins(uname,password) VALUES ("arslan","notagoodyear");

/*
* learningoutcomes table
*/
CREATE TABLE learningOutcomes(
    id INT AUTO_INCREMENT PRIMARY KEY,
    byteStr MEDIUMTEXT CHARACTER SET ascii
);

INSERT INTO learningOutcomes(byteStr) VALUES ("INVALIDSTRINGDATA");