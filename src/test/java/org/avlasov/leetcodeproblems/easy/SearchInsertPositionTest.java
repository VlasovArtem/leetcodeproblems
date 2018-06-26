package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class SearchInsertPositionTest {

    private SearchInsertPosition searchInsertPosition;

    public SearchInsertPositionTest() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void searchInsert_WithNums1_ReturnInteger() {
        assertEquals(0, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 0));
    }

    @Test
    public void searchInsert_WithNums2_ReturnInteger() {
        assertEquals(4, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 7));
    }

    @Test
    public void searchInsert_WithNums3_ReturnInteger() {
        assertEquals(1, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 2));
    }

    @Test
    public void searchInsert_WithNums4_ReturnInteger() {
        assertEquals(2, searchInsertPosition.searchInsert(new int[] {1, 3, 5, 6}, 5));
    }

    @Test
    public void searchInsert_WithNums5_ReturnInteger() {
        assertEquals(1, searchInsertPosition.searchInsert(new int[] {1}, 2));
    }

    @Test
    public void searchInsert_WithNums6_ReturnInteger() {
        assertEquals(1, searchInsertPosition.searchInsert(new int[] {1, 3}, 2));
    }

    @Test
    public void searchInsert_WithNums7_ReturnInteger() {
        assertEquals(2, searchInsertPosition.searchInsert(new int[] {1, 3, 5}, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchInsert_WithNullNums_ThrowsIllegalArgumentException() {
        searchInsertPosition.searchInsert(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void searchInsert_WithEmptyNums_ThrowsIllegalArgumentException() {
        searchInsertPosition.searchInsert(new int[]{}, 10);
    }
}