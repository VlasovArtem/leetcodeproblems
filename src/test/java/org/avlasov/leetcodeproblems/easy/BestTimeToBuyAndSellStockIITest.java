package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 09/07/2018
 **/
public class BestTimeToBuyAndSellStockIITest {

    private BestTimeToBuyAndSellStockII stockII;

    public BestTimeToBuyAndSellStockIITest() {
        stockII = new BestTimeToBuyAndSellStockII();
    }

    @Test
    public void maxProfit_WithArray1_ReturnInteger() {
        assertEquals(7, stockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void maxProfit_WithArray2_ReturnInteger() {
        assertEquals(4, stockII.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void maxProfit_WithArray3_ReturnInteger() {
        assertEquals(0, stockII.maxProfit(new int[]{7,6,4,3,1}));
    }

    @Test
    public void maxProfit_WithNullPrices_ReturnZero() {
        assertEquals(0, stockII.maxProfit(null));
    }

}