-- 코드를 입력하세요
SELECT mcdp_cd as "진료과코드", count(mcdp_cd) as "5월예약건수"
from APPOINTMENT
where to_char(apnt_ymd,'yyyy-mm')='2022-05'
group by mcdp_cd 
order by count(mcdp_cd), mcdp_cd;