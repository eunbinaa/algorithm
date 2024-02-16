/*SELECT distinct "month",car_id, sum(count(car_id)) as "총" 
from (select case 
when to_char(start_date,'mm')=08 then '8'
when to_char(start_date,'mm')=09 then '9'
when to_char(start_date,'mm')=10 then '10'
end
as "month", CAR_ID,START_DATE, END_DATE 
      from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where to_char(start_date,'yyyy-mm')>='2022-08' )
group by "month",car_id
---having sum(count(*)) over(partition by car_id)>=5
order by "month", car_id desc
;*/
select  extract (month from START_DATE) as month, car_id, count(*) as records
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where CAR_ID IN (
    SELECT CAR_ID
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    WHERE EXTRACT(MONTH FROM START_DATE) IN (8, 9, 10) 
    GROUP BY CAR_ID
    HAVING COUNT(*) >=5 
) and extract (month from START_DATE)>=8 and extract (month from start_DATE)<=10
group by extract (month from START_DATE),car_id
having count(*)<>0
order by month, car_id desc;
