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
        if(root==null){
            return 0;
        }
        
        int leftDepth = maxDepth(root.left); //Recusively find depth of left sub tree
        int rightDepth = maxDepth(root.right); //Recursively find depth of right sub tree
        
        return 1 + Math.max(leftDepth,rightDepth);
    }
}