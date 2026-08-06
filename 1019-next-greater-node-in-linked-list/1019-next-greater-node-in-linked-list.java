class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {

            ListNode temp = curr.next;
            int ans = 0;

            while (temp != null) {
                if (temp.val > curr.val) {
                    ans = temp.val;
                    break;
                }
                temp = temp.next;
            }

            list.add(ans);
            curr = curr.next;
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}