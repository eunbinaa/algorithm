
SELECT '/home/grep/src/'||f.BOARD_ID||'/'||f.FILE_ID||f.FILE_NAME||f.FILE_EXT as "FILE_PATH"
FROM USED_GOODS_FILE f inner join (SELECT BOARD_ID, max(VIEWS) VIEWS
                                   FROM USED_GOODS_BOARD
                                   group by BOARD_ID
                                    ) b
ON f.BOARD_ID=b.BOARD_ID
WHERE b.VIEWS=(SELECT max(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY f.FILE_ID DESC;

