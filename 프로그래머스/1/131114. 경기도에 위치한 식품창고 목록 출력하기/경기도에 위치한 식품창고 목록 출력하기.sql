SELECT WAREHOUSE_ID, WAREHOUSE_NAME, ADDRESS, CASE FREEZER_YN WHEN NULL THEN 'N' 
                                                                   WHEN 'Y' THEN 'Y' 
                                                                   ELSE 'N' END AS FREEZER_YN
FROM FOOD_WAREHOUSE
WHERE ADDRESS LIKE '경기도%'
ORDER BY WAREHOUSE_ID ASC;