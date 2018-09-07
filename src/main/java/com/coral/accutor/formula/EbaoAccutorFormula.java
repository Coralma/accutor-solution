package com.coral.accutor.formula;

import com.coral.accutor.ebaomodel.EbaoAccutorDefinition;
import com.coral.accutor.ebaomodel.Liability;

import java.math.BigDecimal;

public class EbaoAccutorFormula {

    //P_CLM_ACCUTOR_G1 PARAM1
    public BigDecimal g1(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1();
    }
    // P_CLM_ACCUTOR_G2 PARAM2
    public BigDecimal g2(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam2();
    }
    // PARAM1*SA
    public BigDecimal g3(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getSa());
    }
    // MAX{PARAM1*[MEDICAL_FEE],PARAM2]
    public BigDecimal g4(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getMedicalFee()).max(ad.getParam2());
    }
    //MIN{PARAM1*SA,PARAM2}
    public BigDecimal g5(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getSa()).min(ad.getParam2());
    }
    // PARAM1*UNIT
    public BigDecimal g6(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getUnit());
    }
    // PARAM1*PREMIUM
    public BigDecimal g7(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getPremium());
    }
    // PARAM1*PARAM2*SA*0.0001
    public BigDecimal g8(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(ad.getParam2()).multiply(liability.getSa()).multiply(new BigDecimal("0.0001"));
    }
    //MIN{PARAM1*SA*0.0001,PARAM2}
    public BigDecimal g9(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getSa()).multiply(new BigDecimal("0.0001")).min(ad.getParam2());
    }
    //param1 * initial SA@eventDate
    public BigDecimal g10(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getInitialSa());
    }
    // min(param1 * Initial SA@eventDate , param2)
    public BigDecimal g11(EbaoAccutorDefinition ad, Liability liability) {
        return ad.getParam1().multiply(liability.getInitialSa()).min(ad.getParam2());
    }
}
