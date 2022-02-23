-- 分库分表设计
CREATE DATABASE lg_novel_db CHARACTER SET 'utf8';

USE lg_novel_db;

-- 小说表
CREATE TABLE novel(
	id BIGINT(20) PRIMARY KEY COMMENT '小说ID',
	title VARCHAR(50) COMMENT '名称', 
	author VARCHAR(50) COMMENT '作者',
	pic VARCHAR(255) COMMENT '图片',
	content TEXT COMMENT '内容介绍'
);


-- 系统区域表
CREATE TABLE sys_region  (
  id BIGINT(20) PRIMARY KEY COMMENT '地区ID',
  region_name VARCHAR(100) COMMENT '区域名称',
  region_code VARCHAR(20)  COMMENT '行政地区编号',
  region_level INT COMMENT '等级'
);

===============================================================

CREATE DATABASE lg_user_db CHARACTER SET 'utf8';

USE lg_user_db;

-- 用户表
CREATE TABLE users_1(
  id BIGINT(20) PRIMARY KEY COMMENT '用户ID',
  username VARCHAR(20) COMMENT '用户名',
  PASSWORD VARCHAR(12) COMMENT '密码',
  address VARCHAR(20)  COMMENT '地址' 
);

CREATE TABLE users_2(
  id BIGINT(20) PRIMARY KEY COMMENT '用户ID',
  username VARCHAR(20) COMMENT '用户名',
  PASSWORD VARCHAR(12) COMMENT '密码',
  address VARCHAR(20)  COMMENT '地址' 
);


-- 系统区域表
CREATE TABLE sys_region  (
  id BIGINT(20) PRIMARY KEY COMMENT '地区ID',
  region_name VARCHAR(100) COMMENT '区域名称',
  region_code VARCHAR(20)  COMMENT '行政地区编号',
  region_level INT COMMENT '等级'
);