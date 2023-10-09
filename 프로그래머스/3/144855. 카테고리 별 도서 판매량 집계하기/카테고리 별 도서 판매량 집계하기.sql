-- 코드를 입력하세요
SELECT category, sum(sales) as total_sales
from book natural join (select * from book_sales where to_char(sales_date,'yyyy-mm')='2022-01')
group by category
order by category asc;