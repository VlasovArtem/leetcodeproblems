package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 12/07/2018
 **/
public class TwoSumIITest {

    private TwoSumII twoSumII;

    public TwoSumIITest() {
        twoSumII = new TwoSumII();
    }

    @Test
    public void twoSum_WithExistingSum1_ReturnArray() {
        int[] array = {2, 7, 11, 15};
        int[] result = {1, 2};
        int[] ints = twoSumII.twoSum(array, 9);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSum_WithExistingSum2_ReturnArray() {
        int[] array = {1, 3, 5, 5, 8};
        int[] result = {3, 4};
        int[] ints = twoSumII.twoSum(array, 10);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSum_WithExistingSum3_ReturnArray() {
        int[] array = {2, 3, 4};
        int[] result = {1, 3};
        int[] ints = twoSumII.twoSum(array, 6);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSum_WithExistingSum4_ReturnArray() {
        int[] array = {-1, 0};
        int[] result = {1, 2};
        int[] ints = twoSumII.twoSum(array, -1);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSum_WithNotExistingSum1_ReturnArray() {
        int[] array = {1, 3, 5, 5, 9};
        int[] ints = twoSumII.twoSum(array, 11);
        assertNull(ints);
    }

    @Test
    public void twoSum_WithNullNumbers_ReturnNull() {
        assertNull(twoSumII.twoSum(null, 10));
    }

    @Test
    public void twoSum_WithEmptyNumbers_ReturnNull() {
        assertNull(twoSumII.twoSum(new int[]{}, 10));
    }

    @Test
    public void twoSumSecondSolution_WithExistingSum1_ReturnArray() {
        int[] array = {2, 7, 11, 15};
        int[] result = {1, 2};
        int[] ints = twoSumII.twoSumSecondSolution(array, 9);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSumSecondSolution_WithExistingSum2_ReturnArray() {
        int[] array = {1, 3, 5, 5, 8};
        int[] result = {3, 4};
        int[] ints = twoSumII.twoSumSecondSolution(array, 10);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSumSecondSolution_WithExistingSum3_ReturnArray() {
        int[] array = {2, 3, 4};
        int[] result = {1, 3};
        int[] ints = twoSumII.twoSumSecondSolution(array, 6);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }


    @Test
    public void twoSumSecondSolution_WithExistingSum4_ReturnArray() {
        int[] array = {-1, 0};
        int[] result = {1, 2};
        int[] ints = twoSumII.twoSumSecondSolution(array, -1);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSumSecondSolution_WithNotExistingSum1_ReturnArray() {
        int[] array = {1, 3, 5, 5, 9};
        int[] ints = twoSumII.twoSumSecondSolution(array, 11);
        assertNull(ints);
    }

    @Test
    public void twoSumSecondSolution_WithNullNumbers_ReturnNull() {
        assertNull(twoSumII.twoSumSecondSolution(null, 10));
    }

    @Test
    public void twoSumSecondSolution_WithEmptyNumbers_ReturnNull() {
        assertNull(twoSumII.twoSumSecondSolution(new int[]{}, 10));
    }

    @Test
    public void twoSumThirdSolution_WithExistingSum1_ReturnArray() {
        int[] array = {2, 7, 11, 15};
        int[] result = {1, 2};
        int[] ints = twoSumII.twoSumThirdSolution(array, 9);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSumThirdSolution_WithExistingSum2_ReturnArray() {
        int[] array = {1, 3, 5, 5, 8};
        int[] result = {3, 4};
        int[] ints = twoSumII.twoSumThirdSolution(array, 10);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSumThirdSolution_WithExistingSum3_ReturnArray() {
        int[] array = {2, 3, 4};
        int[] result = {1, 3};
        int[] ints = twoSumII.twoSumThirdSolution(array, 6);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }


    @Test
    public void twoSumThirdSolution_WithExistingSum4_ReturnArray() {
        int[] array = {-1, 0};
        int[] result = {1, 2};
        int[] ints = twoSumII.twoSumThirdSolution(array, -1);
        assertNotNull(ints);
        assertArrayEquals(result, ints);
    }

    @Test
    public void twoSumThirdSolution_WithNotExistingSum1_ReturnArray() {
        int[] array = {1, 3, 5, 5, 9};
        int[] ints = twoSumII.twoSumThirdSolution(array, 11);
        assertNull(ints);
    }

    @Test
    public void twoSumThirdSolution_WithNullNumbers_ReturnNull() {
        assertNull(twoSumII.twoSumThirdSolution(null, 10));
    }

    @Test
    public void twoSumThirdSolution_WithEmptyNumbers_ReturnNull() {
        assertNull(twoSumII.twoSumThirdSolution(new int[]{}, 10));
    }

}