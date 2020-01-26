-- auto Generated on 2020-01-26 21:58:47 
-- DROP TABLE IF EXISTS `adjust_salary`; 
CREATE TABLE adjust_salary(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `eid` NUMBER(12) NOT NULL DEFAULT -1 COMMENT 'eid',
    `asdate` date NOT NULL DEFAULT -1 COMMENT 'asdate',
    `beforesalary` NUMBER(12) NOT NULL DEFAULT -1 COMMENT 'beforesalary',
    `aftersalary` NUMBER(12) NOT NULL DEFAULT -1 COMMENT 'aftersalary',
    `reason` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'reason',
    `remark` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'remark',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'adjust_salary';
