create database demo;
use demo;
create table products(
	id int not null primary key,
    productCode varchar(50) not null,
	productName varchar(50) not null,
    productPrice double,
    productAmount double,
    productDescription varchar(50),
    productStatus varchar(15)
);
explain select * from products where productName = 'Ban';
alter table products add index composite(productName, productPrice);
create view product_view as select productCode, productName, productPrice, productStatus from products;
select * from product_view;
create or replace view product_view as select productCode, productName, productPrice, productStatus from products where productPrice > 30000;
drop view product_view;

-- Store proceduce lấy thông tin tất cả sản phẩm
delimiter //
create procedure findAllProduct()
begin
	select * from products;
end //
delimiter ;
call findAllProduct();

-- Store proceduce thêm một sản phẩm mới
delimiter //
create procedure addNewProduct(
	in id int,
    in productCode varchar(50),
	in productName varchar(50),
    in productPrice double,
    in productAmount double,
    in productDescription varchar(50),
    in productStatus varchar(15)
    )
begin
	insert into products values(id, productCode, productName, productPrice, productAmount, productDescription, productStatus);
end //
delimiter ;
call addNewProduct(7,'E9','Muc',20000,25000,'ChuaBan','done');

-- Store procedure sửa thông tin sản phẩm theo id
delimiter //
create procedure editProduct(in id int, in productDescription varchar(50))
begin
	update products set productDescription = productDescription where products.id = id;
end //
delimiter ;
call editProduct(7,'DaBan');

-- Store procedure xoá sản phẩm theo id
delimiter //
create procedure deleteProduct(in id int)
begin
	delete from products where products.id = id;
end //
delimiter ;
call deleteProduct(3);



    
    
