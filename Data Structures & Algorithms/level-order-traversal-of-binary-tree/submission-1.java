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
        List<List<Integer>> list = new ArrayList<>();
        dfs(root, 0, list);
        return list;
    }
    private void dfs(TreeNode node, int depthTree, List<List<Integer>> list){
        if(node == null){
            return;
        }
        if(list.size() == depthTree){
            //create a list inside the list
            list.add(new ArrayList<>());
        }
        //add node value inside the list of list
        list.get(depthTree).add(node.val);

        //using recursion going with the left side first
        dfs(node.left, depthTree + 1, list);
        //then apply rec for right side later
        dfs(node.right, depthTree + 1, list);
    }  
}
/*
The idea for this one is we will use the linkedlist with the tree
We check that if the size inside the list equal to the depth of tree 
    + create a list inside the list
We will add the current node to the list of the list
We will apply recursion for the right side and left sidex

*/
