package com.coral.accutor.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

public class AccutorDefine {

    private Long id;
    private Long productId; //险种产品ID
    private Long liabilityId; // 责任ID
    private Long feeTypeId; //医疗费用类型
    private String periodType; //期间选择
    private String deductibleType; //免赔类型
    private BigDecimal deductibleValue; //免赔值
    private String limitType;//限额类型
    private BigDecimal limitValue;//限额值
    private String awaitType; //等待期约定
    private String awaitDay; //等待天数
    private BigDecimal claimPercent; //理赔比例
    private List<AccutorConditionDefine> conditionDefinitionList; //定义特殊的限额条件和限额值
    private List<AccutorRelativityDefine> relativityDefineList; // 定义依赖关系和限额值
    private String formulaType; //公式类型
    private String formula;//公式
    private String input;/** 目前缺少这部分定义 **/
    private Integer order; // 计算顺序

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

    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public String getDeductibleType() {
        return deductibleType;
    }

    public void setDeductibleType(String deductibleType) {
        this.deductibleType = deductibleType;
    }

    public BigDecimal getDeductibleValue() {
        return deductibleValue;
    }

    public void setDeductibleValue(BigDecimal deductibleValue) {
        this.deductibleValue = deductibleValue;
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

    public String getAwaitType() {
        return awaitType;
    }

    public void setAwaitType(String awaitType) {
        this.awaitType = awaitType;
    }

    public String getAwaitDay() {
        return awaitDay;
    }

    public void setAwaitDay(String awaitDay) {
        this.awaitDay = awaitDay;
    }

    public BigDecimal getClaimPercent() {
        return claimPercent;
    }

    public void setClaimPercent(BigDecimal claimPercent) {
        this.claimPercent = claimPercent;
    }

    public List<AccutorConditionDefine> getConditionDefinitionList() {
        return conditionDefinitionList;
    }

    public void setConditionDefinitionList(List<AccutorConditionDefine> conditionDefinitionList) {
        this.conditionDefinitionList = conditionDefinitionList;
    }

    public List<AccutorRelativityDefine> getRelativityDefineList() {
        return relativityDefineList;
    }

    public void setRelativityDefineList(List<AccutorRelativityDefine> relativityDefineList) {
        this.relativityDefineList = relativityDefineList;
    }

    public String getFormulaType() {
        return formulaType;
    }

    public void setFormulaType(String formulaType) {
        this.formulaType = formulaType;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
