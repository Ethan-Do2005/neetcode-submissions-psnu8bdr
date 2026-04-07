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
        if(root == null || p == null || q == null) return null;
        
        if(Math.min(p.val,q.val) > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }else if(Math.max(p.val,q.val) < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else{
            return root;
        }
    }
}
/*
Test case 
[5,3,8,1,4,7,9,2] p = 3, q = 8
Output: 5
*/
