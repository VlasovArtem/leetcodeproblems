package org.avlasov.leetcodeproblems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created By artemvlasov on 20/06/2018
 **/
public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;

    public AddTwoNumbersTest() {
        addTwoNumbers = new AddTwoNumbers();
    }

    @Test
    public void addTwoNumbers_WithValidData_ReturnListNode() {
        AddTwoNumbers.ListNode listNode = addTwoNumbers.addTwoNumbers(addTwoNumbers.createListNode(2, 4, 3), addTwoNumbers.createListNode(5, 6, 4));
        assertNotNull(listNode);
        assertEquals(addTwoNumbers.createListNode(7, 0, 8), listNode);
    }

    @Test
    public void addTwoNumbers_WithZero_ReturnListNode() {
        AddTwoNumbers.ListNode listNode = addTwoNumbers.addTwoNumbers(addTwoNumbers.new ListNode(0), addTwoNumbers.new ListNode(0));
        assertNotNull(listNode);
        assertEquals(addTwoNumbers.new ListNode(0), listNode);
    }

    @Test
    public void addTwoNumbers_WithNotMatchingSizeNumbers_ReturnListNode() {
        AddTwoNumbers.ListNode listNode = addTwoNumbers.addTwoNumbers(addTwoNumbers.createListNode(6, 5, 3, 2), addTwoNumbers.createListNode(8, 3, 6));
        assertNotNull(listNode);
        assertEquals(addTwoNumbers.createListNode(4, 9, 9, 2), listNode);
    }

    @Test
    public void addTwoNumbers_WithSingleNumberExtendedToAddtionalNumber_ReturnListNode() {
        AddTwoNumbers.ListNode listNode = addTwoNumbers.addTwoNumbers(addTwoNumbers.createListNode(5), addTwoNumbers.createListNode(5));
        assertNotNull(listNode);
        assertEquals(addTwoNumbers.createListNode(0, 1), listNode);
    }



    @Test(expected = IllegalArgumentException.class)
    public void addTwoNumbers_WithNullFirstArgument_ThrowsIllegalArgumentException() {
        addTwoNumbers.addTwoNumbers(null, addTwoNumbers.createListNode(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTwoNumbers_WithNullSecondArgument_ThrowsIllegalArgumentException() {
        addTwoNumbers.addTwoNumbers(addTwoNumbers.createListNode(2), null);
    }

}
