package org.avlasov.leetcodeproblems;

import org.avlasov.leetcodeproblems.data.ListNode;
import org.junit.Test;

import static org.avlasov.leetcodeproblems.utils.ListNodeUtils.createListNode;
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
        ListNode listNode = addTwoNumbers.addTwoNumbers(createListNode(2, 4, 3), createListNode(5, 6, 4));
        assertNotNull(listNode);
        assertEquals(createListNode(7, 0, 8), listNode);
    }

    @Test
    public void addTwoNumbers_WithZero_ReturnListNode() {
        ListNode listNode = addTwoNumbers.addTwoNumbers(new ListNode(0), new ListNode(0));
        assertNotNull(listNode);
        assertEquals(new ListNode(0), listNode);
    }

    @Test
    public void addTwoNumbers_WithNotMatchingSizeNumbers_ReturnListNode() {
        ListNode listNode = addTwoNumbers.addTwoNumbers(createListNode(6, 5, 3, 2), createListNode(8, 3, 6));
        assertNotNull(listNode);
        assertEquals(createListNode(4, 9, 9, 2), listNode);
    }

    @Test
    public void addTwoNumbers_WithSingleNumberExtendedToAdditionalNumber_ReturnListNode() {
        ListNode listNode = addTwoNumbers.addTwoNumbers(createListNode(5), createListNode(5));
        assertNotNull(listNode);
        assertEquals(createListNode(0, 1), listNode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTwoNumbers_WithNullFirstArgument_ThrowsIllegalArgumentException() {
        addTwoNumbers.addTwoNumbers(null, createListNode(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTwoNumbers_WithNullSecondArgument_ThrowsIllegalArgumentException() {
        addTwoNumbers.addTwoNumbers(createListNode(2), null);
    }

}
