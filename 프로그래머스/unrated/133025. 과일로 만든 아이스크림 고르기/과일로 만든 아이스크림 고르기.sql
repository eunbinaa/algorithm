-- 코드를 입력하세요
SELECT flavor from first_half natural join icecream_info 
     where INGREDIENT_TYPE = 'fruit_based' 
      and total_order > 3000      
      order by total_order desc;