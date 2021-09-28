use classicmodels;
-- Tham số loại IN
delimiter //
create procedure getCusById( in cusNum int(11))
begin 
	select * from customers where customerNumber = cusNum;
end //
delimiter ;
call getCusById(175);

-- Tham số loại OUT
delimiter //
create procedure GetCustomersCountByCity( in in_city varchar(50), out total int)
begin 
	select count(customerNumber) into total from customers where city = in_city;
end //
delimiter ;
set @total = 8;
call GetCustomersCountByCity('Lyon',@total);
select @total;

-- Tham số loại INOUT

delimiter //
create procedure SetCounter( inout counter int, in inc int)
begin 
	set counter = counter + inc;
end //
delimiter ;

set @counter = 1;
call SetCounter(@counter,1); -- 2
call SetCounter(@counter,1); -- 3
call SetCounter(@counter,5); -- 8
select @counter;

