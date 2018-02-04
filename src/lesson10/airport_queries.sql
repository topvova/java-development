USE airport;
-- task 1
#24
SELECT trip_no, town_from, town_to FROM Trip
WHERE town_from = 'London' OR town_to = 'London'
ORDER BY time_out;
#25
SELECT trip_no, plane, town_from, town_to FROM Trip
WHERE plane = 'TU-134'
ORDER BY time_out DESC;
#26
SELECT trip_no, plane, town_from, town_to FROM Trip
WHERE plane != 'IL-86'
ORDER BY plane;
#27
SELECT trip_no, town_from, town_to FROM Trip
WHERE town_from != 'Rostov' AND town_to != 'Rostov'
ORDER BY plane;

-- task 2
#8
SELECT * FROM Trip
WHERE HOUR(time_out) BETWEEN 12 AND 17;
#9
SELECT * FROM Trip WHERE
  HOUR(time_in) BETWEEN 17 AND 23;
#10
SELECT date FROM Pass_in_trip
WHERE place LIKE '1_';
#11
SELECT date FROM Pass_in_trip
WHERE place LIKE '_c';
#12
SELECT name FROM Passenger
WHERE name LIKE '% C%';
#13
SELECT name FROM Passenger
WHERE substring_index(name, ' ', -2) NOT LIKE 'J%';

-- task 3
#14
SELECT DISTINCT plane, name FROM Trip JOIN Company ON Trip.ID_comp = Company.ID_comp
WHERE plane = 'Boeing';
#15
SELECT DISTINCT name, date FROM Passenger JOIN Pass_in_trip ON Passenger.ID_psg = Pass_in_trip.ID_psg;