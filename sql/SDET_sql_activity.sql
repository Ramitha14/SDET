create database sdet4_ramitha;
use sdet4_ramitha;
CREATE TABLE salesman (
    salesman_id int primary key,
    name varchar(32),
    city varchar(32),
    commission int
);

desc salesman;

INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);

select * from salesman;

INSERT INTO salesman VALUES
    (5002, 'Nail Knite', 'Paris', 13),
    (5005, 'Pit Alex', 'London', 11), 
    (5006, 'McLyon', 'Paris', 14), 
    (5007, 'Paul Adam', 'Rome', 13),
    (5003, 'Lauson Hen', 'San Jose', 12);
    
    SELECT salesman_id, city FROM salesman;
    
    SELECT * FROM salesman WHERE city='Paris';
    
    SELECT salesman_id, commission FROM salesman WHERE name='Paul Adam';
    
    ALTER TABLE salesman ADD grade int;
    
    UPDATE salesman SET grade=100;
    
    UPDATE salesman SET grade=200 WHERE city='Rome';
    
    UPDATE salesman SET grade=300 WHERE name='James Hoog';
    
    UPDATE salesman SET name='Pierre' WHERE name='McLyon';
    
    create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);
    
    insert into orders values
(70001, 150.5, '2012-10-05', 3005, 5002), (70009, 270.65, '2012-09-10', 3001, 5005),
(70002, 65.26, '2012-10-05', 3002, 5001), (70004, 110.5, '2012-08-17', 3009, 5003),
(70007, 948.5, '2012-09-10', 3005, 5002), (70005, 2400.6, '2012-07-27', 3007, 5001),
(70008, 5760, '2012-08-15', 3002, 5001), (70010, 1983.43, '2012-10-10', 3004, 5006),
(70003, 2480.4, '2012-10-10', 3009, 5003), (70012, 250.45, '2012-06-27', 3008, 5002),
(70011, 75.29, '2012-08-17', 3003, 5007), (70013, 3045.6, '2012-04-25', 3002, 5001);

select distinct salesman_id from orders;

select order_no, order_date from orders order by order_date;

select order_no, purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount between 1000 and 2000;







    
    
