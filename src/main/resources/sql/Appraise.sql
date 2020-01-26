-- auto Generated on 2020-01-26 21:58:47 
-- DROP TABLE IF EXISTS `appraise`; 
CREATE TABLE appraise(
    `id` INTEGER(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'id',
    `eid` NUMBER(12) NOT NULL DEFAULT -1 COMMENT 'eid',
    `appdate` date NOT NULL DEFAULT -1 COMMENT 'appdate',
    `appresult` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'appresult',
    `appcontent` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'appcontent',
    `remark` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'remark',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT 'appraise';
