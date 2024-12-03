SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_address
-- ----------------------------
DROP TABLE IF EXISTS `t_address`;
CREATE TABLE `t_address` (
    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `contact` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '联系人姓名',
    `addressDesc` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '收货地址明细',
    `postCode` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '邮编',
    `tel` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '联系人电话',
    `userId` bigint DEFAULT NULL COMMENT '用户id',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci;

-- ----------------------------
-- Records of t_address
-- ----------------------------
BEGIN;
INSERT INTO `t_address` (`id`, `contact`, `addressDesc`, `postCode`, `tel`, `userId`) VALUES (7, '张三', '福建省泉州市安溪县宝龙城市广场', '362400', '13275000001', 1);
INSERT INTO `t_address` (`id`, `contact`, `addressDesc`, `postCode`, `tel`, `userId`) VALUES (8, '张三', '福建省厦门市集美区软件园3期', '361000', '13275000002', 1);
COMMIT;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role` (
    `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `code` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '角色编码',
    `roleName` varchar(15) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '角色名称',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci COMMENT='系统角色';

-- ----------------------------
-- Records of t_sys_role
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_role` (`id`, `code`, `roleName`) VALUES (1, 'SMBMS_ADMIN', '管理系统员');
INSERT INTO `t_sys_role` (`id`, `code`, `roleName`) VALUES (2, 'SMBMS_MANAGER', '店长');
INSERT INTO `t_sys_role` (`id`, `code`, `roleName`) VALUES (3, 'SMBMS_EMPLOYEE', '店员');
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
    `address` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_unicode_ci DEFAULT NULL COMMENT '用户地址',
    `roleId` bigint DEFAULT NULL COMMENT '用户角色id',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_unicode_ci COMMENT='系统用户';

-- ----------------------------
-- Records of t_sys_user
-- ----------------------------
BEGIN;
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (1, 'admin', 'admin', '1111111', 1, '1980-11-01', '13521214507', '北京市朝阳区北辰中心12号', 1);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (2, 'limingxing', '李明星', '0000000', 2, '1983-12-10', '13685584457', '北京市东城区前门东大街9号', 2);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (5, 'wanglulu', '王璐璐', '0000000', 2, '1984-06-05', '18567542321', '北京市朝阳区北苑家园茉莉园20号楼', 2);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (6, 'hauzhiqing', '华志强', '0000000', 1, '1983-06-15', '13382386623', '北京市通州区学院路61号', 3);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (7, 'huangweihua', '黄卫华', '0000000', 2, '1982-12-31', '13388451555', '北京市海淀区西二旗辉煌国际26层', 3);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (10, 'zhaogang', '赵刚', '0000000', 2, '1980-01-01', '13387676762', '北京市丰台区管庄新月小区', 2);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (11, 'liuyang', '刘阳', '0000000', 2, '1978-03-12', '13367890900', '北京市海淀区成府路207号', 2);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (12, 'lijiangtao', '李江涛', '0000000', 1, '1983-12-10', '18098765434', '朝阳区管庄路口北柏林爱乐三期13号楼', 3);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (13, 'liuzhong', '刘忠', '0000000', 2, '1981-11-04', '13689674534', '北京市海淀区北航家属院10号楼', 3);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (14, 'zhangfeng', '张峰', '0000000', 2, '1980-01-01', '13645884457', '北京市海淀区北苑家园20号楼', 3);
INSERT INTO `t_sys_user` (`id`, `account`, `realName`, `password`, `sex`, `birthday`, `phone`, `address`, `roleId`) VALUES (15, 'songke', '宋科', '0000000', 1, '1983-10-10', '13387676762', '北京市海淀区西二旗辉煌国际26层', 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
