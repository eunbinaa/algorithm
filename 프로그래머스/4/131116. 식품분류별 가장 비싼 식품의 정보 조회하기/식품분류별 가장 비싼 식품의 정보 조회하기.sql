
SELECT  CATEGORY, price, PRODUCT_NAME
  FROM (select CATEGORY, 
               PRICE, 
               PRODUCT_NAME, 
               ROW_NUMBER() OVER(PARTITION BY category ORDER BY price desc) AS rn 
        from FOOD_PRODUCT)
 where CATEGORY IN ('과자','국','김치','식용유') 
 and rn < 2
ORDER BY PRICE DESC;