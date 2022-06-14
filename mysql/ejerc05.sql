-- Ejercicio 5.1
SELECT * FROM myTable;

SELECT postalZip, region, country FROM myTable;

-- Ejercicio 5.2
 SELECT * FROM myTable WHERE phone LIKE '(811)%';
 
 -- Ejercicio 5.3
 SELECT * FROM myTable WHERE country="Italy" OR country="Spain";
 
 -- Ejercicio 5.4
 SELECT count(*) FROM myTable;
 
  -- Ejercicio 5.5
 SELECT postalZip, region, country FROM myTable WHERE country="Turkey" OR country="Germany";
 
   -- Ejercicio 5.6
 SELECT MAX(id), MIN(id) FROM myTable;
 
   -- Ejercicio 5.7
 SELECT COUNT( DISTINCT country) AS TOTAL_COUNTRY 
	FROM myTable;
    
  -- Ejercicio 5.8
SELECT * FROM myTable ORDER BY postalZip DESC LIMIT 10;

  -- Ejercicio 5.9
  DELETE FROM myTable WHERE country='Singapore';
 
  -- Ejercicio 5.10
UPDATE myTable
	SET country = REPLACE(country,'Spain','España')
	WHERE country IS NOT NULL;
