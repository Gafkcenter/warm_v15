/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50622
Source Host           : localhost:3306
Source Database       : fhadmin

Target Server Type    : MYSQL
Target Server Version : 50622
File Encoding         : 65001

Date: 2016-09-17 15:30:44
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `visitorcount`
-- ----------------------------
DROP TABLE IF EXISTS `visitorcount`;
CREATE TABLE `visitorcount` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uri` varchar(100) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  `visitorTimes` bigint(20) DEFAULT NULL,
  `updateTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `visitorUser` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitorcount
-- ----------------------------
INSERT INTO `visitorcount` VALUES ('3', '/warm/teacher/save', '127.0.0.1', '5', '2016-09-17 14:21:12', '2016-09-17 14:21:11', null);
INSERT INTO `visitorcount` VALUES ('4', '/warm/teacher/listexample', '127.0.0.1', '25', '2016-09-17 15:10:34', '2016-09-17 15:10:33', null);
INSERT INTO `visitorcount` VALUES ('5', '/warm/teacher/update/46', '127.0.0.1', '11', '2016-09-17 14:54:48', '2016-09-17 14:54:48', null);
INSERT INTO `visitorcount` VALUES ('6', '/warm/teacher/update/44', '127.0.0.1', '1', '2016-09-17 15:06:18', '2016-09-17 15:06:18', null);

-- ----------------------------
-- Table structure for `visitorlog`
-- ----------------------------
DROP TABLE IF EXISTS `visitorlog`;
CREATE TABLE `visitorlog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uri` varchar(100) DEFAULT NULL,
  `timeCycle` double DEFAULT NULL,
  `userAgent` varchar(500) DEFAULT NULL,
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `createUser` varchar(50) DEFAULT NULL,
  `userIp` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitorlog
-- ----------------------------
INSERT INTO `visitorlog` VALUES ('1', null, '1474092179145', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:02:59', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('2', '/warm/teacher/save', '1474092414150', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:06:54', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('3', '/warm/teacher/save', '1474092438065', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:07:18', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('4', '/warm/teacher/save', '4057', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:20:02', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('5', '/warm/teacher/save', '344', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:21:00', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('6', '/warm/teacher/save', '163', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:21:05', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('7', '/warm/teacher/save', '105', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:21:12', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('8', '/warm/teacher/listexample', '935', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:24', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('9', '/warm/teacher/listexample', '95', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:38', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('10', '/warm/teacher/listexample', '102', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:41', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('11', '/warm/teacher/listexample', '67', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:42', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('12', '/warm/teacher/listexample', '62', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:43', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('13', '/warm/teacher/listexample', '59', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:44', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('14', '/warm/teacher/listexample', '104', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:44', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('15', '/warm/teacher/listexample', '64', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:44', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('16', '/warm/teacher/listexample', '57', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:45', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('17', '/warm/teacher/listexample', '81', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:35:45', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('18', '/warm/teacher/listexample', '4424', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:45:54', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('19', '/warm/teacher/update/46', '1061', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:50:14', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('20', '/warm/teacher/listexample', '116', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:50:14', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('21', '/warm/teacher/update/46', '211', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:14', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('22', '/warm/teacher/listexample', '118', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:14', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('23', '/warm/teacher/update/46', '148', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:18', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('24', '/warm/teacher/listexample', '105', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:18', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('25', '/warm/teacher/update/46', '3596', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:24', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('26', '/warm/teacher/listexample', '112', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:25', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('27', '/warm/teacher/update/46', '120', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:27', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('28', '/warm/teacher/listexample', '68', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:27', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('29', '/warm/teacher/update/46', '119', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:30', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('30', '/warm/teacher/listexample', '57', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:30', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('31', '/warm/teacher/update/46', '150', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:33', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('32', '/warm/teacher/listexample', '78', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:33', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('33', '/warm/teacher/update/46', '142', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:36', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('34', '/warm/teacher/listexample', '58', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:36', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('35', '/warm/teacher/update/46', '138', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:39', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('36', '/warm/teacher/listexample', '69', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:40', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('37', '/warm/teacher/update/46', '168', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:44', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('38', '/warm/teacher/listexample', '64', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:45', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('39', '/warm/teacher/update/46', '108', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:48', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('40', '/warm/teacher/listexample', '56', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 14:54:48', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('41', '/warm/teacher/update/44', '1031', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 15:06:18', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('42', '/warm/teacher/listexample', '129', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 15:06:18', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('43', '/warm/teacher/listexample', '201', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 15:10:02', null, '127.0.0.1');
INSERT INTO `visitorlog` VALUES ('44', '/warm/teacher/listexample', '101', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:51.0) Gecko/20100101 Firefox/51.0', '2016-09-17 15:10:34', null, '127.0.0.1');
