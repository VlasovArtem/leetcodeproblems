package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;
import org.junit.Test;

import static org.avlasov.leetcodeproblems.utils.ListNodeUtils.createListNode;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created By artemvlasov on 23/07/2018
 **/
public class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    public ReverseLinkedListTest() {
        this.reverseLinkedList = new ReverseLinkedList();
    }

    @Test
    public void reverseList_WithListNode_ReturnListNode() {
        ListNode listNode = reverseLinkedList.reverseList(createListNode(1, 2, 3, 4, 5));
        assertNotNull(listNode);
        assertEquals(createListNode(5, 4, 3, 2, 1), listNode);
    }

    @Test
    public void reverseList_WithNullListNode_ReturnNull() {
        assertNotNull(reverseLinkedList.reverseList(null));
    }

}