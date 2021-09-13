use classicmodels;
select * from customers; -- chọn xem toàn bộ bảng customers
select customerName, phone, city, country from customers; -- chọn xem các cột cần xem trong bảng customers
select * from customers where customerName = 'Atelier Graphique'; -- tìm customer tên theo tên
select * from customers where customerName like '%A%'; -- tìm customer có ký tự A trong tên
select * from customers where city in ('Nantes','Las Vegas','Warszawa','NYC'); -- tìm customer có city là ...
select * from orders where ordernumber between '10100' and '10110'; -- tìm order có number từ 10100 đến 10110