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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tmp = head;
            int count=0;
            
            while(count<k){
                if(tmp==null)
                return head;
                
                tmp = tmp.next;
                count++;
            }
            
            ListNode prevNode = reverseKGroup(tmp, k);
            
            tmp = head; count=0;
            
            while(count<k){
                ListNode next = tmp.next;
                tmp.next = prevNode;
                
                prevNode = tmp;
                tmp = next;
                
                count++;
            }
        
        return prevNode;
    }
}