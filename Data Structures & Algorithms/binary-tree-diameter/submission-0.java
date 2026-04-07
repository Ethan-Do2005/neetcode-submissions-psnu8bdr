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
    int maxDiameter = 0;
    int depth(TreeNode node){
        if( node == null) return 0;
        int leftNode = depth(node.left);
        int rightNode = depth(node.right);
        maxDiameter = Math.max(maxDiameter, leftNode + rightNode);
        return Math.max(leftNode,rightNode) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        depth(root);
        return maxDiameter;
    }
}
