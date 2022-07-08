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
    int answer = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        height(root);
        return answer;
    }
    
    public int height(TreeNode root){
        if(root==null) return -1;
        
        int left = height(root.left);
        int right = height(root.right);
        
        answer = Math.max(answer,left+right+2);
        
        return 1+Math.max(left,right);
    }
}