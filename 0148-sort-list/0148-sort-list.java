/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
        return head;

        ListNode middle = findMiddle(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge(leftHead, rightHead);
    }

    ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode tmp = dummy;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                tmp.next = list1;
                tmp = list1;
                list1 = list1.next;
            }
            else{
                tmp.next = list2;
                tmp = list2;
                list2 = list2.next;
            }
        }

        if(list1!=null){
            tmp.next = list1;
        }
        else{
            tmp.next = list2;
        }

        return dummy.next;
    }
}