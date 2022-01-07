Create table ISSUESLISTS
                (
                    ID  SERIAL PRIMARY KEY,
                    NAME VARCHAR(1000)
                );

Create table ISSUES
                (
                    ID  SERIAL PRIMARY KEY,
                    ISSUESLIST_ID BIGINT UNSIGNED,
                    FOREIGN KEY (ISSUESLIST_ID) REFERENCES ISSUESLISTS(ID),
                    SUMMARY VARCHAR(100),
                    DESCRIPTION VARCHAR(100) Not Null,
                    USER_ID_ASSIGNEDTO BIGINT UNSIGNED,
                    FOREIGN KEY (USER_ID_ASSIGNEDTO) REFERENCES USERS(ID)
                );
COMMIT;

INSERT INTO issueslists(NAME) VALUES ('To do');
INSERT INTO issueslists(NAME) VALUES ('In progress');
INSERT INTO issueslists(NAME) VALUES ('Done');

INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (1,'Summary 1','To do task 1', 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (1,'Summary 2','To do task 2', 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (1,'Summary 3','To do task 3', 6);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (1,'Summary 4','To do task 4', 6);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (1,'Summary 5','To do task 5', 7);

INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (2,'Summary 1','In progress task 1', 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (2,'Summary 2','In progress task 2', 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (2,'Summary 3','In progress task 3', 6);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (2,'Summary 4','In progress task 4', 7);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (2,'Summary 5','In progress task 5', 1);

INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (3,'Summary 1','Done 1', 7);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (3,'Summary 2','Done 2', 6);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (3,'Summary 3','Done 3', 4);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (3,'Summary 4','Done 4', 1);
INSERT INTO issues (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
                VALUES (3,'Summary 5','Done 5', 4);