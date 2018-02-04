USE ships;
-- task 1
#5
SELECT name, class FROM Ships
ORDER BY name;
#19
SELECT class FROM Classes
WHERE country = 'Japan'
ORDER BY type DESC;
#20
SELECT name,launched FROM Ships
WHERE launched BETWEEN 1920 AND 1942
ORDER BY launched DESC;
#21
SELECT ship, battle, result FROM Outcomes
WHERE battle = 'Guadalcanal' AND result != 'sunk'
ORDER BY ship DESC;
#22
SELECT ship, battle, result FROM Outcomes
WHERE result = 'sunk'
ORDER BY ship DESC;
#23
SELECT class, displacement FROM Classes
WHERE displacement >= 40000
ORDER BY type;

-- task 2
#4
SELECT name FROM Ships
WHERE name LIKE 'W%n';
#5
SELECT name FROM Ships
WHERE LENGTH(REPLACE(name, 'e', '$$')) - LENGTH(name) = 2;
#6
SELECT name, launched FROM Ships
WHERE name NOT LIKE '%a';
#7
SELECT name FROM Battles
WHERE name LIKE '% %' AND name NOT LIKE '% %c';

-- task 3
#5
SELECT c1.country, c1.class AS bb_class, c2.class AS bc_class FROM Classes AS c1, Classes AS c2
WHERE c1.type = 'bb' AND c2.type = 'bc' AND c1.country = c2.country;
#11
SELECT name, Ships.class, launched, displacement FROM Ships LEFT JOIN Classes ON Ships.class = Classes.class;
#12
SELECT ship, battle, date FROM Outcomes INNER JOIN Battles ON Outcomes.battle = Battles.name
WHERE result = 'OK';
#13
SELECT name, Ships.class, country FROM Ships LEFT OUTER JOIN Classes ON Ships.class = Classes.class;