-- 코드를 입력하세요
SELECT g.title, 
       g.board_id,
       r.reply_id, 
       r.writer_id, 
       r.contents, 
       to_char(r.created_date,'yyyy-mm-dd') as created_date
    from used_goods_board g inner join used_goods_reply r
        on g.board_id=r.board_id
        /*원하는 컬럼만 지정해서 조인하고 싶을 때 inner join ~ on 지정컬럼 사용 (이때 컬럼명은 무조건 별칭이 있어야됨)*/
       where to_char(g.created_date,'yyyy-mm')='2022-10' 
         order by r.created_date asc, g.title asc;