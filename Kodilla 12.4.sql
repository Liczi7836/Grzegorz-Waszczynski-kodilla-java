SELECT U.DESCRIPTION AS TaskName, P.NAME AS TaskListName
FROM issues U JOIN issueslists P ON U.ISSUESLIST_ID = P.ID
GROUP BY U.ID;

SELECT U.DESCRIPTION AS TaskName, P.FIRSTNAME, P.LASTNAME
FROM issues U JOIN users P ON U.USER_ID_ASSIGNEDTO = P.ID
GROUP BY U.ID;

SELECT U.LASTNAME, U.FIRSTNAME, COUNT(*) AS TASK_NUMBER
FROM users U JOIN issues i on U.ID = i.USER_ID_ASSIGNEDTO
GROUP BY U.ID
HAVING COUNT(*) >= 1;
