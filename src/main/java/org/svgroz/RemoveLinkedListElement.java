package org.svgroz;

import org.svgroz.structs.ListNode;

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
        final ListNode result = new ListNode();
        result.next = head;
        ListNode prev = result;

        while (prev != null && prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return result.next;
    }
}
