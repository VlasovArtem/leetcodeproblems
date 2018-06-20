package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created By artemvlasov on 19/06/2018
 **/
public class TwoSumTest {

    private TwoSum twoSum;

    public TwoSumTest() {
        this.twoSum = new TwoSum();
    }

    @Test
    public void twoSum_WithPositiveNumbers_ReturnArray() {
        int[] ints = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(ints, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void twoSum_WithNegativeNumbersIncluded_ReturnArray() {
        int[] ints = {-5, 0, 10, 14};
        int[] result = twoSum.twoSum(ints, 9);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    public void twoSum_WithMatchingElements_ReturnArray() {
        int[] ints = {3, 3};
        int[] result = twoSum.twoSum(ints, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void twoSum_WithNumbers2_ReturnArray() {
        int[] ints = {5, 75, 25};
        int[] result = twoSum.twoSum(ints, 100);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void twoSum_WithNumbers3_ReturnArray() {
        int[] ints = {150,24,79,50,88,345,3};
        int[] result = twoSum.twoSum(ints, 200);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum_WithWithOutRequiredSum_ThrowsIllegalArgumentException() {
        int[] ints = {-5, 0, 10, 14};
        twoSum.twoSum(ints, 12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum_WithLargeTarget_ThrowsIllegalArgumentException() {
        int[] ints = {2, 7, 11, 15};
        twoSum.twoSum(ints, 100);
    }

    @Test
    public void bruteTwoSum_WithPositiveNumbers_ReturnArray() {
        int[] ints = {2, 7, 11, 15};
        int[] result = twoSum.bruteTwoSum(ints, 9);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void bruteTwoSum_WithPositiveNumbers2_ReturnArray() {
        int[] ints = {3, 2, 4};
        int[] result = twoSum.bruteTwoSum(ints, 6);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void bruteTwoSum_WithNumbers2_ReturnArray() {
        int[] ints = {5, 75, 25};
        int[] result = twoSum.bruteTwoSum(ints, 100);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void bruteTwoSum_WithMatchingElements_ReturnArray() {
        int[] ints = {3, 3};
        int[] result = twoSum.bruteTwoSum(ints, 6);
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    public void bruteTwoSum_WithNegativeNumbersIncluded_ReturnArray() {
        int[] ints = {-5, 0, 10, 14};
        int[] result = twoSum.bruteTwoSum(ints, 9);
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    public void bruteTwoSum_WithWithOutRequiredSum_ReturnEmptyArray() {
        int[] ints = {-5, 0, 10, 14};
        int[] result = twoSum.bruteTwoSum(ints, 12);
        assertArrayEquals(new int[]{}, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum_WithNullArray_ThrowsIllegalArgumentException() {
        twoSum.twoSum(null, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void twoSum_WithEmptyArray_ThrowsIllegalArgumentException() {
        twoSum.twoSum(new int[]{}, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bruteTwoSum_WithNullArray_ThrowsIllegalArgumentException() {
        twoSum.bruteTwoSum(null, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bruteTwoSum_WithEmptyArray_ThrowsIllegalArgumentException() {
        twoSum.bruteTwoSum(new int[]{}, 3);
    }
}
