package com.coral.accutor.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

public class PolicyAccutor {

    private Long id;
    private Long policyId; // 保单ID
    private Long policyProductId; //保单险种产品ID
    private Long policyLiabilityId; // 保单责任ID
    private Long policyFeeTypeId; //保单医疗费用类型
    private Long accutorId; // 产品定义的累加器ID
    private BigDecimal deductibleValue; //免赔值
    private BigDecimal limitValue;//限额值
    private BigDecimal awaitDay; //等待天数
    private BigDecimal claimPercent; //理赔比例
    private List<PolicyAccutorCondition> policyAccutorConditionList;
    private List<PolicyAccutorRelativity> policyAccutorRelativityList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getAccutorId() {
        return accutorId;
    }

    public void setAccutorId(Long accutorId) {
        this.accutorId = accutorId;
    }

    public BigDecimal getDeductibleValue() {
        return deductibleValue;
    }

    public void setDeductibleValue(BigDecimal deductibleValue) {
        this.deductibleValue = deductibleValue;
    }

    public BigDecimal getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
        this.limitValue = limitValue;
    }


    public BigDecimal getClaimPercent() {
        return claimPercent;
    }

    public void setClaimPercent(BigDecimal claimPercent) {
        this.claimPercent = claimPercent;
    }
}
