package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created By artemvlasov on 20/06/2018
 **/
public class JewelsAndStonesTest {

    private JewelsAndStones jewelsAndStones;

    public JewelsAndStonesTest() {
        jewelsAndStones = new JewelsAndStones();
    }

    @Test
    public void numJewelsInStones_WithText1_ReturnInteger() {
        assertEquals(3, jewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    public void numJewelsInStones_WithText2_ReturnInteger() {
        assertEquals(0, jewelsAndStones.numJewelsInStones("z", "ZZ"));
    }

}
