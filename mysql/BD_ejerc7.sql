-- Ejercicio 7
DROP DATABASE IF EXISTS countrys;
CREATE DATABASE IF NOT EXISTS countrys;
USE countrys;
-- SHOW databases;

CREATE TABLE country (
	country_id SMALLINT unsigned primary key auto_increment,
    country VARCHAR(50),
    last_update TIMESTAMP
);

CREATE TABLE city (
	city_id SMALLINT unsigned primary key auto_increment,
	city VARCHAR(50) NOT NULL,
    country_id SMALLINT unsigned,
    last_update TIMESTAMP,
    FOREIGN KEY (country_id) REFERENCES country (country_id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE address (
	address_id SMALLINT unsigned primary key auto_increment,
    address VARCHAR(50) NOT NULL,
    address2 VARCHAR(50) NOT NULL,
    district VARCHAR(20) NOT NULL,
    city_id SMALLINT unsigned,
    postal_code VARCHAR(10),
    phone VARCHAR(20),
    location VARCHAR(50),
    last_update TIMESTAMP,
	FOREIGN KEY (city_id) REFERENCES city (city_id)
	ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO country (country, last_update) VALUES 
("ESPAÑA","19970516"),
("FRANCIA","19970516"),
("ALEMANIA","19970516"),
("PORTUGAL","19970516"),
("REINO UNIDO","19970516"),
("SUECIA","19970516"),
("TURQUÍA","19970516"),
("NORUEGA","19970516"),
("SUIZA","19970516"),
("ISLANDIA","19970516");

INSERT INTO city (city, country_id, last_update) VALUES 
("ESPAÑA",1,"19970516"),
("FRANCIA",2,"19970516"),
("ALEMANIA",3,"19970516"),
("PORTUGAL",4,"19970516"),
("REINO UNIDO",5,"19970516"),
("SUECIA",6,"19970516"),
("TURQUÍA",7,"19970516"),
("NORUEGA",8,"19970516"),
("SUIZA",9,"19970516"),
("ISLANDIA",10,"19970516");

INSERT INTO address (address, address2, district, city_id, postal_code, phone, location, last_update) VALUES 
("bb","cc","dd",1,"33000","677","ff","19970516"),
("bb","cc","dd",2,"33000","677","ff","19970516"),
("bb","cc","dd",3,"33000","677","ff","19970516"),
("bb","cc","dd",4,"33000","677","ff","19970516"),
("bb","cc","dd",5,"33000","677","ff","19970516"),
("bb","cc","dd",6,"33000","677","ff","19970516"),
("bb","cc","dd",7,"33000","677","ff","19970516"),
("bb","cc","dd",8,"33000","677","ff","19970516"),
("bb","cc","dd",9,"33000","677","ff","19970516"),
("bb","cc","dd",10,"33000","677","ff","19970516");

SELECT * FROM country
INNER JOIN city
ON city.country_id=country.country_id
INNER JOIN address
ON city.city_id=address.city_id;
