/*
 Navicat Premium Dump SQL

 Source Server         : 本地MySQL数据库
 Source Server Type    : MySQL
 Source Server Version : 80040 (8.0.40)
 Source Host           : localhost:3306
 Source Schema         : cvs_db

 Target Server Type    : MySQL
 Target Server Version : 80040 (8.0.40)
 File Encoding         : 65001

 Date: 11/12/2024 19:36:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `code` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '角色编码',
  `roleName` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci COMMENT='角色表';

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_role` (`id`, `code`, `roleName`) VALUES (1, 'SYS_ADMIN', '管理员');
INSERT INTO `t_sys_role` (`id`, `code`, `roleName`) VALUES (2, 'SYS_MANAGER', '店长');
INSERT INTO `t_sys_role` (`id`, `code`, `roleName`) VALUES (3, 'SYS_EMPLOYEE', '店员');
COMMIT;

-- ----------------------------
-- Table structure for t_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_user`;
CREATE TABLE `t_sys_user` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `account` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '账号',
  `realName` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '密码',
  `sex` int DEFAULT NULL COMMENT '性别，1女/2男',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `phone` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '手机号码',
  `roleId` bigint DEFAULT NULL COMMENT '用户角色id',
  `certFile` varchar(255) COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '证件照片',
  `avatarFile` varchar(255) COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '工作证照片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci COMMENT='用户表';

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (1, 'admin', 'admin', '0000000', 1, '1980-11-01', '13888888888', 1, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (2, 'limingxing', '李明星', '0000000', 2, '1983-12-10', '13188888888', 2, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (5, 'wanglulu', '王璐璐', '0000000', 2, '1984-06-05', '15766666666', 2, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (6, 'hauzhiqing', '华志强', '0000000', 1, '1983-06-15', '15866666666', 3, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (7, 'huangweihua', '黄卫华', '0000000', 2, '1982-12-31', '13800099999', 3, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (10, 'zhaogang', '赵刚', '0000000', 2, '1980-01-01', '15266655555', 2, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (11, 'liuyang', '刘阳', '0000000', 2, '1978-03-12', '17099999999', 2, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (12, 'lijiangtao', '李江涛', '0000000', 1, '1983-12-10', '13277777777', 3, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (13, 'liuzhong', '刘忠', '0000000', 2, '1981-11-04', '15388888888', 3, NULL, NULL);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `roleId`, `certFile`, `avatarFile`) VALUES (14, 'zhangfeng', '张峰', '0000000', 2, '1980-01-01', '19288899999', 3, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
