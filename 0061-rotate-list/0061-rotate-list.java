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
    public ListNode rotateRight(ListNode head, int k) {
        int count=1;
        if(head==null || k==0 || head.next==null) return head;

        ListNode tail = head;
        while(tail.next!=null){
            tail = tail.next;
            count++;
        }

        k = k%count;
        tail.next=head;
        ListNode tmp = head;
        int pos = count-k-1;
        for(int i=0;i<pos;i++){
            tmp = tmp.next;
        }

        head = tmp.next;
        tmp.next = null;
        return head;
    }
}