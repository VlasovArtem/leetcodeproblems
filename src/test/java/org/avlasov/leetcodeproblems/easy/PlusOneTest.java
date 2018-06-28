package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 27/06/2018
 **/
public class PlusOneTest {

    private PlusOne plusOne;

    public PlusOneTest() {
        plusOne = new PlusOne();
    }

    @Test
    public void plusOne_WithArray1_ReturnArray() {
        assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void plusOne_WithArray2_ReturnArray() {
        assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }

    @Test
    public void plusOne_WithArray3_ReturnArray() {
        assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void plusOne_WithArray4_ReturnArray() {
        assertArrayEquals(new int[]{9, 9, 9, 9}, plusOne.plusOne(new int[]{9, 9, 9, 8}));
    }

    @Test
    public void plusOne_WithArray5_ReturnArray() {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, plusOne.plusOne(new int[]{9, 9, 9, 9}));
    }

    @Test
    public void plusOne_WithEmptyArray_ReturnEmptyArray() {
        assertArrayEquals(new int[]{}, plusOne.plusOne(new int[] {}));
    }

    @Test
    public void plusOne_WithNullArray_ReturnEmptyArray() {
        assertArrayEquals(new int[]{}, plusOne.plusOne(null));
    }

}