

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