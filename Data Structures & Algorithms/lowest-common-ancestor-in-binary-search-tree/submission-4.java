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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;

        while( curr != null){
            if(p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            }else if(p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            }else{
                return curr;
            }
        }

        return null;
    }
}
/*
My idea:
1) check that if both p and q > root => Moving to right side
2) check that if both p and q < root => Moving to left side
else(q < x < p){
    return root (means return x which is LCA);
}
*/
