package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 22/07/2018
 **/
public class IsomorphicStringsTest {
    
    private IsomorphicStrings isomorphicStrings;

    public IsomorphicStringsTest() {
        isomorphicStrings = new IsomorphicStrings();
    }

    @Test
    public void isIsomorphic_WithIsomorphicData1_ReturnTrue() {
        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
    }
    
    @Test
    public void isIsomorphic_WithIsomorphicData2_ReturnTrue() {
        assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));
    }
    
    @Test
    public void isIsomorphic_WithNotIsomorphicData1_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
    }

    @Test
    public void isIsomorphic_WithNotIsomorphicData2_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphic("aa", "ab"));
    }

    @Test
    public void isIsomorphic_WithNotIsomorphicData3_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphic("ab", "aa"));
    }
    
    @Test
    public void isIsomorphic_WithNullS_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphic(null, "test"));
    }
    
    @Test
    public void isIsomorphic_WithNullT_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphic("test", null));
    }
    
    @Test
    public void isIsomorphic_WithNotMatchingLength_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphic("test", "test1"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithIsomorphicData1_ReturnTrue() {
        assertTrue(isomorphicStrings.isIsomorphicSecondSolution("egg", "add"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithIsomorphicData2_ReturnTrue() {
        assertTrue(isomorphicStrings.isIsomorphicSecondSolution("paper", "title"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithNotIsomorphicData1_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphicSecondSolution("foo", "bar"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithNotIsomorphicData2_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphicSecondSolution("aa", "ab"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithNotIsomorphicData3_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphicSecondSolution("ab", "aa"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithNullS_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphicSecondSolution(null, "test"));
    }

    @Test
    public void isIsomorphicSecondSolution_WithNullT_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphicSecondSolution("test", null));
    }

    @Test
    public void isIsomorphicSecondSolution_WithNotMatchingLength_ReturnFalse() {
        assertFalse(isomorphicStrings.isIsomorphicSecondSolution("test", "test1"));
    }
    
}