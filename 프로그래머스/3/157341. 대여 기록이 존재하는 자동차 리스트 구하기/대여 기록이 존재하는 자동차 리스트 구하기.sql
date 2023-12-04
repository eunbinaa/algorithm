-- 코드를 입력하세요
SELECT distinct car_id
from car_rental_company_car c natural join car_rental_company_rental_history h
where to_char(h.start_date, 'yyyy-mm')='2022-10' and c.car_type='세단'
order by car_id desc;