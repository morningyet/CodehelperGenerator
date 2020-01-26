-- auto Generated on 2020-01-26 21:58:47 
-- DROP TABLE IF EXISTS `hr`; 
CREATE TABLE hr(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'name',
    `phone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'phone',
    `telephone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'telephone',
    `address` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'address',
    `username` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'username',
    `password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'password',
    `userface` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'userface',
    `remark` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'remark',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'hr';
