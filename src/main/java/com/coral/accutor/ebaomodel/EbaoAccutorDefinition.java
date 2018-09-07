package com.coral.accutor.ebaomodel;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EbaoAccutorDefinition {

    private String productCode;
    private String liability;
    private String feeType;
    private String feeTypeId;
    private Integer feeLevel;
    private BigDecimal param1;
    private BigDecimal param2;
}
