-- 코드를 입력하세요
SELECT name, datetime from (select * from animal_ins order by datetime asc) 
where animal_id not in (select animal_id from animal_outs) 
and rownum<4;
