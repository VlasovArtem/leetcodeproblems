package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 30/06/2018
 **/
public class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray;

    public MergeSortedArrayTest() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void merge_WithValidData1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        mergeSortedArray.merge(nums1, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void merge_WithValidData2() {
        int[] nums1 = {1, 2, 0, 0, 0, 0};
        mergeSortedArray.merge(nums1, 2, new int[]{2, 5, 6, 7}, 4);
        assertArrayEquals(new int[]{1, 2, 2, 5, 6, 7}, nums1);
    }

    @Test
    public void merge_WithValidData3() {
        int[] nums1 = {7, 8, 9, 0, 0, 0};
        mergeSortedArray.merge(nums1, 3, new int[]{1, 2, 4}, 3);
        assertArrayEquals(new int[]{1, 2, 4, 7, 8, 9}, nums1);
    }

    @Test
    public void merge_WithValidData4() {
        int[] nums1 = {1, 8, 9, 0, 0, 0};
        mergeSortedArray.merge(nums1, 3, new int[]{2, 4, 10}, 3);
        assertArrayEquals(new int[]{1, 2, 4, 8, 9, 10}, nums1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void merge_WithNullNums1_ThrowsIllegalArgumentException() {
        mergeSortedArray.merge(null, 1, new int[]{1}, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void merge_WithNullNums2_ThrowsIllegalArgumentException() {
        mergeSortedArray.merge(new int[]{1}, 1, null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void merge_WithNotMatchingNums1ArrayLength_ThrowsIllegalArgumentException() {
        mergeSortedArray.merge(new int[]{1}, 1, new int[]{1}, 2);
    }

}