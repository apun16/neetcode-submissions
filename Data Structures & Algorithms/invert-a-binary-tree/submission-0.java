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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);

        return root;
    }
}

/*
I LOVE TREES!!! 

returnType function(input) {
    if (base case) {
        return something;
    }

    // recursive step (call same function on smaller input)
    function(smallerInput);

    return result;
}

(struct node (val left right))
A tree is either:
- empty
- or (node value left-subtree right-subtree)

(define (invert-tree t)
  (cond
    [(empty? t) empty]
    [else
     (node (node-val t)
           (invert-tree (node-right t))
           (invert-tree (node-left t)))]))

What temp is for
t.left is about to be overwritten (by invertTree(t.right)).

t.left = invertTree(t.right);
first, then t.left is gone and you no longer have access to the original left subtree.
But you still need that original left subtree to assign it to t.right after the recursive call.
So you must save it before you overwrite t.left:
*/