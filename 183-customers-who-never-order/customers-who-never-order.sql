# Write your MySQL query statement below
SELECT cus.name as Customers FROM customers as cus
left Join Orders as o on cus.id = o.customerId where o.customerId is null;