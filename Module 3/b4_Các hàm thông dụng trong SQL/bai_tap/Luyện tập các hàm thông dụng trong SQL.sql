use test2;
create table students(
	id int not null,
	ten varchar(50) not null,
	tuoi int not null,
	khoaHoc varchar(50),
    soTien double not null
);
insert into students values (1,'Hoang',21,'CNTT',400000);
insert into students values (2,'Viet',19,'DTVT',320000);
insert into students values (3,'Thanh',18,'KTDN',400000);
insert into students values (4,'Nhan',19,'CK',450000);
insert into students values (5,'Huong',20,'TCNH',500000);
insert into students values (5,'Huong',20,'TCNH',200000);

select * from students where ten = 'Huong';
select id, ten, sum(soTien) as 'Tong tien' from students where ten = 'Huong';
select id, ten, tuoi from students group by ten;