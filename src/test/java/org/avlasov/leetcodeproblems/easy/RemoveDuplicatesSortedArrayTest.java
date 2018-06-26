package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class RemoveDuplicatesSortedArrayTest {

    private RemoveDuplicatesSortedArray removeDuplicatesSortedArray;

    public RemoveDuplicatesSortedArrayTest() {
        removeDuplicatesSortedArray = new RemoveDuplicatesSortedArray();
    }

    @Test
    public void removeDuplicates_WithNullArray_ReturnZero() {
        assertEquals(0, removeDuplicatesSortedArray.removeDuplicates(null));
    }

    @Test
    public void removeDuplicates_WithEmptyArray_ReturnZero() {
        assertEquals(0, removeDuplicatesSortedArray.removeDuplicates(new int[]{}));
    }

    @Test
    public void removeDuplicates_WithSingleLengthArray_ReturnInteger() {
        int[] result = {1};
        int[] data = {1};
        int i = removeDuplicatesSortedArray.removeDuplicates(data);
        assertEquals(1, i);
        for (int j = 0; j < i; j++) {
            assertEquals(result[j], data[j]);
        }
    }

    @Test
    public void removeDuplicates_WithValidArray1_ReturnInteger() {
        int[] result = {1,2};
        int[] data = {1,1,2};
        int i = removeDuplicatesSortedArray.removeDuplicates(data);
        assertEquals(2, i);
        for (int j = 0; j < i; j++) {
            assertEquals(result[j], data[j]);
        }
    }

    @Test
    public void removeDuplicates_WithValidArray2_ReturnInteger() {
        int[] result = {0, 1, 2, 3, 4};
        int[] data = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = removeDuplicatesSortedArray.removeDuplicates(data);
        assertEquals(5, i);
        for (int j = 0; j < i; j++) {
            assertEquals(result[j], data[j]);
        }
    }

    @Test
    public void removeDuplicates_WithValidArray3_ReturnInteger() {
        int[] result = {-1, 0, 3};
        int[] data = {-1, 0, 0, 0, 0, 3, 3};
        int i = removeDuplicatesSortedArray.removeDuplicates(data);
        assertEquals(3, i);
        for (int j = 0; j < i; j++) {
            assertEquals(result[j], data[j]);
        }
    }



}