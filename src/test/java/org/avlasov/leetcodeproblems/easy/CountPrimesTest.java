package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 16/07/2018
 **/
public class CountPrimesTest {

    private CountPrimes countPrimes;

    public CountPrimesTest() {
        countPrimes = new CountPrimes();
    }

    @Test
    public void countPrimes_WithNumber1_ReturnInteger() {
        assertEquals(4, countPrimes.countPrimes(10));
    }

    @Test
    public void countPrimes_WithNumber2_ReturnInteger() {
        assertEquals(5, countPrimes.countPrimes(12));
    }

    @Test
    public void countPrimes_WithNumber3_ReturnInteger() {
        countPrimes.countPrimes(499979);
    }

    @Test
    public void countPrimes_WithNegativeNumber_ReturnZero() {
        assertEquals(0, countPrimes.countPrimes(-1));
    }

    @Test
    public void countPrimes_WithZeroNumber_ReturnZero() {
        assertEquals(0, countPrimes.countPrimes(0));
    }

    @Test
    public void countPrimes_WithNumberOne_ReturnZero() {
        assertEquals(0, countPrimes.countPrimes(1));
    }

}