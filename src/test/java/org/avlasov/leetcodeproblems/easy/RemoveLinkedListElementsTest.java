package org.avlasov.leetcodeproblems.easy;

import org.avlasov.leetcodeproblems.data.ListNode;
import org.avlasov.leetcodeproblems.utils.ListNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created By artemvlasov on 16/07/2018
 **/
public class RemoveLinkedListElementsTest {

    private RemoveLinkedListElements removeLinkedListElements;

    public RemoveLinkedListElementsTest() {
        removeLinkedListElements = new RemoveLinkedListElements();
    }

    @Test
    public void removeElements_WithListNode1_ReturnListNode() {
        ListNode result = ListNodeUtils.createListNode(2, 3, 4, 5, 6, 2);
        ListNode listNode = ListNodeUtils.createListNode(1, 2, 3, 4, 5, 6, 1, 2);
        listNode = removeLinkedListElements.removeElements(listNode, 1);
        assertEquals(result, listNode);
    }

    @Test
    public void removeElements_WithListNodeContainsOnlyRemoveValue_ReturnNull() {
        ListNode listNode = ListNodeUtils.createListNode(1, 1, 1, 1, 1);
        assertNull(removeLinkedListElements.removeElements(listNode, 1));
    }

    @Test
    public void removeElements_WithNullListNode_returnNull() {
        assertNull(removeLinkedListElements.removeElements(null, 10));
    }
    
}