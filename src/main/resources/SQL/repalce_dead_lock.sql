/*
 Navicat MySQL Data Transfer

 Source Server         : localdb
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : spring_boot_mybatis

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 19/09/2019 10:56:00
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for repalce_dead_lock
-- ----------------------------
DROP TABLE IF EXISTS `repalce_dead_lock`;
CREATE TABLE `repalce_dead_lock` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `fid` int(32) NOT NULL COMMENT '唯一ID',
  `content` varchar(32) NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_fid` (`fid`) USING BTREE COMMENT '唯一索引'
) ENGINE=InnoDB AUTO_INCREMENT=5521 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repalce_dead_lock
-- ----------------------------
BEGIN;
INSERT INTO `repalce_dead_lock` VALUES (5516, 2, 'eda218f5fe5140e2ae5f15881fb99859');
INSERT INTO `repalce_dead_lock` VALUES (5518, 1, '7ab3ea7b49db49dc810015038ba5d775');
INSERT INTO `repalce_dead_lock` VALUES (5520, 3, '8c46c4958eed4358a51d355e13161164');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
