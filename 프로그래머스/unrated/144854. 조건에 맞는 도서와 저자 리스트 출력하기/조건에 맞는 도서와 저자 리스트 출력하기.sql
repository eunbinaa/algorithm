-- 코드를 입력하세요
SELECT book_id, author_name, to_char(published_date,'yyyy-mm-dd') as published_date
from book, author 
where book.author_id=author.author_id 
and category='경제' 
order by published_date;