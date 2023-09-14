-- 코드를 입력하세요
SELECT 
case 
when to_char(datetime,'hh24')='09' then 9
when to_char(datetime,'hh24')='10' then 10
when to_char(datetime,'hh24')='11' then 11
when to_char(datetime,'hh24')='12' then 12
when to_char(datetime,'hh24')='13' then 13
when to_char(datetime,'hh24')='14' then 14
when to_char(datetime,'hh24')='15' then 15
when to_char(datetime,'hh24')='16' then 16
when to_char(datetime,'hh24')='17' then 17
when to_char(datetime,'hh24')='18' then 18
when to_char(datetime,'hh24')='19' then 19
end as hour, count(*) as count
from animal_outs
group by to_char(datetime,'hh24')
having to_char(datetime,'hh24') >=9 and to_char(datetime,'hh24')<= 19
order by to_char(datetime,'hh24');
