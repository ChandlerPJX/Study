package LeetcodeDemo;


public class Demo_21 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // 比较大小，把较小的连接到头下面并且后移
        if (list1.val < list2.val) {
            // 如果l1的元素比2小，就把1的下一个与2中的小的挂在1后面。
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }


}
