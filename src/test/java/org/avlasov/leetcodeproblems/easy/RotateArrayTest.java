package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 14/07/2018
 **/
public class RotateArrayTest {

    private RotateArray rotateArray;

    public RotateArrayTest() {
        rotateArray = new RotateArray();
    }

    @Test(expected = IllegalArgumentException.class)
    public void rotate_WithNullArray_ThrowsIllegalArgumentException() {
        rotateArray.rotateSecondSolution(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rotate_WithEmptyArray_ThrowsIllegalArgumentException() {
        rotateArray.rotateSecondSolution(new int[]{}, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rotate_WithNegativeK_ThrowsIllegalArgumentException() {
        rotateArray.rotateSecondSolution(new int[] {1, 2, 3, 4, 5, 6, 7}, -1);
    }

    @Test
    public void rotateSecondSolution_WithArray1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotateSecondSolution(array, 3);
        assertArrayEquals(result, array);
    }

    @Test
    public void rotateSecondSolution_WithFullRotateKValue() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotateSecondSolution(array, array.length * 2);
        assertArrayEquals(result, array);
    }

    @Test
    public void rotateSecondSolution_WithArray2() {
        int[] array = {-1, -100, 3, 99};
        int[] result = {3, 99, -1, -100};
        rotateArray.rotateSecondSolution(array, 2);
        assertArrayEquals(result, array);
     }

    @Test
    public void rotate_WithArray1() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotate(array, 3);
        assertArrayEquals(result, array);
    }

    @Test
    public void rotate_WithFullRotateKValue() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] result = {1, 2, 3, 4, 5, 6, 7};
        rotateArray.rotate(array, array.length * 2);
        assertArrayEquals(result, array);
    }

    @Test
    public void rotate_WithArray2() {
        int[] array = {-1, -100, 3, 99};
        int[] result = {3, 99, -1, -100};
        rotateArray.rotate(array, 2);
        assertArrayEquals(result, array);
     }

    @Test
    public void rotate_WithArray3() {
        int[] array = {1, 2};
        int[] result = {2, 1};
        rotateArray.rotate(array, 1);
        assertArrayEquals(result, array);
     }

    @Test
    public void rotate_WithArray4() {
        int[] array = {-1, -100, 3, 99};
        int[] result = {-100, 3, 99, -1};
        rotateArray.rotate(array, 3);
        assertArrayEquals(result, array);
    }

    @Test
    public void rotate_WithArray5() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] result = {4, 5, 6, 1, 2, 3};
        rotateArray.rotate(array, 3);
        assertArrayEquals(result, array);
    }

}