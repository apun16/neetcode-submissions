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
    private int result = -1;
    private int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }
    
    public void inorder(TreeNode node, int k) {
        if (node == null || result != -1) {
            return;
        }

        inorder(node.left, k);
        if (result != -1) {
            return;
        }
        count++;
        if (count == k) {
            result = node.val;
        }

        inorder(node.right, k);
    }
}