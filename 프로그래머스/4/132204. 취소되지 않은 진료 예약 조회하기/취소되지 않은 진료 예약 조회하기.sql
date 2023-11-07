
SELECT a.apnt_no, p.pt_name, p.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from  doctor d right outer join appointment a 
     on (d.dr_id=a.mddr_id ) left outer join patient p
     on (a.pt_no=p.pt_no)
     where d.mcdp_cd='CS' and a.apnt_cncl_yn='N' and to_char(a.apnt_ymd,'yyyy-mm-dd')='2022-04-13'
     order by a.apnt_ymd asc; 