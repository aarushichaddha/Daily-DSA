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
    public int[] nextLargerNodes(ListNode head) {
        
        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;
        while(curr!=null){
            ListNode tmp = curr.next;
            int ans = 0;

            while(tmp!=null){
                if(curr.val<tmp.val){
                    ans = tmp.val;
                    break;
                }
                tmp = tmp.next;

            }

            list.add(ans);
            curr = curr.next;
        }

        int arr[] = new int[list.size()];

        for(int i=0;i<list.size();i++){
            arr[i] = list.get(i);
        }

        return arr;
    }
}