package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 15/07/2018
 **/
public class HouseRobberTest {

    private HouseRobber houseRobber;

    public HouseRobberTest() {
        houseRobber = new HouseRobber();
    }

    @Test
    public void rob_WithArray1_ReturnInteger() {
        assertEquals(12, houseRobber.rob(new int[] {2, 7, 9, 3, 1}));

    }

    @Test
    public void rob_WithArray2_ReturnInteger() {
        assertEquals(4, houseRobber.rob(new int[] {1, 2, 3, 1}));
    }

    @Test
    public void rob_WithArray3_ReturnInteger() {
        assertEquals(4, houseRobber.rob(new int[] {2, 1, 1, 2}));
    }

    @Test
    public void rob_WithArray4_ReturnInteger() {
        assertEquals(21, houseRobber.rob(new int[] {2, 7, 9, 10, 10}));
    }

    @Test
    public void rob_WithArray5_ReturnInteger() {
        assertEquals(14, houseRobber.rob(new int[] {4, 1, 2, 7, 5, 3, 1}));
    }

    @Test
    public void rob_WithEmptyArray_ReturnInteger() {
        assertEquals(0, houseRobber.rob(new int[] {}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void rob_WithNullArray_ThrowsIllegalArgumentException() {
        houseRobber.rob(null);
    }

}