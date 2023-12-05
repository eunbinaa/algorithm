select user_id, nickname, city||' '|| street_address1 || ' '||street_address2 as "전체주소", 
      substr(tlno, 1,3) || '-' ||substr(tlno, 4,4) || '-'||substr(tlno, 8) as "전화번호"
from used_goods_user g inner join
(select writer_id, count(writer_id) 
from used_goods_board
group by writer_id
having count(writer_id) >=3) b
on g.user_id= b.writer_id
order by user_id desc;
