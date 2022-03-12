package LeetCode.addTwoNumbers;


public class LinkedList_AddTwoNumbers {

    // todo: add unit test

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        ListNode current = listNode;
        while (current != null) {
            System.out.println(current.val);
            current = current.next;

        }

        ListNode listNode1 = Solution.addTwoNumbers(l1, l2);
        ListNode current1 = listNode;
        while (current1 != null) {
            System.out.println(current1.val);
            current1 = current1.next;

        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        helper(l1, l2, l);
        return l;
    }

    public static void helper(ListNode l1, ListNode l2, ListNode l) {
        if (l1 == null && l2 == null) {
            return;
        }
        int v1;
        int v2;
        if (l1 == null) {
            v1 = 0;
        } else {
            v1 = l1.val;
            l1 = l1.next;
        }
        if (l2 == null) {
            v2 = 0;
        } else {
            v2 = l2.val;
            l2 = l2.next;
        }

        int current = (l.val + v1 + v2);
        int nextVal = current > 9 ? 1 : 0;
        current = current > 9 ? current - 10  : current;
        l.val = current;
        if (nextVal == 1) {
            l.next = new ListNode(nextVal);
            helper(l1, l2, l.next);
        } else {
            if (l1 == null && l2==null) {
                return;
            } else {
                l.next = new ListNode(0);
                helper(l1, l2, l.next);
            }
        }

    }
}

