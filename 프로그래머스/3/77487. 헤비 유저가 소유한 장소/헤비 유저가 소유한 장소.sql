-- 코드를 입력하세요
SELECT id, name, host_id
from(select id, 
            name, 
            host_id , 
            count(host_id) over (partition by host_id) as count
    from places)
where count >=2    
order by id asc;
    

    
    