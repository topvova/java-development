USE secondary_raw_firm;
-- task 1
#15
SELECT * FROM Outcome_o
WHERE `out` > 2000
ORDER BY date DESC;
#16
SELECT * FROM Income_o
WHERE inc BETWEEN 5000 AND 10000
ORDER BY inc;
#17
SELECT * FROM Income
WHERE point = 1
ORDER BY inc;
#18
SELECT * FROM Outcome
WHERE point = 2
ORDER BY `out`;

-- task 2
#2
SELECT * FROM Outcome
WHERE MONTH(date) = 3;
#3
SELECT * FROM Outcome_o
WHERE DAY(date) = 14;