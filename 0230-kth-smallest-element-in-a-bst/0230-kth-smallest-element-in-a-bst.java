/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /**public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> kth = inorder(root);
        return kth.get(k-1);
    }

    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root==null)
        return list;

        list.addAll(inorder(root.left));
        list.add(root.val);
        list.addAll(inorder(root.right));

        return list;
    }**/

    int count=0;

    public int kthSmallest(TreeNode root, int k) {
        
       if(root==null)
        return -1;

        int left =  kthSmallest(root.left, k);
        if(left!=-1)
        return left;
        count++;

        if(count==k)
        return root.val;

        return kthSmallest(root.right, k);
    }
}