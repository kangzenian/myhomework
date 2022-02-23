-- 商品表
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
    `id` INT NOT NULL AUTO_INCREMENT COMMENT '商品id',
    `name` VARCHAR(20) NOT NULL DEFAULT '' COMMENT '商品名称',
		`category` VARCHAR(20) NOT NULL DEFAULT '0' COMMENT '商品分类',
    `description` TEXT COMMENT '商品描述',
    `num` INT NOT NULL DEFAULT '0' COMMENT '库存',
    `price` VARCHAR(100) NOT NULL DEFAULT '0.00' COMMENT '价格',
    `ison` INT NOT NULL DEFAULT '0' COMMENT '是否上架；0：上架，1：下架',
		`isdel` INT NOT NULL DEFAULT '0' COMMENT '删除；0：未删除，1：已删除',
    `create_time` DATE NOT NULL DEFAULT '0000-00-00' COMMENT '创建时间',
    `update_time` DATE NOT NULL DEFAULT '0000-00-00' COMMENT '修改时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '商品表';

-- 商品表添加数据
INSERT INTO `goods`(name, category, description, num, price, ison, isdel, create_time, update_time) values
('HUAWEI P40', '手机', '华为P40 5G手机 分期 麒麟990 晨曦金', 10, '5688.00', 0, 0, '2022-2-14', '2022-2-14'),
('HUAWEI P40 Pro', '手机', '华为P40 Pro 5G手机 支持鸿蒙HarmonyOS 亮黑色', 10, '7188.00', 0, 0, '2022-2-14', '2022-2-14'),
('联想笔记本电脑', '电脑', '联想笔记本电脑 小新Air14Plus锐龙版14英寸全面屏办公轻薄本(8核R7-5800U 16G 512G 2.2K护眼屏 人脸识别)', 10, '4699.00', 0, 0, '2022-2-14', '2022-2-14'),
('华硕笔记本电脑', '电脑', '华硕无畏Pro14 锐龙版 2.8K OLED轻薄笔记本电脑(R7-5800H 16G 512G 100%DCI-P3 高色域600尼特90Hz护眼屏)银', 10, '4999.00', 0, 0, '2022-2-14', '2022-2-14');

-- 订单表
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`(
	`id` INT NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '订单id',
	`gid` INT NOT NULL COMMENT '商品id，外键',
	`number` VARCHAR(100) NOT NULL COMMENT '订单编号',
	`status` INT NOT NULL DEFAULT '0' COMMENT '订单状态；0：未支付，1：已支付，2：已失效，3：已删除',
	`create_time` DATE NOT NULL DEFAULT '0000-00-00' COMMENT '创建时间',
  `update_time` DATE NOT NULL DEFAULT '0000-00-00' COMMENT '修改时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '订单表表';

-- 订单表添加数据
INSERT INTO `orders`(gid, number, status, create_time, update_time) VALUES
(1, '123456789', 1, '2022-2-14', '2022-2-14'),
(1, '123456780', 0, '2022-2-14', '2022-2-14'),
(1, '123456781', 2, '2022-2-14', '2022-2-14'),
(1, '123456782', 3, '2022-2-14', '2022-2-14');















