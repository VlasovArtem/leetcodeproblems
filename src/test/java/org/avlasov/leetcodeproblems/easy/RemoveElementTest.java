package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 26/06/2018
 **/
public class RemoveElementTest {

    private RemoveElement removeElement;

    public RemoveElementTest() {
        removeElement = new RemoveElement();
    }

    @Test
    public void removeElement_WithArray1_ReturnInteger() {
        verifyData(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, new int[] {0, 1, 3, 0, 4}, 2);
    }

    @Test
    public void removeElement_WithArray2_ReturnInteger() {
        verifyData(new int[]{3, 2, 2, 3}, new int[]{2, 2}, 3);
    }

    @Test
    public void removeElement_WithNullArray_ReturnZero() {
        assertEquals(0, removeElement.removeElement(null, 0));
    }

    @Test
    public void removeElement_WithEmptyArray_ReturnZero() {
        assertEquals(0, removeElement.removeElement(new int[]{}, 0));
    }

    private void verifyData(int[] data, int[] result, int valueToRemove) {
        int i = removeElement.removeElement(data, valueToRemove);
        assertEquals(result.length, i);
        for (int j = 0; j < i; j++) {
            assertEquals(result[j], data[j]);
        }
    }

}