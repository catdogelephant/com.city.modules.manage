package com.beijing.modules.manage.account.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class LevelVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 起始经验
     */
    private Integer startExp;

    /**
     * 最高经验
     */
    private Integer topExp;

    /**
     * 等级
     */
    private String level;

    /**
     * 每级数量
     */
    private Long count;
}
