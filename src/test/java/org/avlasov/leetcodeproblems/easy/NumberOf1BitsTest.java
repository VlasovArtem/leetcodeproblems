package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 15/07/2018
 **/
public class NumberOf1BitsTest {

    private NumberOf1Bits numberOf1Bits;

    public NumberOf1BitsTest() {
        numberOf1Bits = new NumberOf1Bits();
    }

    @Test
    public void hammingWeight_WithInteger1_ReturnInteger() {
        assertEquals(3, numberOf1Bits.hammingWeight(11));
    }

    @Test
    public void hammingWeight_WithInteger2_ReturnInteger() {
        assertEquals(1, numberOf1Bits.hammingWeight(128));
    }

    @Test
    public void hammingWeight_WithInteger3_ReturnInteger() {
        assertEquals(3, numberOf1Bits.hammingWeight(25));
    }

    @Test
    public void hammingWeight_WithInteger4_ReturnInteger() {
        assertEquals(5, numberOf1Bits.hammingWeight(213));
    }

    @Test
    public void hammingWeightSecondSolution_WithInteger1_ReturnInteger() {
        assertEquals(3, numberOf1Bits.hammingWeightSecondSolution(11));
    }

    @Test
    public void hammingWeightSecondSolution_WithInteger2_ReturnInteger() {
        assertEquals(1, numberOf1Bits.hammingWeightSecondSolution(128));
    }

    @Test
    public void hammingWeightSecondSolution_WithInteger3_ReturnInteger() {
        assertEquals(3, numberOf1Bits.hammingWeightSecondSolution(25));
    }

    @Test
    public void hammingWeightSecondSolution_WithInteger4_ReturnInteger() {
        assertEquals(5, numberOf1Bits.hammingWeightSecondSolution(213));
    }
}