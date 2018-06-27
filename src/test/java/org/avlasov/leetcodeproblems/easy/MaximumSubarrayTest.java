package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 27/06/2018
 **/
public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    public MaximumSubarrayTest() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void maxSubArray_WithArray1_ReturnInteger() {
        assertEquals(6, maximumSubarray.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void maxSubArray_WithArray2_ReturnInteger() {
        assertEquals(1, maximumSubarray.maxSubArray(new int[] {-2, 1}));
    }

    @Test
    public void maxSubArray_WithArray3_ReturnInteger() {
        assertEquals(3, maximumSubarray.maxSubArray(new int[] {1, 2}));
    }

    @Test
    public void maxSubArray_WithArray4_ReturnInteger() {
        assertEquals(0, maximumSubarray.maxSubArray(new int[] {-1, 0, -2}));
    }

    @Test
    public void maxSubArray_WithArray5_ReturnInteger() {
        assertEquals(21, maximumSubarray.maxSubArray(new int[] {8, -19, 5, -4, 20}));
    }

    @Test
    public void maxSubArray_WithNullArray_ReturnNegativeOne() {
        assertEquals(-1, maximumSubarray.maxSubArray(null));
    }

    @Test
    public void maxSubArray_WithEmptyArray_ReturnNegativeOne() {
        assertEquals(-1, maximumSubarray.maxSubArray(new int[]{}));
    }

}