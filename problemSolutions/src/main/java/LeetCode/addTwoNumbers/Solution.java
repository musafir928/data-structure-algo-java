package LeetCode.addTwoNumbers;

class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy_head = new ListNode(0);
        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int current_sum = l1_val + l2_val + carry;
            carry = current_sum / 10;
            int last_digit = current_sum % 10;

            ListNode new_node = new ListNode(last_digit);
            dummy_head.next = new_node;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            dummy_head = dummy_head.next;

        }
        if (carry > 0) {
            ListNode new_node = new ListNode(carry);
            dummy_head.next = new_node;
            dummy_head = dummy_head.next;
        }

        return dummy_head.next;

    }
}
