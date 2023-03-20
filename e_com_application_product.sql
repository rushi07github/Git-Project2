-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: e_com_application
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `categoryid` int NOT NULL,
  `productid` int NOT NULL,
  `productname` varchar(100) NOT NULL,
  `productdescription` varchar(100) NOT NULL,
  `productprice` int NOT NULL,
  `quantity` int NOT NULL,
  PRIMARY KEY (`productid`),
  UNIQUE KEY `productid_UNIQUE` (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (123,1,'IPhone14','ROM 128GB , RAM 6GB ,A15Biaonic chipset',59999,10),(123,2,'OnePlus9','ROM 128GB , RAM 8GB ,Snapdragon 855',29999,7),(123,3,'Realme 9Pro','ROM 264GB , RAM 8GB ,Snapdragon 695',17999,12),(124,4,'HP 15s-fq5111TU','ROM 512GB SSD , RAM 8GB ,12th Gen Core i5',58490,5),(124,5,'Asus TUF Gaming A15','ROM 512GB SSD , RAM 16GB ,AMD Ryzen 7 6800H',85990,7),(124,6,'Apple MacBook Air 2022 Laptop','ROM 256GB , RAM 8GB ,MacOS',108490,4),(124,7,'MSI Alpha 15 B5EEK-235IN Laptop','ROM 512GB SSD , RAM 8GB ,Ryzen 7 5800H /8GB',75990,5),(125,8,'Boat Airdopes 121 Pro','Wireless ,TalkTime : 32hr ,Charging Time : 2hr',1499,15),(125,9,'Samsung Galaxy Buds2Pro','Wireless ,TalkTime : 30hr ,Charging Time : 2.30hr',5999,12),(125,10,'Oppo Ecco X2','Wireless ,TalkTime : 40hr ,Charging Time : 2.hr',3499,7);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-21  0:24:30
