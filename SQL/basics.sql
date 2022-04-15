select * from E where voto = 24;

select * from S where ACorso = 1;

select * from S where citta = 'MO';

SELECT * FROM S WHERE acorso = 1 AND citta = 'MO';

SELECT * FROM E WHERE voto >= 24 AND voto <= 28;

SELECT * FROM E WHERE voto BETWEEN 24 AND 28;

SELECT * FROM E WHERE voto < 24 OR voto > 28;

SELECT * FROM E WHERE voto NOT BETWEEN 24 AND 28;

SELECT * FROM E WHERE voto IN (24,25,26,27,28);

SELECT * FROM E WHERE voto IN (29,30,33);

SELECT * FROM S;

SELECT * FROM S WHERE SNome LIKE ("L%");
SELECT * FROM S WHERE SNome LIKE ("%i");

SELECT * FROM S WHERE SNome LIKE ("%L%");

SELECT * FROM S WHERE citta IS NULL;

SELECT * FROM S WHERE citta LIKE "%a%";

SELECT * FROM E WHERE voto IN (24,25,26,27,28) ORDER BY voto DESC;

SELECT * FROM S WHERE citta = "MO" ORDER BY ACorso;

SELECT * FROM S WHERE citta = "MO" ORDER BY snome DESC;

SELECT * FROM S WHERE citta = "MO" ORDER BY snome DESC, acorso;

SELECT * FROM E WHERE CC = "C1" ORDER BY voto DESC, Matr;

SELECT matr, cc, data, voto, voto * 60/30 FROM E WHERE CC = "C1" ORDER BY 5 DESC, Matr;

SELECT * FROM E, S; #prodotto cartesiano

SELECT * FROM E, S WHERE E.matr = S.matr;

SELECT * FROM E, S WHERE S.SNome LIKE "Lucia%" AND E.matr = S.matr;

SELECT E.Voto, S.SNome, C.CNome, D.CNome FROM E,S,C,D
WHERE E.Matr = S.Matr
AND C.CD = D.CD
AND E.CC = C.CC
AND C.CNome LIKE 'Analisi%'
AND S.Citta = 'BO';

SELECT S.SNome, C.CNome, D.CNome
FROM S,D,C,E
WHERE S.Matr = E.Matr
AND E.CC = C.CC
AND C.CD = D.CD
AND D.Citta = 'BO'
AND E.Voto > 26;

SELECT S.SNome
FROM E,S
WHERE E.Matr = S.Matr
AND E.CC IN 
	(SELECT E.CC
	FROM E, S
	WHERE E.Matr = S.Matr
	AND S.SNome = "Lucia Quaranta");
    
SELECT D.CD
FROM D
WHERE D.CD NOT IN (
	SELECT C.CD
    FROM C, E
    WHERE E.CC = C.CC);
    
SELECT D.CD
FROM D;

SELECT D.CD
FROM D
WHERE D.CD IN (
	SELECT C.CD
    FROM C, E
    WHERE E.CC = C.CC);
    
SELECT D.CNome
FROM D
WHERE D.CD NOT IN (
	SELECT C.CD
    FROM C, E
    WHERE E.CC = C.CC);

SELECT S.SNome
FROM S
-- in or join
WHERE S.Matr IN (
	SELECT S.Matr
    FROM S, E
    WHERE E.Matr = S.Matr
    AND E.CC = "C1");
    
SELECT S.SNome
FROM S
WHERE S.Matr NOT IN (
	SELECT S.Matr
    FROM S, E
    WHERE E.Matr = S.Matr
    AND E.CC = "C1");
    