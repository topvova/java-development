-- Database Secondary Row firm
CREATE DATABASE secondary_raw_firm;

use secondary_row_firm;

-- Create tables
CREATE TABLE Income (
	code int NOT NULL ,
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	inc decimal(8,2) NOT NULL 
); 

CREATE TABLE Outcome (
	code int NOT NULL ,
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	`out` decimal(8,2) NOT NULL 
); 

CREATE TABLE Income_o (
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	inc decimal(8,2) NOT NULL 
); 

CREATE TABLE Outcome_o (
	point tinyint NOT NULL ,
	date datetime NOT NULL ,
	`out` decimal(8,2) NOT NULL 
); 

-- Add PK constraint
ALTER TABLE Income  ADD 
	CONSTRAINT PK_Income PRIMARY KEY  NONCLUSTERED 
	(
		code
	);   

ALTER TABLE Outcome  ADD 
	CONSTRAINT PK_Outcome PRIMARY KEY  NONCLUSTERED 
	(
		code
	);  

ALTER TABLE Income_o  ADD 
	CONSTRAINT PK_Income_o PRIMARY KEY  NONCLUSTERED 
	(
		point,
		date
	);   

ALTER TABLE Outcome_o  ADD 
	CONSTRAINT PK_Outcome_o PRIMARY KEY  NONCLUSTERED 
	(
		point,
		date
	);
    
-- Fill the tables
#---Income------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ 
insert into Income values(1,1,'2001-03-22 00:00:00.000',15000.00);
insert into Income values(2,1,'2001-03-23 00:00:00.000',15000.00);
insert into Income values(3,1,'2001-03-24 00:00:00.000',3600.00);
insert into Income values(4,2,'2001-03-22 00:00:00.000',10000.00);
insert into Income values(5,2,'2001-03-24 00:00:00.000',1500.00);
insert into Income values(6,1,'2001-04-13 00:00:00.000',5000.00);
insert into Income values(7,1,'2001-05-11 00:00:00.000',4500.00);
insert into Income values(8,1,'2001-03-22 00:00:00.000',15000.00);
insert into Income values(9,2,'2001-03-24 00:00:00.000',1500.00);
insert into Income values(10,1,'2001-04-13 00:00:00.000',5000.00);
insert into Income values(11,1,'2001-03-24 00:00:00.000',3400.00);
insert into Income values(12,3,'2001-09-13 00:00:00.000',1350.00);
insert into Income values(13,3,'2001-09-13 00:00:00.000',1750.00);
                                                                                                                                                                                                                                                                 
#-----Outcome 
insert into Outcome values(1,1,'2001-03-14 00:00:00.000',15348.00);
insert into Outcome values(2,1,'2001-03-24 00:00:00.000',3663.00);
insert into Outcome values(3,1,'2001-03-26 00:00:00.000',1221.00);
insert into Outcome values(4,1,'2001-03-28 00:00:00.000',2075.00);
insert into Outcome values(5,1,'2001-03-29 00:00:00.000',2004.00);
insert into Outcome values(6,1,'2001-04-11 00:00:00.000',3195.04);
insert into Outcome values(7,1,'2001-04-13 00:00:00.000',4490.00);
insert into Outcome values(8,1,'2001-04-27 00:00:00.000',3110.00);
insert into Outcome values(9,1,'2001-05-11 00:00:00.000',2530.00);
insert into Outcome values(10,2,'2001-03-22 00:00:00.000',1440.00);
insert into Outcome values(11,2,'2001-03-29 00:00:00.000',7848.00);
insert into Outcome values(12,2,'2001-04-02 00:00:00.000',2040.00);
insert into Outcome values(13,1,'2001-03-24 00:00:00.000',3500.00);
insert into Outcome values(14,2,'2001-03-22 00:00:00.000',1440.00);
insert into Outcome values(15,1,'2001-03-29 00:00:00.000',2006.00);
insert into Outcome values(16,3,'2001-09-13 00:00:00.000',1200.00);
insert into Outcome values(17,3,'2001-09-13 00:00:00.000',1500.00);
insert into Outcome values(18,3,'2001-09-14 00:00:00.000',1150.00);
                                                                                                                                                                                                                                                                
#---Income_o 
insert into Income_o values(1,'2001-03-22 00:00:00.000',15000.00);
insert into Income_o values(1,'2001-03-23 00:00:00.000',15000.00);
insert into Income_o values(1,'2001-03-24 00:00:00.000',3400.00);
insert into Income_o values(1,'2001-04-13 00:00:00.000',5000.00);
insert into Income_o values(1,'2001-05-11 00:00:00.000',4500.00);
insert into Income_o values(2,'2001-03-22 00:00:00.000',10000.00);
insert into Income_o values(2,'2001-03-24 00:00:00.000',1500.00);
insert into Income_o values(3,'2001-09-13 00:00:00.000',11500.00);
insert into Income_o values(3,'2001-10-02 00:00:00.000',18000.00);
                                                                                                                                                                                                                                                                 
#---Outcome_o 
insert into Outcome_o values(1,'2001-03-14 00:00:00.000',15348.00);
insert into Outcome_o values(1,'2001-03-24 00:00:00.000',3663.00);
insert into Outcome_o values(1,'2001-03-26 00:00:00.000',1221.00);
insert into Outcome_o values(1,'2001-03-28 00:00:00.000',2075.00);
insert into Outcome_o values(1,'2001-03-29 00:00:00.000',2004.00);
insert into Outcome_o values(1,'2001-04-11 00:00:00.000',3195.04);
insert into Outcome_o values(1,'2001-04-13 00:00:00.000',4490.00);
insert into Outcome_o values(1,'2001-04-27 00:00:00.000',3110.00);
insert into Outcome_o values(1,'2001-05-11 00:00:00.000',2530.00);
insert into Outcome_o values(2,'2001-03-22 00:00:00.000',1440.00);
insert into Outcome_o values(2,'2001-03-29 00:00:00.000',7848.00);
insert into Outcome_o values(2,'2001-04-02 00:00:00.000',2040.00);
insert into Outcome_o values(3,'2001-09-13 00:00:00.000',1500.00);
insert into Outcome_o values(3,'2001-09-14 00:00:00.000',2300.00);
insert into Outcome_o values(3,'2002-09-16 00:00:00.000',2150.00);
