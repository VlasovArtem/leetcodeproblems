package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 30/06/2018
 **/
public class ClimbingStairsTest {

    private ClimbingStairs climbingStairs;

    public ClimbingStairsTest() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    public void climbStairs_WithZeroNumber_ReturnZero() {
        assertEquals(0, climbingStairs.climbStairs(0));
    }

    @Test
    public void climbStairs_WithNumber1_ReturnInteger() {
        assertEquals(1, climbingStairs.climbStairs(1));
    }

    @Test
    public void climbStairs_WithNumber2_ReturnInteger() {
        assertEquals(2, climbingStairs.climbStairs(2));
    }

    @Test
    public void climbStairs_WithNumber3_ReturnInteger() {
        assertEquals(3, climbingStairs.climbStairs(3));
    }

    @Test
    public void climbStairs_WithNumber4_ReturnInteger() {
        assertEquals(5, climbingStairs.climbStairs(4));
    }

    @Test
    public void climbStairs_WithNumber5_ReturnInteger() {
        assertEquals(8, climbingStairs.climbStairs(5));
    }

    @Test
    public void climbStairs_WithNumber6_ReturnInteger() {
        assertEquals(13, climbingStairs.climbStairs(6));
    }

    @Test
    public void climbStairs_WithNumber7_ReturnInteger() {
        assertEquals(21, climbingStairs.climbStairs(7));
    }

    @Test
    public void climbStairs_WithNumber8_ReturnInteger() {
        assertEquals(34, climbingStairs.climbStairs(8));
    }

    @Test
    public void climbStairs_WithNumber9_ReturnInteger() {
        assertEquals(55, climbingStairs.climbStairs(9));
    }

    @Test
    public void climbStairs_WithNumber10_ReturnInteger() {
        assertEquals(89, climbingStairs.climbStairs(10));
    }

    @Test(expected = IllegalArgumentException.class)
    public void climbStairs_WithNegativeNumbers_ThrowsIllegalArgumentException() {
        climbingStairs.climbStairs(-1);
    }
}