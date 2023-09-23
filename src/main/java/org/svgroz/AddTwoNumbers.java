package org.svgroz;

import org.svgroz.structs.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int buff = 0;
        final ListNode result = new ListNode(-1);
        ListNode current = result;

        while (l1 != null || l2 != null || buff != 0) {
            int lv = l1 == null ? 0 : l1.val;
            int rv = l2 == null ? 0 : l2.val;

            int v = lv + rv + buff;
            current.next = new ListNode(v > 9 ? v - 10 : v);
            current = current.next;
            buff = v > 9 ? 1 : 0;

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        return result.next;
    }
}
