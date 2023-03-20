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

/*Table structure for table `record` */

DROP TABLE IF EXISTS `record`;

CREATE TABLE `record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(10) NOT NULL,
  `amount` decimal(10,2) DEFAULT NULL,
  `type` enum('消费','退款') DEFAULT NULL COMMENT '状态 1:消费 2:退款',
  `date` datetime DEFAULT NULL COMMENT '订单时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

/*Data for the table `record` */

insert  into `record`(`id`,`user_id`,`amount`,`type`,`date`) values (17,3120004944,'20.00','退款','2023-03-20 14:31:22'),(18,3120004944,'20.00','退款','2023-03-20 14:31:24'),(19,3120004944,'20.00','退款','2023-03-20 14:31:24'),(20,3120004944,'20.00','退款','2023-03-20 14:31:24'),(21,3120004944,'20.00','退款','2023-03-20 14:31:25'),(22,3120004944,'20.00','退款','2023-03-20 14:31:25'),(23,3120004944,'20.00','退款','2023-03-20 14:31:25'),(24,3120004944,'20.00','退款','2023-03-20 14:31:25'),(25,3120004944,'20.00','退款','2023-03-20 14:31:25'),(26,3120004944,'100.00','消费','2023-03-20 14:32:42'),(27,3120004944,'100.00','消费','2023-03-20 14:32:51'),(28,3120004944,'20.00','退款','2023-03-20 14:32:58'),(29,3120004944,'20.00','退款','2023-03-20 14:33:01'),(30,3120004944,'20.00','退款','2023-03-20 14:33:02'),(31,3120004944,'20.00','退款','2023-03-20 14:33:02'),(32,3120004944,'20.00','退款','2023-03-20 14:33:02'),(33,3120004944,'20.00','退款','2023-03-20 14:33:02'),(34,3120004944,'100.00','消费','2023-03-20 14:33:16'),(35,3120004944,'20.00','退款','2023-03-20 14:33:23'),(36,3120004944,'100.00','消费','2023-03-20 14:33:25'),(37,3120004944,'20.00','退款','2023-03-20 14:33:27'),(38,3120004944,'20.00','退款','2023-03-20 14:33:28'),(39,3120004944,'20.00','退款','2023-03-20 14:33:28'),(40,3120004944,'20.00','退款','2023-03-20 14:33:29'),(41,3120004944,'20.00','退款','2023-03-20 14:33:29'),(42,3120004944,'100.00','消费','2023-03-20 14:33:31');

/*Table structure for table `wallet` */

DROP TABLE IF EXISTS `wallet`;

CREATE TABLE `wallet` (
  `user_id` bigint(100) NOT NULL,
  `balance` decimal(10,2) NOT NULL DEFAULT '0.00',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `wallet` */

insert  into `wallet`(`user_id`,`balance`) values (10,'2.00'),(3120004944,'10.00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
