# Write your MySQL query statement below
Select dep.name as department, emp.name as Employee, Salary
from employee as emp join department
as dep on dep.id = emp.departmentId
where emp.salary = (
    Select MAX(salary) from employee where departmentId = emp.departmentId
)