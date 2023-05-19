CREATE TABLE member_purse_change_history (
    purse_change_history_id BIGINT UNSIGNED NOT NULL PRIMARY KEY COMMENT 'id',
    is_deleted              TINYINT(1) UNSIGNED DEFAULT '0' COMMENT '删除标志（0代表存在 NULL代表删除）',
    user_id                 BIGINT COMMENT '会员id',
    change_count            DECIMAL(18, 4) COMMENT '改变的值（正负计数）',
    note                    VARCHAR(255) COMMENT '备注',
    source_type             TINYINT(1) UNSIGNED COMMENT '来源[0->购物；1->管理员修改;2.html->活动]',
    created_by              VARCHAR(64)         DEFAULT '' COMMENT '创建者',
    created_time            DATETIME COMMENT '创建时间',
    updated_by              VARCHAR(64) COMMENT '更新者',
    updated_time            DATETIME COMMENT '更新时间',
    remark                  VARCHAR(500)        DEFAULT NULL COMMENT '备注'
);
CREATE TABLE member_purse (
    user_id      BIGINT UNSIGNED NOT NULL PRIMARY KEY COMMENT '用户id',
    is_deleted   TINYINT(1) UNSIGNED DEFAULT '0' COMMENT '删除标志（0代表存在 NULL代表删除）',
    amount       DECIMAL(18, 4) COMMENT '账户余额',
    created_by   VARCHAR(64)         DEFAULT '' COMMENT '创建者',
    created_time DATETIME COMMENT '创建时间',
    updated_by   VARCHAR(64) COMMENT '更新者',
    updated_time DATETIME COMMENT '更新时间',
    remark       VARCHAR(500)        DEFAULT NULL COMMENT '备注'
);
