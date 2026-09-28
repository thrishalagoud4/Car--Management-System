-- THRISHA CARZONE - Car Rental Management System
-- MySQL 8.0+
-- No real MySQL password is stored in this file.

CREATE DATABASE IF NOT EXISTS car_project;
USE car_project;

DROP TABLE IF EXISTS bookings;
DROP TABLE IF EXISTS cars;

CREATE TABLE cars (
    car_id INT PRIMARY KEY,
    brand VARCHAR(100) NOT NULL,
    model VARCHAR(100) NOT NULL,
    price DECIMAL(12,2) NOT NULL,
    fuel VARCHAR(50) NOT NULL,
    transmission VARCHAR(50) NOT NULL,
    year INT NOT NULL,
    color VARCHAR(50) NOT NULL,
    mileage DECIMAL(10,2) NOT NULL,
    engine VARCHAR(100) NOT NULL,
    seats INT NOT NULL,
    car_type VARCHAR(50) NOT NULL
);

CREATE TABLE bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(100) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    car_id INT NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_booking_car FOREIGN KEY (car_id) REFERENCES cars(car_id)
        ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT INTO cars (car_id,brand,model,price,fuel,transmission,year,color,mileage,engine,seats,car_type) VALUES
(101,'Toyota','Fortuner',3500000,'Diesel','Automatic',2024,'White',14.5,'2.8L',7,'SUV'),
(102,'Mahindra','Scorpio N',2200000,'Diesel','Manual',2024,'Black',15,'2.2L',7,'SUV'),
(103,'Kia','Seltos',1800000,'Petrol','Automatic',2024,'Red',17,'1.5L',5,'SUV'),
(104,'Hyundai','Creta',1750000,'Petrol','Automatic',2024,'Blue',17.4,'1.5L',5,'SUV'),
(105,'Tata','Nexon',1450000,'Petrol','Manual',2024,'White',17.5,'1.2L',5,'SUV'),
(106,'Mahindra','Thar',1800000,'Diesel','Manual',2024,'Red',15.2,'2.2L',4,'SUV'),
(107,'MG','Astor',1650000,'Petrol','Automatic',2023,'Grey',15.5,'1.5L',5,'SUV'),
(108,'Volkswagen','Taigun',1750000,'Petrol','Automatic',2024,'Black',18,'1.5L',5,'SUV'),
(109,'Skoda','Kushaq',1800000,'Petrol','Automatic',2024,'Silver',17.8,'1.5L',5,'SUV'),
(110,'Mahindra','XUV700',2800000,'Diesel','Automatic',2024,'Black',16,'2.2L',7,'XUV'),
(111,'Tata','Harrier',2600000,'Diesel','Automatic',2024,'Grey',16.8,'2.0L',5,'XUV'),
(112,'Tata','Safari',2800000,'Diesel','Automatic',2024,'Blue',16.5,'2.0L',7,'XUV'),
(113,'Hyundai','Alcazar',2200000,'Diesel','Automatic',2024,'White',17,'1.5L',7,'XUV'),
(114,'Kia','Carens',2100000,'Diesel','Automatic',2024,'Silver',16.2,'1.5L',7,'XUV'),
(115,'Jeep','Compass',3000000,'Diesel','Automatic',2023,'Black',15.5,'2.0L',5,'XUV'),
(116,'MG','Hector',2400000,'Petrol','Automatic',2024,'Red',14,'1.5L',5,'XUV'),
(117,'Mahindra','XUV500',2100000,'Diesel','Manual',2022,'White',15.1,'2.2L',7,'XUV'),
(118,'Honda','City',1600000,'Petrol','Automatic',2024,'White',18,'1.5L',5,'SEDAN'),
(119,'Hyundai','Verna',1700000,'Petrol','Automatic',2024,'Black',19,'1.5L',5,'SEDAN'),
(120,'Maruti','Ciaz',1400000,'Petrol','Manual',2023,'Brown',20,'1.5L',5,'SEDAN'),
(121,'Skoda','Slavia',1800000,'Petrol','Automatic',2024,'Blue',19.5,'1.5L',5,'SEDAN'),
(122,'Volkswagen','Virtus',1850000,'Petrol','Automatic',2024,'White',18.8,'1.5L',5,'SEDAN'),
(123,'Toyota','Camry',4800000,'Hybrid','Automatic',2024,'Silver',19,'2.5L',5,'SEDAN'),
(124,'Honda','Amaze',1100000,'Petrol','Manual',2023,'Grey',18.5,'1.2L',5,'SEDAN'),
(125,'Hyundai','Aura',900000,'Petrol','Manual',2024,'Red',20,'1.2L',5,'SEDAN'),
(126,'Tata','Tigor',950000,'Petrol','Manual',2023,'Blue',19.3,'1.2L',5,'SEDAN'),
(127,'Toyota','Innova Crysta',2800000,'Diesel','Automatic',2024,'White',15.6,'2.4L',7,'MUV'),
(128,'Toyota','Innova Hycross',3200000,'Hybrid','Automatic',2024,'Black',21.1,'2.0L',7,'MUV'),
(129,'Maruti','Ertiga',1500000,'Petrol','Manual',2024,'Silver',20.3,'1.5L',7,'MUV'),
(130,'Kia','Carnival',3500000,'Diesel','Automatic',2023,'Grey',14,'2.2L',7,'MUV'),
(131,'Renault','Triber',950000,'Petrol','Manual',2024,'Red',19,'1.0L',7,'MUV'),
(132,'Maruti','XL6',1600000,'Petrol','Automatic',2024,'Blue',20,'1.5L',6,'MUV'),
(133,'Mahindra','Marazzo',1700000,'Diesel','Manual',2023,'White',17.3,'1.5L',7,'MUV'),
(134,'Kia','Carens Clavis',2200000,'Petrol','Automatic',2025,'Black',16.5,'1.5L',7,'MUV'),
(135,'Maruti','Swift',900000,'Petrol','Manual',2024,'Red',22.4,'1.2L',5,'HATCHBACK'),
(136,'Maruti','Baleno',950000,'Petrol','Manual',2024,'Blue',22.3,'1.2L',5,'HATCHBACK'),
(137,'Hyundai','i20',1050000,'Petrol','Manual',2024,'White',20,'1.2L',5,'HATCHBACK'),
(138,'Tata','Altroz',1000000,'Petrol','Manual',2024,'Grey',19,'1.2L',5,'HATCHBACK'),
(139,'Tata','Tiago',800000,'Petrol','Manual',2023,'Red',20,'1.2L',5,'HATCHBACK'),
(140,'Maruti','Wagon R',750000,'Petrol','Manual',2024,'Silver',24,'1.0L',5,'HATCHBACK'),
(141,'Maruti','Ignis',800000,'Petrol','Manual',2023,'Orange',20,'1.2L',5,'HATCHBACK'),
(142,'Hyundai','Grand i10 Nios',850000,'Petrol','Manual',2024,'Blue',18,'1.2L',5,'HATCHBACK'),
(143,'BMW','3 Series',6500000,'Petrol','Automatic',2024,'Black',16,'2.0L',5,'LUXURY'),
(144,'Mercedes','C-Class',7000000,'Petrol','Automatic',2024,'White',15.5,'2.0L',5,'LUXURY'),
(145,'Audi','A4',6200000,'Petrol','Automatic',2024,'Blue',17,'2.0L',5,'LUXURY'),
(146,'BMW','X5',10500000,'Diesel','Automatic',2024,'Grey',12,'3.0L',5,'LUXURY'),
(147,'Mercedes','GLE',11000000,'Diesel','Automatic',2024,'Black',11.5,'3.0L',5,'LUXURY'),
(148,'Audi','Q7',9500000,'Petrol','Automatic',2024,'White',12.5,'3.0L',7,'LUXURY'),
(149,'Volvo','XC90',10000000,'Hybrid','Automatic',2024,'Silver',14,'2.0L',7,'LUXURY'),
(150,'Jaguar','F-Pace',8500000,'Petrol','Automatic',2023,'Green',13,'2.0L',5,'LUXURY');

-- Optional sample bookings
INSERT INTO bookings (customer_name,phone,car_id) VALUES
('Rahul','9876543210',101),
('Priya','9876501234',104),
('Arjun','9123456780',135);

-- FINDING / SEARCH QUERIES
SELECT * FROM cars;
SELECT * FROM cars WHERE car_id = 101;
SELECT * FROM cars WHERE brand = 'Toyota';
SELECT * FROM cars WHERE model = 'Creta';
SELECT * FROM cars WHERE fuel = 'Petrol';
SELECT * FROM cars WHERE transmission = 'Automatic';
SELECT * FROM cars WHERE car_type = 'SUV';
SELECT * FROM cars WHERE price < 2000000;
SELECT * FROM cars WHERE price BETWEEN 1000000 AND 2000000;
SELECT * FROM cars WHERE seats = 7;
SELECT * FROM cars WHERE mileage > 20;
SELECT * FROM cars WHERE year = 2024;
SELECT * FROM cars WHERE brand LIKE '%Mahindra%';
SELECT * FROM cars WHERE model LIKE '%Innova%';
SELECT * FROM cars WHERE fuel='Diesel' AND transmission='Automatic';
SELECT * FROM cars WHERE transmission='Automatic' AND price < 2000000;
SELECT * FROM cars WHERE seats=7 AND fuel='Diesel';
SELECT * FROM cars ORDER BY price ASC;
SELECT * FROM cars ORDER BY price DESC;
SELECT * FROM cars ORDER BY price ASC LIMIT 1;
SELECT * FROM cars ORDER BY price DESC LIMIT 1;
SELECT COUNT(*) AS total_cars FROM cars;
SELECT car_type, COUNT(*) AS total FROM cars GROUP BY car_type ORDER BY total DESC;

SELECT b.booking_id,b.customer_name,b.phone,c.car_id,c.brand,c.model,c.price,c.car_type,c.year,b.booking_date
FROM bookings b INNER JOIN cars c ON b.car_id=c.car_id
ORDER BY b.booking_id DESC;

SELECT * FROM bookings WHERE customer_name='Rahul';

SELECT b.booking_id,b.customer_name,b.phone,c.car_id,c.brand,c.model,c.price,c.car_type,c.year,b.booking_date
FROM bookings b INNER JOIN cars c ON b.car_id=c.car_id
WHERE b.customer_name LIKE '%Rahul%'
   OR b.phone LIKE '%987%'
   OR c.brand LIKE '%Toyota%'
   OR c.model LIKE '%Fortuner%';
