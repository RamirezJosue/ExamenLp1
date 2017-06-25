/*
Navicat MySQL Data Transfer

Source Server         : itecs
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : campaign

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-02-26 11:32:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `campaign`
-- ----------------------------
DROP TABLE IF EXISTS `campaign`;
CREATE TABLE `campaign` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(60) DEFAULT NULL,
  `descripcion` varchar(100) DEFAULT NULL,
  `estado` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of campaign
-- ----------------------------
INSERT INTO `campaign` VALUES ('1', 'ok', 'descrp', '1');
INSERT INTO `campaign` VALUES ('2', 'ok', 'dede', '1');
