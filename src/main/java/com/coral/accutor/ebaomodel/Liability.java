package com.coral.accutor.ebaomodel;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Liability {

    // what is SA?
    private BigDecimal sa;
    private BigDecimal initialSa;
    // MEDICAL_FEE
    private BigDecimal medicalFee;
    private BigDecimal unit;
    private BigDecimal premium;
}
