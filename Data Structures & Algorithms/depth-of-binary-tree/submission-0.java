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
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int mL = maxDepth(root.left);
        int mR = maxDepth(root.right);

        return Math.max(mL, mR) + 1;
    }
}

/*
in racket:
(define (max-depth t)
  (cond
    [(empty? t) 0]
    [else
     (+ 1
        (max (max-depth (node-left t))
             (max-depth (node-right t))))]))
*/