
      
select WRITER_ID, nickname, sum(b.price) as "total_sales"
      from used_goods_board b join used_goods_user u 
      on b.writer_id=u.user_id
      where b.status='DONE'
      group by WRITER_ID, nickname
      having sum(b.price)>=700000
      order by "total_sales";
      