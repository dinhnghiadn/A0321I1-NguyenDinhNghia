create database b2_bt;
use b2_bt;
create table customers(
	customerNumber int not null primary key,
	customerName varchar(50) not null,
	contactLastName varchar(50) not null,
	contactFirstName varchar(50) not null,
    phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50),
    city varchar(50) not null,
    state varchar(50) not null,
    postalCode varchar(15) not null,
    country varchar(50) not null,
    creditLimit int,
    salesRepEmployeeNumber int not null,
    foreign key (salesRepEmployeeNumber) references employees(EmployeeNumber)

);
create table orders(
	orderNumber int not null primary key,
	orderDate date not null,
	requiredDate date not null,
	shippedDate date,
    status varchar(15) not null,
    comments text,
    quantityOrdered int not null,
    priceEach double not null,
    customerNumber int not null,
    foreign key (customerNumber) references customers(customerNumber)
);
create table payment(
	customerNumber int not null primary key,
	checkNumber  varchar(50) not null,
	paymentDate date not null,
	amount double not null,
    foreign key (customerNumber) references customers(customerNumber)
);
create table products(
	productCode  varchar(15) not null primary key,
	productName varchar(70) not null,
	productScale varchar(10) not null,
	productVendor varchar(50) not null,
    productDescription text not null,
    quantityInStock int not null,
    buyPrice double not null,
    MSRP double not null,
    productLine  varchar(50) not null,
    foreign key (productLine) references productlines(productLine)
);
create table productlines(
	productLine  varchar(50) not null primary key,
	textDescription text,
	image varchar(50)
);
create table employees(
	employeeNumber int not null primary key,
	lastName varchar(50) not null,
	firstName varchar(50) not null,
	email varchar(100) not null,
    jobTitle varchar(50) not null,
    reportTo int not null,
    foreign key (reportTo) references employees(employeeNumber),
    officeCode varchar(10) not null,
    foreign key (officeCode) references offices(officeCode)
);
create table offices(
	officeCode varchar(10) not null primary key,
	city varchar(50) not null,
	phone varchar(50) not null,
    addressLine1 varchar(50) not null,
    addressLine2 varchar(50),
    state varchar(50),
	country varchar(50) not null,
    postalCode varchar(15) not null
);
create table order_details(
	orderNumber int not null,
	productCode  varchar(15) not null,
    foreign key (productCode) references products(productCode),
    foreign key (orderNumber) references orders(orderNumber)
);