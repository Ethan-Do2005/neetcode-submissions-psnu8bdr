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

        while(curr != null){
            if(p.val > curr.val && q.val > curr.val){
                curr = curr.right;
            }else if (p.val < curr.val && q.val < curr.val){
                curr = curr.left;
            }else{
                return curr;
            }
        }

        return null;
    }
}
/*
Test case 
[5,3,8,1,4,7,9,2] p = 3, q = 8
Output: 5
*/
