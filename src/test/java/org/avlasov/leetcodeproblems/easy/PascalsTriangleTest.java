package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.utils.PascalsTriangleUtils;
import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created By artemvlasov on 09/07/2018
 **/
public class PascalsTriangleTest {

    private PascalsTriangle pascalsTriangle;

    public PascalsTriangleTest() {
        pascalsTriangle = new PascalsTriangle();
    }

    @Test
    public void generate_WithOneRow_ReturnCollection() {
        assertEquals(PascalsTriangleUtils.generatePascalsTriangle(new int[]{1}), pascalsTriangle.generate(1));
    }

    @Test
    public void generate_WithTwoRows_ReturnCollection() {
        assertEquals(PascalsTriangleUtils.generatePascalsTriangle(new int[]{1, 1, 1}), pascalsTriangle.generate(2));
    }

    @Test
    public void generate_WithThreeRows_ReturnCollection() {
        assertEquals(PascalsTriangleUtils.generatePascalsTriangle(new int[]{1, 1, 1, 1, 2, 1}), pascalsTriangle.generate(3));
    }

    @Test
    public void generate_WithFourRows_ReturnCollection() {
        assertEquals(PascalsTriangleUtils.generatePascalsTriangle(new int[]{1, 1, 1, 1, 2, 1, 1, 3, 3, 1}), pascalsTriangle.generate(4));
    }

    @Test
    public void generate_WithFiveRows_ReturnCollection() {
        assertEquals(PascalsTriangleUtils.generatePascalsTriangle(new int[]{1, 1, 1, 1, 2, 1, 1, 3, 3, 1, 1, 4, 6, 4, 1}), pascalsTriangle.generate(5));
    }

    @Test
    public void generate_WithZeroRows_ReturnEmptyCollection() {
        assertThat(pascalsTriangle.generate(0), IsEmptyCollection.empty());
    }

    @Test
    public void generate_WithNegativeRows_ReturnEmptyCollection() {
        assertThat(pascalsTriangle.generate(-3), IsEmptyCollection.empty());
    }

}