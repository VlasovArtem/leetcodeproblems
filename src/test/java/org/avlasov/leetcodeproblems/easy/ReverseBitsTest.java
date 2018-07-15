package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 15/07/2018
 **/
public class ReverseBitsTest {

    private ReverseBits reverseBits;

    public ReverseBitsTest() {
        reverseBits = new ReverseBits();
    }

    @Test
    public void reverseBits_ReturnInteger1_ReturnInteger() {
        assertEquals(-1426063360, reverseBits.reverseBits(213));
    }

    @Test
    public void reverseBits_ReturnInteger2_ReturnInteger() {
        assertEquals(-721420288, reverseBits.reverseBits(171));
    }

    @Test
    public void reverseBits_ReturnInteger3_ReturnInteger() {
        assertEquals(964176192, reverseBits.reverseBits(43261596));
    }

    @Test
    public void reverseBits_ReturnInteger4_ReturnInteger() {
        assertEquals(1, reverseBits.reverseBits(0b10000000000000000000000000000000));
    }

    @Test
    public void reverseBitsSecondSolution_ReturnInteger1_ReturnInteger() {
        assertEquals(-1426063360, reverseBits.reverseBitsSecondSolution(213));
    }

    @Test
    public void reverseBitsSecondSolution_ReturnInteger2_ReturnInteger() {
        assertEquals(-721420288, reverseBits.reverseBitsSecondSolution(171));
    }

    @Test
    public void reverseBitsSecondSolution_ReturnInteger3_ReturnInteger() {
        assertEquals(964176192, reverseBits.reverseBitsSecondSolution(43261596));
    }

    @Test
    public void reverseBitsSecondSolution_ReturnInteger4_ReturnInteger() {
        assertEquals(1, reverseBits.reverseBitsSecondSolution(0b10000000000000000000000000000000));
    }

}