package com.coral.accutor.model;

import java.math.BigDecimal;

public class PolicyAccutorRelativity {

    private Long id;
    private Long accutorRelativityId; // 产品定义累加器依赖模型的关联ID
    private BigDecimal limitValue;//限额值

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
        this.limitValue = limitValue;
    }
}
