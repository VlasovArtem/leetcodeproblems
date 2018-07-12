package org.avlasov.leetcodeproblems.easy;


import org.avlasov.leetcodeproblems.utils.ListNodeUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created By artemvlasov on 12/07/2018
 **/
public class IntersectionOfTwoLinkedListsTest {

    private IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists;

    public IntersectionOfTwoLinkedListsTest() {
        intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    }

    @Test
    public void getIntersectionNode_WithIntersections1_ReturnListNode() {
        IntersectionOfTwoLinkedLists.ListNode headA = ListNodeUtils.createListNodeForIntersection(1, 2);
        IntersectionOfTwoLinkedLists.ListNode headB = ListNodeUtils.createListNodeForIntersection(1, 2);
        IntersectionOfTwoLinkedLists.ListNode intersection = ListNodeUtils.createListNodeForIntersection(3, 4, 5);
        headA.next = intersection;
        headB.next = intersection;
        IntersectionOfTwoLinkedLists.ListNode result = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
        assertNotNull(result);
        assertEquals(intersection, result);
    }

    @Test
    public void getIntersectionNode_WithIntersections2_ReturnListNode() {
        IntersectionOfTwoLinkedLists.ListNode headA = ListNodeUtils.createListNodeForIntersection(1, 2, 4, 5, 6, 7, 8);
        IntersectionOfTwoLinkedLists.ListNode headB = ListNodeUtils.createListNodeForIntersection(1, 2);
        IntersectionOfTwoLinkedLists.ListNode intersection = ListNodeUtils.createListNodeForIntersection(3, 4, 5);
        headA.next = intersection;
        headB.next = intersection;
        IntersectionOfTwoLinkedLists.ListNode result = intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB);
        assertNotNull(result);
        assertEquals(intersection, result);
    }

    @Test
    public void getIntersectionNode_WithoutIntersections_ReturnListNode() {
        IntersectionOfTwoLinkedLists.ListNode headA = new IntersectionOfTwoLinkedLists.ListNode(1);
        headA.next = new IntersectionOfTwoLinkedLists.ListNode(2);
        IntersectionOfTwoLinkedLists.ListNode headB = new IntersectionOfTwoLinkedLists.ListNode(1);
        headB.next = new IntersectionOfTwoLinkedLists.ListNode(2);
        assertNull(intersectionOfTwoLinkedLists.getIntersectionNode(headA, headB));
    }

    @Test
    public void getIntersectionNode_WithHeadANull_ReturnNull() {
        assertNull(intersectionOfTwoLinkedLists.getIntersectionNode(null, new IntersectionOfTwoLinkedLists.ListNode(1)));
    }

    @Test
    public void getIntersectionNode_WithHeadBNull_ReturnNull() {
        assertNull(intersectionOfTwoLinkedLists.getIntersectionNode(new IntersectionOfTwoLinkedLists.ListNode(1), null));
    }

}