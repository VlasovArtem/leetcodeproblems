package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 14/07/2018
 **/
public class FactorialTrailingZeroesTest {

    private FactorialTrailingZeroes factorialTrailingZeroes;

    public FactorialTrailingZeroesTest() {
        factorialTrailingZeroes = new FactorialTrailingZeroes();
    }

    @Test
    public void trailingZeroes_WithNumberZero_ReturnOne() {
        assertEquals(0, factorialTrailingZeroes.trailingZeroes(0));
    }

    @Test
    public void trailingZeroes_WithoutTrailingZeroes_ReturnZero() {
        assertEquals(0, factorialTrailingZeroes.trailingZeroes(4));
    }

    @Test
    public void trailingZeroes_WithSingleTrailingZero_ReturnOne() {
        assertEquals(1, factorialTrailingZeroes.trailingZeroes(5));
    }

    @Test
    public void trailingZeroes_WithTwoTrailingZero_ReturnTwo() {
        assertEquals(2, factorialTrailingZeroes.trailingZeroes(10));
    }

    @Test
    public void trailingZeroes_WithTrailingZero1_ReturnInteger() {
        assertEquals(2, factorialTrailingZeroes.trailingZeroes(13));
    }

    @Test
    public void trailingZeroes_WithTrailingZero2_ReturnInteger() {
        assertEquals(7, factorialTrailingZeroes.trailingZeroes(30));
    }

    @Test(expected = IllegalArgumentException.class)
    public void trailingZeroes_WithNegativeInteger_ThrowsIllegalArgumentException() {
        factorialTrailingZeroes.trailingZeroes(-1);
    }

}