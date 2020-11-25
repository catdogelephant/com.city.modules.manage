package com.beijing.modules.manage.account.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private String id;

    /**
     * 余额
     */
    private Double balance;

    /**
     * 积累积分
     */
    private Integer score;

    /**
     * 经验值
     */
    private Integer exp;

    /**
     * 剩余积分
     */
    private Integer availableScore;

    /**
     * 是否同意提现协议（0：不同意；1：同意）
     */
    private Integer paymentAgreement;

    /**
     * 是否删除  0否（默认），-1删除
     */
    private Integer status;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 创建人
     */
    private String creatorName;

    /**
     * 创建时间
     */
    private Date createTime;
}
