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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode node, int depthTree, List<List<Integer>> list){
        if(node == null) return;

        if(depthTree == list.size()){
            list.add(new ArrayList<>());
        }
        list.get(depthTree).add(node.val);

        dfs(node.left, depthTree + 1, list);
        dfs(node.right, depthTree + 1, list);
    }
}
/*
My idea: 

helper method dfs(root, depthTree, list)
base case

if(depthTree == list.size)
    result.add

dfs(root.left)
dfs(root.right)
*/
