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
    public boolean isSymmetric(TreeNode root) {
        return symmetrycheck(root.left , root.right);
    }
    public boolean symmetrycheck(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null) return true;     // if both the trees are null then it is symmetric
        if(root1==null || root2==null) return false;    // if any one of the tree is null then it is not symmetric
        if(root1.val != root2.val) return false;
        return symmetrycheck(root1.left , root2.right) && symmetrycheck(root1.right,root2.left);  
    }
}