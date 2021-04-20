CREATE DATABASE seata_account;


CREATE TABLE t_account
(
    id      BIGINT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT(11)     DEFAULT NULL COMMENT '用户id',
    total   DECIMAL(10, 0) DEFAULT NULL COMMENT '总额度',
    used    DECIMAL(10, 0) DEFAULT NULL COMMENT '已用额度',
    residue DECIMAL(10, 0) DEFAULT 0 COMMENT '剩余可用额度'
) ENGINE = InnoDB
  AUTO_INCREMENT = 0
  CHARSET = utf8;

INSERT INTO t_account(id, user_id, total, used, residue) VALUES (1, 1, 1000, 0, 1000);