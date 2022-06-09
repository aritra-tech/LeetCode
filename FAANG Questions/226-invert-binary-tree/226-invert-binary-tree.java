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
        if(root==null){
            return null;
        }
        // traversing throught the left and right nodes of thee tree
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        // swapping the right and left nodes
        root.left = right;
        root.right = left;
        return root;
    }
}