-- auto Generated on 2020-01-26 21:58:47 
-- DROP TABLE IF EXISTS `department`; 
CREATE TABLE department(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    `parentid` NUMBER(12) NOT NULL DEFAULT -1 COMMENT 'parentid',
    `deppath` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'deppath',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'department';
