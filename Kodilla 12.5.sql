INSERT INTO posts(USER_ID, BODY)
VALUES (4,'Do something');

COMMIT;

UPDATE posts
set BODY = 'To delete'
where ID = 9;

COMMIT;

DELETE FROM posts
where ID = 9;

COMMIT;