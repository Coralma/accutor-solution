package com.coral.accutor;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccutorDefinition {

    private String productCode;
    private String liability;
    private String feeType;
    private String feeTypeId;
    private Integer feeLevel;
    private BigDecimal param1;
    private BigDecimal param2;
}
