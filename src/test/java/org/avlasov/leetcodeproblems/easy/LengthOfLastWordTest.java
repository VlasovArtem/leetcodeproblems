package org.avlasov.leetcodeproblems.easy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 27/06/2018
 **/
public class LengthOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord;

    public LengthOfLastWordTest() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    public void lengthOfLastWord_WithWords1_ReturnInteger() {
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
    }

    @Test
    public void lengthOfLastWord_WithSingleWord_ReturnZero() {
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("test"));
    }

    @Test
    public void lengthOfLastWord_WithSingleWord1_ReturnZero() {
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("a"));
    }

    @Test
    public void lengthOfLastWord_WithSingleWord2_ReturnZero() {
        assertEquals(1, lengthOfLastWord.lengthOfLastWord("a "));
    }

    @Test
    public void lengthOfLastWord_WithNullString_ReturnZero() {
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(null));
    }

    @Test
    public void lengthOfLastWord_WithEmptyString_ReturnZero() {
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(""));
    }

    @Test
    public void lengthOfLastWord_WithSpaceString_ReturnZero() {
        assertEquals(0, lengthOfLastWord.lengthOfLastWord(" "));
    }

}