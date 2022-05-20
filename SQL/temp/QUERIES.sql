SELECT DISTINCT GIOCATOREGOLF.*
FROM GIOCATOREGOLF, PARTECIPA, GARA
WHERE GIOCATOREGOLF.CF = PARTECIPA.CF
AND GARA.CG = PARTECIPA.CG
AND GARA.LIVELLO = 2
;


SELECT GARA.*
FROM GARA
WHERE GARA.CG NOT IN (
  SELECT GARA.CG
  FROM GIOCATOREGOLF, PARTECIPA, GARA
  WHERE GIOCATOREGOLF.CF LIKE PARTECIPA.CF
  AND GARA.CG LIKE PARTECIPA.CG
  AND GIOCATOREGOLF.NAZIONE LIKE 'Italia'
);

SELECT GARA.CG, GARA.NOMECAMPO, GIOCATOREGOLF.NAZIONE, COUNT(*) AS NUM_GIOC
FROM GARA, GIOCATOREGOLF, PARTECIPA
WHERE GIOCATOREGOLF.CF = PARTECIPA.CF
AND GARA.CG = PARTECIPA.CG
GROUP BY GARA.CG, GIOCATOREGOLF.NAZIONE
ORDER BY NUM_GIOC DESC
;

SELECT GARA.CG, GARA.NOMECAMPO, GIOCATOREGOLF.NAZIONE, COUNT(*) AS NUM_GIOC
FROM GARA, GIOCATOREGOLF, PARTECIPA
WHERE GIOCATOREGOLF.CF = PARTECIPA.CF
AND GARA.CG = PARTECIPA.CG
GROUP BY GARA.CG, GIOCATOREGOLF.NAZIONE
HAVING COUNT(*) >= ALL (SELECT COUNT(*)
  FROM GIOCATOREGOLF, PARTECIPA P1
  WHERE GIOCATOREGOLF.CF = P1.CF
  AND P1.CG = GARA.CG
  GROUP BY GIOCATOREGOLF.NAZIONE
)
;



select cliente.*
from cliente, errore
where cliente.codc = errore.codc
and errore.code like 'E1';


SELECT DISTINCT cliente.citta
FROM cliente, errore
where cliente.codc not in
(select cliente.codc from cliente, errore
  where cliente.codc = errore.codc
  and errore.code like 'E1');


SELECT errore.code, COUNT(*) AS NUM_INTERVENTI
FROM errore, cliente
WHERE cliente.codc = errore.codc
GROUP BY errore.code
ORDER BY NUM_INTERVENTI DESC;


SELECT cliente.citta, sum(costo) as totale
FROM errore, cliente
WHERE cliente.codc = errore.codc
GROUP BY cliente.citta
ORDER BY totale DESC;


-- select errore.costo
-- from errore, cliente
-- group by errore.codc;
--
--
-- select cliente.codc, errore.costo
-- from errore, cliente
-- where cliente.codc = errore.codc
-- group by errore.codc, errore.costo
-- having sum(costo) = ALL (select sum(costo)
--   from errore, cliente
--   where errore.codc = cliente.codc
--   group by cliente.codc
-- );

SELECT errore.codc, sum(costo) as totale
FROM errore
group by errore.codc
having totale >= ALL (select sum(costo) from errore group by errore.codc);
