package com.coral.accutor.model;

import lombok.Data;

import java.math.BigDecimal;

public class AccutorRelativityDefine {

    private Long id;
    private Long productId; // 关联的险种产品ID
    private Long liabilityId; // 关联的责任ID
    private Long feeTypeId; // 关联的医疗费用类型
    private String relativityType; // 关联类型
    private String limitType;//限额类型
    private BigDecimal limitValue;//限额值

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getLiabilityId() {
        return liabilityId;
    }

    public void setLiabilityId(Long liabilityId) {
        this.liabilityId = liabilityId;
    }

    public Long getFeeTypeId() {
        return feeTypeId;
    }

    public void setFeeTypeId(Long feeTypeId) {
        this.feeTypeId = feeTypeId;
    }

    public String getRelativityType() {
        return relativityType;
    }

    public void setRelativityType(String relativityType) {
        this.relativityType = relativityType;
    }

    public String getLimitType() {
        return limitType;
    }

    public void setLimitType(String limitType) {
        this.limitType = limitType;
    }

    public BigDecimal getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
        this.limitValue = limitValue;
    }
}
