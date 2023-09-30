-- 코드를 입력하세요
SELECT product_code, sum(sales_amount)*price as sales
from product p inner join offline_sale o
on p.product_id=o.product_id
group by o.product_id
order by sum(sales_amount)*price desc, product_code asc ; 
