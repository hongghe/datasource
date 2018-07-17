CREATE TABLE IF NOT EXISTS `test`.`t_test` (
  `record_id` INT NOT NULL AUTO_INCREMENT COMMENT 'record_id',
  `name` VARCHAR(60) NOT NULL DEFAULT '' COMMEnt 'name',
  `create_time` TIMESTAMP NOT NULL DEFAULT current_timestamp COMMENT 'create time',
  `update_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT 'update time',
  PRIMARY KEY (`record_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'test';