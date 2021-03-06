CREATE DATABASE seata_storage;

CREATE TABLE t_storage
(
    id         BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    product_id BIGINT(11) DEFAULT NULL COMMENT '产品id',
    total      INT(11)    DEFAULT NULL COMMENT '总库存',
    used       INT(11)    DEFAULT NULL COMMENT '已用库存',
    residue    INT(11)    DEFAULT NULL COMMENT '剩余库存'
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  CHARSET = utf8;
INSERT INTO t_storage(id, product_id, total, used, residue) VALUES (1, 1, 100, 0, 100);