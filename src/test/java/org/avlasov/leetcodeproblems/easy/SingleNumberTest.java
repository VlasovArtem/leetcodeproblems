package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 10/07/2018
 **/
public class SingleNumberTest {

    private SingleNumber singleNumber;

    public SingleNumberTest() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void singleNumber_WithArray1_ReturnInteger() {
        assertEquals(1, singleNumber.singleNumber(new int[] {2, 2, 1}));
    }

    @Test
    public void singleNumber_WithArray2_ReturnInteger() {
        assertEquals(4, singleNumber.singleNumber(new int[] {4, 1, 2, 1, 2}));
    }

    @Test
    public void singleNumberSecondSolution_WithArray1_ReturnInteger() {
        assertEquals(1, singleNumber.singleNumberSecondSolution(new int[] {2, 2, 1}));
    }

    @Test
    public void singleNumberSecondSolution_WithArray2_ReturnInteger() {
        assertEquals(4, singleNumber.singleNumberSecondSolution(new int[] {4, 1, 2, 1, 2}));
    }

    @Test
    public void singleNumber_WithNullArray_ReturnNegativeInteger() {
        assertEquals(-1, singleNumber.singleNumber(null));
    }

    @Test
    public void singleNumber_WithEmptyArray_ReturnNegativeInteger() {
        assertEquals(-1, singleNumber.singleNumber(new int[]{}));
    }
    
}