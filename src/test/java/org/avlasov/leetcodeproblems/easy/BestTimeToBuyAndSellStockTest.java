package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 09/07/2018
 **/
public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock stock;

    public BestTimeToBuyAndSellStockTest() {
        stock = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void maxProfit_WithProfitArray1_ReturnInteger() {
        assertEquals(5, stock.maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfit_WithProfitArray2_ReturnInteger() {
        assertEquals(1, stock.maxProfit(new int[] {1, 2}));
    }

    @Test
    public void maxProfit_WithProfitArray3_ReturnInteger() {
        assertEquals(3, stock.maxProfit(new int[] {1, 2, 4}));
    }

    @Test
    public void maxProfit_WithoutProfitArray1_ReturnInteger() {
        assertEquals(0, stock.maxProfit(new int[] {7, 6, 4, 3, 1}));
    }

    @Test
    public void maxProfit_WithNullArray_ReturnZero() {
        assertEquals(0, stock.maxProfit(null));
    }

    @Test
    public void maxProfit_WithEmptyArray_ReturnZero() {
        assertEquals(0, stock.maxProfit(new int[]{}));
    }

    @Test
    public void maxProfit_WithOneArrayLength_ReturnZero() {
        assertEquals(0, stock.maxProfit(new int[]{1}));
    }

}