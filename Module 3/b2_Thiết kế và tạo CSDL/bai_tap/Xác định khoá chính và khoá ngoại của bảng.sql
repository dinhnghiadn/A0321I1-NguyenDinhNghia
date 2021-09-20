create database TEST2;
use test2;
create table customers(
customer_number int unique auto_increment primary key,
fullname varchar(50),
address varchar(255),
email varchar(255),
phone varchar(10)
);
create table accounts(
account_number int unique primary key,
account_type varchar(10),
open_date date,
balance double,
customer_number int unique,
foreign key (customer_number) references customers(customer_number)
);
create table transactions(
trans_number int unique primary key,
account_number int,	
trans_date date,
amount double,
descriptions varchar(255),
foreign key (account_number) references accounts(account_number)
);