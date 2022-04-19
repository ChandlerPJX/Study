package LeetcodeDemo;

/*
给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
输入：head = [1,1,2]
输出：[1,2]
 */
public class Demo_83 {

    public ListNode deleteDuplicates(ListNode head) {


        if(head == null){
            return head;
        }
        ListNode h = head;
        while (head.next != null && head != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return h;

    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
