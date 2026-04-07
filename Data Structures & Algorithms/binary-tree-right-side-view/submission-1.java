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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recureRightSide(root, 0, list);
        return list;
    }

    void recureRightSide(TreeNode node, int levels, List<Integer> list){
        if(node == null){
            return;
        }
        if(list.size() == levels){
            list.add(node.val);
        }
        recureRightSide(node.right, levels + 1, list);
        recureRightSide(node.left, levels + 1, list);
    }

}
/*
recure(1, [])
list : [1]
recure(3, [1])
list : [3]
recure(null, [1,3])

[1,3]
*/
/*
LinkedList and Tree
    Calling the list
    root
    return list
void Helper method (Node, linkedlist)
    if(node == null){
        return null
    }
    add current node (which means right node) into the linkedlist
    recursion for the helper method with (node.right, linkedlist)
*/