package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 25/06/2018
 **/
public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    public ValidParenthesesTest() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void isValid_WithCorrectClosedBrackets1_ReturnTrue() {
        assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void isValid_WithCorrectClosedBrackets2_ReturnTrue() {
        assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void isValid_WithCorrectClosedBrackets3_ReturnTrue() {
        assertTrue(validParentheses.isValid("{[]}"));
    }

    @Test
    public void isValid_WithCorrectClosedBrackets4_ReturnTrue() {
        assertTrue(validParentheses.isValid("(([]){})"));
    }

    @Test
    public void isValid_WithNotCorrectClosedBrackets1_ReturnFalse() {
        assertFalse(validParentheses.isValid("([)]"));
    }

    @Test
    public void isValid_WithNotCorrectClosedBrackets2_ReturnFalse() {
        assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void isValid_WithNotCorrectClosedBrackets3_ReturnFalse() {
        assertFalse(validParentheses.isValid("()]"));
    }

    @Test
    public void isValid_WithNotCorrectClosedBrackets4_ReturnFalse() {
        assertFalse(validParentheses.isValid("(("));
    }

    @Test
    public void isValid_WithNullString_ReturnFalse() {
        assertFalse(validParentheses.isValid(null));
    }

    @Test
    public void isValid_WithSingleCharacter_ReturnFalse() {
        assertFalse(validParentheses.isValid("["));
    }

    @Test
    public void isValid_WithEmptyString_ReturnFalse() {
        assertTrue(validParentheses.isValid(""));
    }

    @Test
    public void isValidSecondSolution_WithCorrectClosedBrackets1_ReturnTrue() {
        assertTrue(validParentheses.isValidSecondSolution("()"));
    }

    @Test
    public void isValidSecondSolution_WithCorrectClosedBrackets2_ReturnTrue() {
        assertTrue(validParentheses.isValidSecondSolution("()[]{}"));
    }

    @Test
    public void isValidSecondSolution_WithCorrectClosedBrackets3_ReturnTrue() {
        assertTrue(validParentheses.isValidSecondSolution("{[]}"));
    }

    @Test
    public void isValidSecondSolution_WithCorrectClosedBrackets4_ReturnTrue() {
        assertTrue(validParentheses.isValidSecondSolution("(([]){})"));
    }

    @Test
    public void isValidSecondSolution_WithNotCorrectClosedBrackets1_ReturnFalse() {
        assertFalse(validParentheses.isValidSecondSolution("([)]"));
    }

    @Test
    public void isValidSecondSolution_WithNotCorrectClosedBrackets2_ReturnFalse() {
        assertFalse(validParentheses.isValidSecondSolution("(]"));
    }

    @Test
    public void isValidSecondSolution_WithNotCorrectClosedBrackets3_ReturnFalse() {
        assertFalse(validParentheses.isValidSecondSolution("()]"));
    }

    @Test
    public void isValidSecondSolution_WithNotCorrectClosedBrackets4_ReturnFalse() {
        assertFalse(validParentheses.isValidSecondSolution("(("));
    }

    @Test
    public void isValidSecondSolution_WithNullString_ReturnFalse() {
        assertFalse(validParentheses.isValidSecondSolution(null));
    }

    @Test
    public void isValidSecondSolution_WithSingleCharacter_ReturnFalse() {
        assertFalse(validParentheses.isValidSecondSolution("["));
    }

    @Test
    public void isValidSecondSolution_WithEmptyString_ReturnFalse() {
        assertTrue(validParentheses.isValidSecondSolution(""));
    }

}