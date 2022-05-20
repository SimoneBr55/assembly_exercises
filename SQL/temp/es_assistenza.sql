-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: ifts2022_ciclismo
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ciclista`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `codc` varchar(2) NOT NULL,
  `nomecliente` varchar(45) DEFAULT NULL,
  `citta` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ciclista`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES ('C1','Mario Rossi','Modena'),('C2','Luca Verdi','Firenze'),('C3','Alesandra Monzani','Modena'),('C4','Lucia Davoli','Milano'),('C5','Marco Costi','Bologna');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GARA`
--

DROP TABLE IF EXISTS `errore`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `errore` (
  `code` varchar(2) NOT NULL,
  `codc` varchar(2) NOT NULL,
  `descrizione` varchar(45) DEFAULT NULL,
  `costo` int DEFAULT NULL,
  PRIMARY KEY (`code`,`codc`),
  INDEX `FK1_idx` (`code`,`codc`),
  CONSTRAINT `codc` FOREIGN KEY `errore` (`codc`) REFERENCES `cliente` (`codc`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GARA`
--

LOCK TABLES `errore` WRITE;
/*!40000 ALTER TABLE `errore` DISABLE KEYS */;
INSERT INTO `errore` VALUES ('E1','C2','Luce rotta','4'),('E2','C1','Palla rossa','6'),('E1','C3','Palla verde','10'),('E3','C1','Elettrico','2'),('E1','C1','Meccanico','4'),('E2','C4','Non arrivato','6'),('E1','C4','Confezione incompleta','10'),('E3','C2','Indirizzo errato','2');
/*!40000 ALTER TABLE `errore` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partecipa`
--

DROP TABLE IF EXISTS `PARTECIPA`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PARTECIPA` (
  `CG` varchar(15) NOT NULL,
  `CF` varchar(15) NOT NULL,
  `Punteggio` int DEFAULT NULL,
  PRIMARY KEY (`CG`,`CF`),
  KEY `FK2_idx` (`CF`),
  CONSTRAINT `FK1` FOREIGN KEY (`CG`) REFERENCES `GARA` (`CG`),
  CONSTRAINT `FK2` FOREIGN KEY (`CF`) REFERENCES `GIOCATOREGOLF` (`CF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partecipa`
--

LOCK TABLES `PARTECIPA` WRITE;
/*!40000 ALTER TABLE `partecipa` DISABLE KEYS */;
INSERT INTO `PARTECIPA` VALUES ('G1','C1','25'),('G1','C3','10'),('G2','C4','13'),('G2','C3','20'),('G3','C5','12'),('G4','C3','16'),('G5','C2','36');
/*!40000 ALTER TABLE `partecipa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ifts2022_ciclismo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-26 17:08:18
