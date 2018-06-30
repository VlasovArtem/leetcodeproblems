package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;
import org.avlasov.leetcodeproblems.utils.ListNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 30/06/2018
 **/
public class RemoveDuplicatesSortedListTest {

    private RemoveDuplicatesSortedList removeDuplicatesSortedList;

    public RemoveDuplicatesSortedListTest() {
        removeDuplicatesSortedList = new RemoveDuplicatesSortedList();
    }

    @Test
    public void deleteDuplicates_WithListNode1_ReturnListNode() {
        ListNode listNode = removeDuplicatesSortedList.deleteDuplicates(ListNodeUtils.createListNode(1, 1, 2));
        assertNotNull(listNode);
        assertEquals(ListNodeUtils.createListNode(1, 2), listNode);
    }

    @Test
    public void deleteDuplicates_WithListNode2_ReturnListNode() {
        ListNode listNode = removeDuplicatesSortedList.deleteDuplicates(ListNodeUtils.createListNode(1, 1, 2, 3, 3));
        assertNotNull(listNode);
        assertEquals(ListNodeUtils.createListNode(1, 2, 3), listNode);
    }

    @Test
    public void deleteDuplicates_WithNullListNode_ReturnNull() {
        ListNode listNode = removeDuplicatesSortedList.deleteDuplicates(null);
        assertNull(listNode);
    }

    @Test
    public void deleteDuplicates_WithNullNextListNode_ReturnListNode() {
        ListNode listNode = removeDuplicatesSortedList.deleteDuplicates(ListNodeUtils.createListNode(1));
        assertNotNull(listNode);
        assertEquals(ListNodeUtils.createListNode(1), listNode);
    }
}