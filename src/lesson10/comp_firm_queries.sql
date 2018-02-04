USE comp_firm;
-- task 1
SELECT maker, type FROM Product
WHERE type = 'Laptop'
ORDER BY maker ASC;
#2
SELECT model, ram, screen, price FROM Laptop
WHERE price > 1000 ORDER BY ram ASC, price DESC;
#3
SELECT * FROM Printer WHERE color = 'y'
ORDER BY price DESC;
#4
SELECT model, speed, hd, cd, price FROM PC
WHERE cd IN('12x', '24x') AND price < 600
ORDER BY speed DESC;
#6
SELECT * FROM PC
WHERE speed >= 500 AND price < 800
ORDER BY price DESC;
#7
SELECT * FROM Printer
WHERE type != 'Matrix' AND price < 300
ORDER BY type DESC;
#8
SELECT model, speed FROM PC
WHERE price BETWEEN 400 AND 600
ORDER BY hd;
#9
SELECT PC.model, speed, hd FROM PC, Product
WHERE (hd = 10 OR hd = 20) AND maker = 'A' AND Product.model = PC.model
ORDER BY speed;
#10
SELECT model, speed, hd, price FROM Laptop
WHERE screen >= 12
ORDER BY price DESC;
#11
SELECT model, `type`, price FROM Printer
WHERE price < 300
ORDER BY `type` DESC;
#12
SELECT model, ram, price FROM Laptop
WHERE ram = 64 ORDER BY screen;
#13
SELECT model, ram, price FROM PC WHERE ram > 64
ORDER BY hd;
#14
SELECT model, speed, price FROM PC
WHERE speed BETWEEN 500 AND 750
ORDER BY hd DESC;

-- task 2
#1
SELECT DISTINCT model FROM PC
WHERE model LIKE '%1%1%';

-- task 3:
#1
SELECT maker, type, speed, hd FROM Product, PC
WHERE hd <= 8 AND Product.model = PC.model;
#2
SELECT DISTINCT maker FROM Product, PC
WHERE speed >= 600 AND Product.model = PC.model;
#3
SELECT DISTINCT maker FROM Product JOIN Laptop ON Laptop.model = Product.model
WHERE speed <= 500;
#4
SELECT DISTINCT l1.model, l2.model, l1.hd, l1.ram
FROM Laptop AS l1 INNER JOIN Laptop AS l2 ON l1.model = l2.model
WHERE l1.hd = l2.hd AND l1.ram = l2.ram
ORDER BY l1.model DESC;
#6
SELECT DISTINCT PC.model, maker FROM PC JOIN Product ON PC.model = Product.model
WHERE price < 600;
#7
SELECT DISTINCT Printer.model, maker FROM Printer JOIN Product ON Printer.model = Product.model
WHERE price > 300;
#8
SELECT maker, PC.model, price FROM PC LEFT JOIN Product ON PC.model = Product.model
WHERE type = 'PC';
#9
SELECT maker, Product.model, price FROM PC RIGHT JOIN Product ON PC.model = Product.model
WHERE type = 'PC';
#10
SELECT maker, type, Laptop.model, speed FROM Laptop JOIN Product ON Laptop.model = Product.model
WHERE speed > 600;
    
    
    