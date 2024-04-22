-- 코드를 입력하세요
/* like '강%' : 강으로 시작하는 이름
   like '%번지': 번지로 끝나는 이름
*/
SELECT factory_id, factory_name, address from food_factory
 where address like '강%'
   order by factory_id;