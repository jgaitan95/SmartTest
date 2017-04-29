
DROP DATABASE IF EXISTS smarttest_db;
CREATE DATABASE smarttest_db;
USE smarttest_db;

/*
* deployed tests table
*/
CREATE TABLE deployedTests(
    id INT AUTO_INCREMENT PRIMARY KEY,
    byteStr MEDIUMTEXT CHARACTER SET ascii
);

INSERT INTO deployedTests(byteStr) VALUES ("INVALIDSTRINGDATA");

/*
* undeployed tests table
*/
CREATE TABLE undeployedTests(
    id INT AUTO_INCREMENT PRIMARY KEY,
    byteStr MEDIUMTEXT CHARACTER SET ascii
);

INSERT INTO undeployedTests(byteStr) VALUES ("INVALIDSTRINGDATA");