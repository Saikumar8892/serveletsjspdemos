use mydb;

CREATE TABLE `student1` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `firstname` varchar(255) not null,
  `lastname` varchar(255) not null,
  `email` varchar(255) not null,
  PRIMARY KEY (`id`)
);

insert into student1 (firstname, lastname, email) values ('sai', 'kumar', 'sai@gmail.com');