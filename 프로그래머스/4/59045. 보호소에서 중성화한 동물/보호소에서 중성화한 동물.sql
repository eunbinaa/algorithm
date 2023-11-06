
SELECT O.ANIMAL_ID, O.ANIMAL_TYPE, O.NAME
from ANIMAL_INS i inner join ANIMAL_OUTS o 
on i.ANIMAL_ID = o.ANIMAL_ID
WHERE i.sex_upon_intake like 'Intact%' 
and( o.sex_upon_outcome like 'Spayed%' 
or o.sex_upon_outcome like 'Neutered%')
ORDER BY ANIMAL_ID ASC;