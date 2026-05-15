CREATE TABLE Student (
    ID VARCHAR (8000) UNIQUE,
    NAME VARCHAR (8000),
    ADDRESS VARCHAR (8000),
    PRIMARY KEY (ID)

);

CREATE TABLE Subject (
  ID VARCHAR ()
);

SELECT salary AS SecondHighestSalary
FROM (
         SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) as salary_rank
         FROM employee
     ) AS ranked_salaries
WHERE salary_rank = 2;

---
SELECT SALARY as FourthHighestSalary
FROM (
        SELECT SALARY, DENSE_RANK() OVER (ORDER BY SALARY DESC) AS SALARY_RANK
        FROM EMPLOYEE
     ) AS RANKED_SALARIES
WHERE SALARY_RANK = 4;





