package com.coral.accutor.formula.test;

import com.coral.accutor.AccutorDefinition;
import com.coral.accutor.Liability;
import com.coral.accutor.formula.AccutorFormula;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AccutorFormulaTest {

    AccutorFormula accutorFormula = new AccutorFormula();
    AccutorDefinition ad;
    Liability liability;

    @Before
    public void before() {
        ad = new AccutorDefinition();
        ad.setParam1(new BigDecimal("500"));
        ad.setParam2(new BigDecimal("200"));
        ad.setFeeLevel(1);

        liability = new Liability();
        liability.setSa(new BigDecimal("10"));
        liability.setInitialSa(new BigDecimal("20"));
        liability.setMedicalFee(new BigDecimal("300"));
        liability.setPremium(new BigDecimal(150));
        liability.setUnit(new BigDecimal(2));
    }

    @Test
    public void testG1() {
        BigDecimal rs = accutorFormula.g1(ad, liability);
        Assert.assertEquals(rs.intValue(), 500);
    }

    @Test
    public void testG2() {
        BigDecimal rs = accutorFormula.g2(ad, liability);
        Assert.assertEquals(rs.intValue(), 200);
    }

    @Test
    public void testG3() {
        BigDecimal rs = accutorFormula.g3(ad, liability);
        // PARAM1*SA = 500 * 10 = 5000
        Assert.assertEquals(5000, rs.intValue());
    }

    @Test
    public void testG4() {
        BigDecimal rs = accutorFormula.g4(ad, liability);
        // MAX{PARAM1*[MEDICAL_FEE],PARAM2] = MAX[500*300, 200] = 150000
        Assert.assertEquals(150000, rs.intValue());
    }

    @Test
    public void testG5() {
        BigDecimal rs = accutorFormula.g5(ad, liability);
        // MIN{PARAM1*SA,PARAM2} = MIN{500 * 10, 200} = 200
        Assert.assertEquals(200, rs.intValue());
    }

    @Test
    public void testG6() {
        BigDecimal rs = accutorFormula.g6(ad, liability);
        // PARAM1*UNIT = 500 * 2 = 1000
        Assert.assertEquals(1000, rs.intValue());
    }

    @Test
    public void testG7() {
        BigDecimal rs = accutorFormula.g7(ad, liability);
        // PARAM1*PREMIUM = 500 * 150 = 1000
        Assert.assertEquals(75000, rs.intValue());
    }

    @Test
    public void testG8() {
        BigDecimal rs = accutorFormula.g8(ad, liability);
        // PARAM1*PARAM2*SA*0.0001 = 500*200*10*0.0001 = 100
        Assert.assertEquals(100, rs.intValue());
    }

    @Test
    public void testG9() {
        BigDecimal rs = accutorFormula.g9(ad, liability);
        // //MIN{PARAM1*SA*0.0001,PARAM2} = MIN{500*10*0.0001, 200}
        Assert.assertEquals(new BigDecimal("0.50"), rs.setScale(2, RoundingMode.HALF_UP ));
    }

    @Test
    public void testG10() {
        BigDecimal rs = accutorFormula.g10(ad, liability);
        // param1 * initial SA@eventDate = 500 *
        Assert.assertEquals(new BigDecimal("0.50"), rs.setScale(2, RoundingMode.HALF_UP ));
    }
}
