/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.7.19 : Database - e_wallet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`e_wallet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `e_wallet`;

/*Data for the table `record` */

insert  into `record`(`id`,`user_id`,`amount`,`type`,`date`) values (24,3120004944,'20.00','退款','2023-03-20 14:31:25'),(25,3120004944,'20.00','退款','2023-03-20 14:31:25'),(26,3120004944,'100.00','消费','2023-03-20 14:32:42'),(27,3120004944,'100.00','消费','2023-03-20 14:32:51'),(28,3120004944,'20.00','退款','2023-03-20 14:32:58'),(29,3120004944,'20.00','退款','2023-03-20 14:33:01'),(30,3120004944,'20.00','退款','2023-03-20 14:33:02');

/*Data for the table `wallet` */

insert  into `wallet`(`user_id`,`balance`) values (10,'2.00'),(3120004944,'10.00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
