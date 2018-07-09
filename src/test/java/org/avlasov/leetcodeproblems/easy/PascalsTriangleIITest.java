package org.avlasov.leetcodeproblems.easy;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created By artemvlasov on 09/07/2018
 **/
public class PascalsTriangleIITest {

    private PascalsTriangleII pascalsTriangleII;
    private PascalsTriangle pascalsTriangle;

    public PascalsTriangleIITest() {
        pascalsTriangleII = new PascalsTriangleII();
        pascalsTriangle = new PascalsTriangle();
    }

    @Test
    public void getRow_WithFirstRow_ReturnCollection() {
        testGetRowWithIndex(1);
    }

    @Test
    public void getRow_WithSecondRow_ReturnCollection() {
        testGetRowWithIndex(2);
    }

    @Test
    public void getRow_WithThirdRow_ReturnCollection() {
        testGetRowWithIndex(3);
    }

    @Test
    public void getRow_WithFourthRow_ReturnCollection() {
        testGetRowWithIndex(4);
    }

    @Test
    public void getRow_WithFiveRow_ReturnCollection() {
        testGetRowWithIndex(5);
    }

    @Test
    public void getRow_WithNegativeNumber_ReturnEmptyCollection() {
        assertThat(pascalsTriangleII.getRow(-1), IsEmptyCollection.empty());
    }

    private void testGetRowWithIndex(int index) {
        if (index > 0) {
            List<List<Integer>> generate = pascalsTriangle.generate(index);
            assertEquals(generate.get(generate.size() - 1), pascalsTriangleII.getRow(index - 1));
        }
    }

}