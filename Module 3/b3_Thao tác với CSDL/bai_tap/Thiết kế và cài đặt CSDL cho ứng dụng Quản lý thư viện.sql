create database b3_bt;
use b3_bt;
create table books(
	bookNumber int not null primary key,
	bookName varchar(50) not null,
	company varchar(50) not null,
	author varchar(50) not null,
    publishYear year not null,
    publishNumber int not null,
    price double not null,
    image varchar(50),
    idCategory varchar(15) not null ,
    foreign key (idCategory) references category(idCategory)
);
create table students(
	studentNumber varchar(15) not null primary key,
	studentName varchar(50) not null,
	addressLine1 varchar(500) not null,
	email varchar(50) not null,
    image varchar(50)
);
create table category(
	idCategory varchar(15) not null primary key,
	typeCategory varchar(50) not null
);
create table borrow_orders(
	idOrder int not null auto_increment primary key,
	borrowDate date not null,
    returnDate date not null,
    status varchar(15) not null,
    studentNumber varchar(15) not null,
    bookNumber int not null,
    foreign key (studentNumber) references students(studentNumber),
    foreign key (bookNumber) references books(bookNumber)
);