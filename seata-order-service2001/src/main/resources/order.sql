CREATE DATABASE seata_order;

CREATE TABLE t_order
(
    id         BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id    BIGINT(11)     DEFAULT NULL COMMENT '用户id',
    product_id BIGINT(11)     DEFAULT NULL COMMENT '产品id',
    count      INT(11)        DEFAULT NULL COMMENT '数量',
    money      DECIMAL(11, 0) DEFAULT NULL COMMENT '金额',
    status     INT(1)         DEFAULT NULL COMMENT '订单状态：0创建中，1已完结'
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  CHARSET = utf8;