package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 13/07/2018
 **/
public class MajorityElementTest {

    private MajorityElement majorityElement;

    public MajorityElementTest() {
        majorityElement = new MajorityElement();
    }

    @Test
    public void majorityElement_WithOneElementInArray_ReturnInteger() {
        int i = majorityElement.majorityElement(new int[]{1});
        assertEquals(1, i);
    }

    @Test
    public void majorityElement_WithTwoElementsInArray_ThrowsNoSuchElementException() {
        assertEquals(2, majorityElement.majorityElement(new int[]{2, 1}));
    }

    @Test
    public void majorityElement_WithArray1_ReturnInteger() {
        int i = majorityElement.majorityElement(new int[]{3, 2, 3});
        assertEquals(3, i);
    }

    @Test
    public void majorityElement_WithArray2_ReturnInteger() {
        int i = majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        assertEquals(2, i);
    }

    @Test
    public void majorityElement_WithArray3_ReturnInteger() {
        int i = majorityElement.majorityElement(new int[]{3, 2, 4, 2, 5, 2, 2});
        assertEquals(2, i);
    }

    @Test(expected = IllegalArgumentException.class)
    public void majorityElement_WithNullNums_ThrowsIllegalArgumentException() {
        majorityElement.majorityElement(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void majorityElement_WithEmptyNums_ThrowsIllegalArgumentException() {
        majorityElement.majorityElement(new int[]{});
    }

}