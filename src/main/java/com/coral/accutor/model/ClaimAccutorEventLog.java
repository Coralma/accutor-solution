package com.coral.accutor.model;

import java.math.BigDecimal;

public class ClaimAccutorEventLog {

    private Long id;
    private Long policyId; // 保单ID
    private Long feeTypeId; //费用类型
    private Long accutorId; //累加器ID
    private BigDecimal claimValue; // 理赔
    private BigDecimal deductibleValue; //免赔值
    private BigDecimal limitValue;//限额值
    private String awaitDay; //等待天数
    private BigDecimal claimPercent; //理赔比例
    private BigDecimal sa;
    private BigDecimal medicalFee;
    private BigDecimal initialSA;
    private BigDecimal unit;
    private BigDecimal premium;
    private String formula;

}
