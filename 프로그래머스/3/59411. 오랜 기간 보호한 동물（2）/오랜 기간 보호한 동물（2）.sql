-- 코드를 입력하세요
SELECT *
from (select o.animal_id, o.name from animal_ins i inner join animal_outs o 
      on o.animal_id = i.animal_id order by o.datetime-i.datetime desc)
where rownum<3      
      
;

