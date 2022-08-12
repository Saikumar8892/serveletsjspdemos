use products;

CREATE TABLE `Classes` (
	  `Section` varchar(10) DEFAULT NULL,
	  `Subject` varchar(20) DEFAULT NULL,
	  `Teacher` varchar(20) DEFAULT NULL,
	  `Time` int default null,
	  `List of Students` date default null,
	);
	
CREATE TABLE `Subjects` (
	  `Name` varchar(20) DEFAULT NULL,
	  `Shortcut` varchar(20) DEFAULT NULL,
	);
	
create table `Teachers`(
`First Name` varchar(25) DEFAULT NULL,
	  `Last name` varchar(25) DEFAULT NULL
	   `age` int default null,);
create table `Students`(
`First Name` varchar(25) DEFAULT NULL,
	  `Last name` varchar(25) DEFAULT NULL
	   `age` int default null,);
	   
	   
insert into subjects values("mathematics", "maths");