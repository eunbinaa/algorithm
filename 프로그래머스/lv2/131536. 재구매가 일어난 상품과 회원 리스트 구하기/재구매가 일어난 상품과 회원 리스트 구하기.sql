-- 코드를 입력하세요
SELECT user_id, product_id
from (select user_id, product_id, count(*) as cnt from online_sale group by user_id, product_id
having count(*)>1)

order by user_id ,product_id desc;