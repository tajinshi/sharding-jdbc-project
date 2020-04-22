-- 水平分表，分的是单表，根据student_id进行水平拆分俩张表
DROP TABLE IF EXISTS `t_student_1`;
CREATE TABLE `t_student_1` (
  `student_id` bigint(11) NOT NULL,
  `student_code` varchar(10) default NULL,
  `student_name` varchar(20) default NULL,
  `phone` bigint(11) default NULL,
  `user_id` bigint(11) default NULL,
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_student_2`;
CREATE TABLE `t_student_2` (
  `student_id` bigint(11) NOT NULL,
  `student_code` varchar(10) default NULL,
  `student_name` varchar(20) default NULL,
  `phone` bigint(11) default NULL,
  `user_id` bigint(11) default NULL,
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_student_detail_1`;
CREATE TABLE `t_student_detail_1` (
  `student_id` bigint(11) NOT NULL COMMENT '学生id',
  `user_id` bigint(11) NOT NULL COMMENT '添加用户id',
  `address` varchar(20) default NULL COMMENT '地址',
  `hobby` varchar(20) default NULL COMMENT '爱好',
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_student_detail_2`;
CREATE TABLE `t_student_detail_2` (
  `student_id` bigint(11) NOT NULL COMMENT '学生id',
  `user_id` bigint(11) NOT NULL COMMENT '添加用户id',
  `address` varchar(20) default NULL COMMENT '地址',
  `hobby` varchar(20) default NULL COMMENT '爱好',
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_desc`;
CREATE TABLE `t_desc` (
  `desc_id` bigint(10) NOT NULL auto_increment,
  `desc_type` varchar(10) default NULL,
  `desc_value` varchar(10) default NULL,
  `desc_name` varchar(10) default NULL,
  PRIMARY KEY  (`desc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='数据字典表';